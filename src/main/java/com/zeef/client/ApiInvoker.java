package com.zeef.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;

public final class ApiInvoker {

	private static final ApiInvoker INSTANCE = new ApiInvoker();

	private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

	private final Map<String, String> defaultHeaders = new HashMap<>();
	private String apiBasePath = "https://zeef.io/api";

	private Client client;

	private ApiInvoker() {
		client = ClientBuilder.newClient();
	}

	public void addDefaultHeader(String key, String value) {
		readWriteLock.writeLock().lock();
		try {
			defaultHeaders.put(key, value);
		} finally {
			readWriteLock.writeLock().unlock();
		}
	}

	public String getApiBasePath() {
		readWriteLock.readLock().lock();
		try {
			return apiBasePath;
		} finally {
			readWriteLock.readLock().unlock();
		}
	}

	public void setApiBasePath(String apiBasePath) {
		readWriteLock.writeLock().lock();
		try {
			this.apiBasePath = apiBasePath;
		} finally {
			readWriteLock.writeLock().unlock();
		}
	}

	public static ApiInvoker getInstance() {
		return INSTANCE;
	}

	public <T> T invokeAPI(GenericType<T> returnType, String path, String method, Map<String, String> queryParams, Map<String, String> pathParams,
			Object postBody, Map<String, String> headerParams, String contentType) {

		readWriteLock.readLock().lock();
		try {
			T result = null;
			switch (method) {
				case "GET":
					result = get(returnType, path, method, pathParams, queryParams, headerParams);
					break;
				case "POST":
					result = post(returnType, path, method, pathParams, queryParams, postBody, headerParams, contentType);
					break;
				case "DELETE":
					result = delete(returnType, path, method, pathParams, queryParams, headerParams);
					break;
				default:
					throw new UnsupportedOperationException("Unsupported method type: " + method);
			}

			return result;
		} finally {
			readWriteLock.readLock().unlock();
		}
	}

	private <T> T delete(GenericType<T> returnType, String path, String method, Map<String, String> pathParams, Map<String, String> queryParams,
			Map<String, String> headerParams) {
		WebTarget webTarget = getWebTargetWithResolvedParams(path, pathParams, queryParams);

		Invocation.Builder invocationBuilder = webTarget.request();

		setHeaders(headerParams, invocationBuilder);

		if (returnType != null) {
			return invocationBuilder.delete(returnType);
		}

		invocationBuilder.delete();
		return null;
	}

	private <T> T post(GenericType<T> returnType, String path, String method, Map<String, String> pathParams, Map<String, String> queryParams,
			Object postBody, Map<String, String> headerParams, String contentType) {

		WebTarget webTarget = getWebTargetWithResolvedParams(path, pathParams, queryParams);

		Invocation.Builder invocationBuilder = webTarget.request();

		setHeaders(headerParams, invocationBuilder);


		Entity<?> entity = Entity.entity(postBody, contentType);

		if (returnType != null) {
			return invocationBuilder.post(entity, returnType);
		}

		invocationBuilder.post(entity);
		return null;
	}

	private <T> T get(GenericType<T> returnType, String path, String method, Map<String, String> pathParams, Map<String, String> queryParams,
			Map<String, String> headerParams) {

		WebTarget webTarget = getWebTargetWithResolvedParams(path, pathParams, queryParams);

		Invocation.Builder invocationBuilder = webTarget.request();

		setHeaders(headerParams, invocationBuilder);

		if (Void.class.equals(returnType)) {
			invocationBuilder.get();
			return null;
		}

		if (returnType != null) {
			return invocationBuilder.get(returnType);
		}

		invocationBuilder.get();
		return null;
	}

	private void setHeaders(Map<String, String> headerParams, Invocation.Builder invocationBuilder) {
		for (Entry<String, String> defaultHeaderEntry : defaultHeaders.entrySet()) {
			invocationBuilder.header(defaultHeaderEntry.getKey(), defaultHeaderEntry.getValue());
		}

		for (Entry<String, String> headerEntry : headerParams.entrySet()) {
			invocationBuilder.header(headerEntry.getKey(), headerEntry.getValue());
		}
	}

	private WebTarget getWebTargetWithResolvedParams(String path, Map<String, String> pathParams, Map<String, String> queryParams) {
		WebTarget webTarget = client.target(apiBasePath + path);

		for (Entry<String, String> entry : pathParams.entrySet()) {
			webTarget = webTarget.resolveTemplate(entry.getKey(), entry.getValue());
		}

		for (Entry<String, String> queryParamEntry : queryParams.entrySet()) {
			webTarget = webTarget.queryParam(queryParamEntry.getKey(), queryParamEntry.getValue());
		}
		return webTarget;
	}
}
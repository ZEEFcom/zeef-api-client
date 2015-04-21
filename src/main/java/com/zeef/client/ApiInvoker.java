package com.zeef.client;

/*
 * #%L
 * ZEEF API Client
 * ----------------------------------------
 * Copyright (C) 2015 ZEEF
 * ----------------------------------------
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import javax.ws.rs.client.*;
import javax.ws.rs.core.GenericType;

public final class ApiInvoker implements AutoCloseable {

	private static ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

	private static Map<String, String> defaultHeaders = new HashMap<>();
	private static String apiBasePath = "https://zeef.io/api";

	private Map<String, String> headers = new HashMap<>();

	private Client client;

	public ApiInvoker() {
		client = ClientBuilder.newClient();
	}

	public static void addDefaultHeader(String key, String value) {
		readWriteLock.writeLock().lock();
		try {
			defaultHeaders.put(key, value);
		}
		finally {
			readWriteLock.writeLock().unlock();
		}
	}

	public static String getApiBasePath() {
		readWriteLock.readLock().lock();
		try {
			return apiBasePath;
		}
		finally {
			readWriteLock.readLock().unlock();
		}
	}

	public static void setApiBasePath(String newApiBasePath) {
		readWriteLock.writeLock().lock();
		try {
			apiBasePath = newApiBasePath;
		}
		finally {
			readWriteLock.writeLock().unlock();
		}
	}

	public void addHeader(String key, String value) {
		headers.put(key, value);
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
		}
		finally {
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

		for (Entry<String, String> headerEntry : headers.entrySet()) {
			invocationBuilder.header(headerEntry.getKey(), headerEntry.getValue());
		}

		for (Entry<String, String> headerParamEntry : headerParams.entrySet()) {
			invocationBuilder.header(headerParamEntry.getKey(), headerParamEntry.getValue());
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

	@Override
	public void close() {
		client.close();
	}
}
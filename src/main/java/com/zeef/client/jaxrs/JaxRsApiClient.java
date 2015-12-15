package com.zeef.client.jaxrs;

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

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.GenericType;

import com.zeef.client.ApiClient;
import com.zeef.client.FormBody;
import com.zeef.client.ResponseType;

public class JaxRsApiClient implements ApiClient {

	private static final String DEFAULT_USER_AGENT = "ZEEF API Client 2015.8";

	private String apiBasePath = API_BASE_PATH;

	private Map<String, String> headers = new HashMap<>();

	private Client client;

	public JaxRsApiClient() {
		client = ClientBuilder.newClient();
		setUserAgent(DEFAULT_USER_AGENT);
	}

	@Override
	public void setApiBasePath(String apiBasePath) {
		this.apiBasePath = apiBasePath;
	}

	@Override
	public void setAccessToken(String token) {
		setHeader("Authorization", "OmniLogin auth=" + token);
	}

	@Override
	public void setUserAgent(String userAgent) {
		setHeader("User-Agent", userAgent);

	}

	@Override
	public void setHeader(String key, String value) {
		headers.put(key, value);
	}

	@Override
	public <T> T invokeAPI(ResponseType<T> responseType, String path, String method, Map<String, String> queryParams, Map<String, String> pathParams,
			Object postBody, Map<String, String> headerParams, String contentType) {

		GenericType<T> returnType = (responseType != null) ? new GenericType<T>(responseType.getType()) : null;

		T result;
		switch (method) {
			case "GET":
				result = get(returnType, path, pathParams, queryParams, headerParams);
				break;
			case "POST":
				result = post(returnType, path, pathParams, queryParams, postBody, headerParams, contentType);
				break;
			case "DELETE":
				result = delete(returnType, path, pathParams, queryParams, headerParams);
				break;
			default:
				throw new UnsupportedOperationException("Unsupported method type: " + method);
		}

		return result;
	}

	@Override
	public void close() {
		client.close();
	}

	private <T> T delete(GenericType<T> returnType, String path, Map<String, String> pathParams, Map<String, String> queryParams,
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

	private <T> T post(GenericType<T> returnType, String path, Map<String, String> pathParams, Map<String, String> queryParams,
			Object postBody, Map<String, String> headerParams, String contentType) {

		WebTarget webTarget = getWebTargetWithResolvedParams(path, pathParams, queryParams);

		Invocation.Builder invocationBuilder = webTarget.request();

		setHeaders(headerParams, invocationBuilder);

		Entity<?> entity;
		if (APPLICATION_FORM_URLENCODED.equals(contentType) && postBody instanceof FormBody) {
			Form form = new Form();

			for (Entry<String, String> formParameter : ((FormBody) postBody).entrySet()) {
				form.param(formParameter.getKey(), formParameter.getValue());
			}

			entity = Entity.entity(form, contentType);
		}
		else {
			entity = Entity.entity(postBody, contentType);
		}

		if (returnType != null) {
			return invocationBuilder.post(entity, returnType);
		}

		invocationBuilder.post(entity);
		return null;
	}

	private <T> T get(GenericType<T> returnType, String path, Map<String, String> pathParams, Map<String, String> queryParams,
			Map<String, String> headerParams) {

		WebTarget webTarget = getWebTargetWithResolvedParams(path, pathParams, queryParams);

		Invocation.Builder invocationBuilder = webTarget.request();

		setHeaders(headerParams, invocationBuilder);

		if (returnType != null && !Void.class.equals(returnType.getType())) {
			return invocationBuilder.get(returnType);
		}

		invocationBuilder.get();
		return null;
	}

	private void setHeaders(Map<String, String> headerParams, Invocation.Builder invocationBuilder) {
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
}

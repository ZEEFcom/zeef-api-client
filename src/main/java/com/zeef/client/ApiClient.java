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

import java.util.Map;

import javax.ws.rs.core.GenericType;

public interface ApiClient extends AutoCloseable {

	String API_BASE_PATH = "https://zeef.io/api";

	void setApiBasePath(String apiBasePath);

	void setAccessToken(String token);

	void setUserAgent(String userAgent);

	void setHeader(String key, String value);

	<T> T invokeAPI(GenericType<T> returnType, String path, String method, Map<String, String> queryParams, Map<String, String> pathParams,
			Object postBody, Map<String, String> headerParams, String contentType);

	@Override
	void close();

}

package com.zeef.client.api;

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

import javax.ws.rs.core.GenericType;

import com.zeef.client.ApiInvoker;
import com.zeef.client.model.User;

public class UserApi {

	private final ApiInvoker apiInvoker;


	public UserApi(ApiInvoker apiInvoker) {
		this.apiInvoker = apiInvoker;
	}


	/**
	 * Return the currently active user
	 *
	 * @return User
	 */
	public User getActiveUser() {


		Map<String, String> pathParams = new HashMap<>();
		Map<String, String> queryParams = new HashMap<>();
		Map<String, String> headerParams = new HashMap<>();


		return apiInvoker.invokeAPI(new GenericType<User>() {
		}, "/user/me", "GET", queryParams, pathParams, null, headerParams, null);

	}

}

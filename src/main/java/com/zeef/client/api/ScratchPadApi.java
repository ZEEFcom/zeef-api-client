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

import static com.zeef.client.ApiClient.APPLICATION_FORM_URLENCODED;
import static com.zeef.client.ApiClient.APPLICATION_JSON;

import java.util.HashMap;
import java.util.Map;

import com.zeef.client.ApiClient;
import com.zeef.client.FormBody;
import com.zeef.client.ResponseType;
import com.zeef.client.model.ScratchPad;

public class ScratchPadApi {

	private final ApiClient apiClient;


	public ScratchPadApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}


	/**
	 * Retrieve the scratch pad belonging to the current user
	 *
	 * @return ScratchPad
	 */
	public ScratchPad getMine() {


		Map<String, String> pathParams = new HashMap<>();
		Map<String, String> queryParams = new HashMap<>();
		Map<String, String> headerParams = new HashMap<>();


		return apiClient.invokeAPI(new ResponseType<ScratchPad>() {
		}, "/scratchPad/mine", "GET", queryParams, pathParams, null, headerParams, null);

	}

	/**
	 * Add a link to the scratch pad belonging to the current user
	 *
	 * @param url
	 * @return ScratchPad
	 */
	public ScratchPad addLink(String url) {

		Object postBody = null;


		Map<String, String> pathParams = new HashMap<>();
		Map<String, String> queryParams = new HashMap<>();
		Map<String, String> headerParams = new HashMap<>();


		String[] contentTypes = {
				"application/x-www-form-urlencoded"
		};

		String contentType = contentTypes.length > 0 ? contentTypes[0] : APPLICATION_JSON;


		if (contentType.equals(APPLICATION_FORM_URLENCODED)) {
			FormBody formBody = new FormBody();
			if (url != null) {
				formBody.put("url", ApiUtil.toString(url));
			}


			postBody = formBody;
		}


		return apiClient.invokeAPI(new ResponseType<ScratchPad>() {
		}, "/scratchPad/mine/addLink", "POST", queryParams, pathParams, postBody, headerParams, contentType);

	}

}

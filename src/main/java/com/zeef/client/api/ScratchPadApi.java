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

import static javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import javax.ws.rs.core.Form;
import javax.ws.rs.core.GenericType;

import com.zeef.client.ApiInvoker;
import com.zeef.client.model.ScratchPad;

public class ScratchPadApi {

	private final ApiInvoker apiInvoker;


	public ScratchPadApi(ApiInvoker apiInvoker) {
		this.apiInvoker = apiInvoker;
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


		return apiInvoker.invokeAPI(new GenericType<ScratchPad>() {
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
				"application/x-www-form-urlencoded",
		};

		String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";


		if (contentType.equals(APPLICATION_FORM_URLENCODED)) {
			Form form = new Form();
			if (url != null) {
				form.param("url", Objects.toString(url));
			}


			postBody = form;
		}


		return apiInvoker.invokeAPI(new GenericType<ScratchPad>() {
		}, "/scratchPad/mine/addLink", "POST", queryParams, pathParams, postBody, headerParams, contentType);

	}

}

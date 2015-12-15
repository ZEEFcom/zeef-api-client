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
import com.zeef.client.model.Link;
import com.zeef.client.model.TitleSuggestions;

public class LinkApi {

	private final ApiClient apiClient;


	public LinkApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}


	/**
	 * Retrieve a link by its ID
	 *
	 * @param id
	 * @return Link
	 */
	public Link getByID(Long id) {


		Map<String, String> pathParams = new HashMap<>();
		Map<String, String> queryParams = new HashMap<>();
		Map<String, String> headerParams = new HashMap<>();


		pathParams.put("id", ApiUtil.toString(id));


		return apiClient.invokeAPI(new ResponseType<Link>() {
		}, "/link/{id}", "GET", queryParams, pathParams, null, headerParams, null);

	}

	/**
	 * Update a link
	 *
	 * @param id
	 * @param url
	 * @param title
	 * @param description
	 * @return Link
	 */
	public Link update(Long id, String url, String title, String description) {

		Object postBody = null;


		Map<String, String> pathParams = new HashMap<>();
		Map<String, String> queryParams = new HashMap<>();
		Map<String, String> headerParams = new HashMap<>();


		pathParams.put("id", ApiUtil.toString(id));


		String[] contentTypes = {
				"application/x-www-form-urlencoded"
		};

		String contentType = contentTypes.length > 0 ? contentTypes[0] : APPLICATION_JSON;


		if (contentType.equals(APPLICATION_FORM_URLENCODED)) {
			FormBody formBody = new FormBody();
			if (url != null) {
				formBody.put("url", ApiUtil.toString(url));
			}

			if (title != null) {
				formBody.put("title", ApiUtil.toString(title));
			}

			if (description != null) {
				formBody.put("description", ApiUtil.toString(description));
			}


			postBody = formBody;
		}


		return apiClient.invokeAPI(new ResponseType<Link>() {
		}, "/link/{id}", "POST", queryParams, pathParams, postBody, headerParams, contentType);

	}

	/**
	 * Delete a link
	 *
	 * @param id
	 */
	public void delete(Long id) {


		Map<String, String> pathParams = new HashMap<>();
		Map<String, String> queryParams = new HashMap<>();
		Map<String, String> headerParams = new HashMap<>();


		pathParams.put("id", ApiUtil.toString(id));


		apiClient.invokeAPI(null, "/link/{id}", "DELETE", queryParams, pathParams, null, headerParams, null);
	}

	/**
	 * Retrieve title suggestions for a link
	 *
	 * @param id
	 * @return TitleSuggestions
	 */
	public TitleSuggestions getTitleSuggestionsById(Long id) {


		Map<String, String> pathParams = new HashMap<>();
		Map<String, String> queryParams = new HashMap<>();
		Map<String, String> headerParams = new HashMap<>();


		pathParams.put("id", ApiUtil.toString(id));


		return apiClient.invokeAPI(new ResponseType<TitleSuggestions>() {
		}, "/link/{id}/titleSuggestions", "GET", queryParams, pathParams, null, headerParams, null);

	}

}

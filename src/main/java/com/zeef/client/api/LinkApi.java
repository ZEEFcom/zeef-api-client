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
import com.zeef.client.model.Link;

public class LinkApi {

	private final ApiInvoker apiInvoker;


	public LinkApi(ApiInvoker apiInvoker) {
		this.apiInvoker = apiInvoker;
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


		return apiInvoker.invokeAPI(new GenericType<Link>() {
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

		String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";


		if (contentType.equals(APPLICATION_FORM_URLENCODED)) {
			Form form = new Form();
			if (url != null) {
				form.param("url", Objects.toString(url));
			}

			if (title != null) {
				form.param("title", Objects.toString(title));
			}

			if (description != null) {
				form.param("description", Objects.toString(description));
			}


			postBody = form;
		}


		return apiInvoker.invokeAPI(new GenericType<Link>() {
		}, "/link/{id}", "POST", queryParams, pathParams, postBody, headerParams, contentType);

	}

	/**
	 * Delete a link
	 *
	 * @param id
	 * @return void
	 */
	public void delete(Long id) {


		Map<String, String> pathParams = new HashMap<>();
		Map<String, String> queryParams = new HashMap<>();
		Map<String, String> headerParams = new HashMap<>();


		pathParams.put("id", ApiUtil.toString(id));


		apiInvoker.invokeAPI(null, "/link/{id}", "DELETE", queryParams, pathParams, null, headerParams, null);
	}

}

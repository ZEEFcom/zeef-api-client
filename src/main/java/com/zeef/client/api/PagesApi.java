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
import com.zeef.client.model.Page;
import com.zeef.client.model.Page.PageTypeEnum;
import com.zeef.client.model.PagesOverview;

public class PagesApi {

	private final ApiInvoker apiInvoker;

	public PagesApi(ApiInvoker apiInvoker) {
		this.apiInvoker = apiInvoker;
	}

	/**
	 * Return all international pages
	 *
	 * @param type
	 * @return PagesOverview
	 */
	public PagesOverview getAllInternationalPages(PageTypeEnum type) {
		Object postBody = null;


		Map<String, String> pathParams = new HashMap<>();
		Map<String, String> queryParams = new HashMap<>();
		Map<String, String> headerParams = new HashMap<>();

		if (type != null) {
			queryParams.put("type", Objects.toString(type));
		}


		String[] contentTypes = {
				"application/x-www-form-urlencoded",
		};

		String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

		if (contentType.equals(APPLICATION_FORM_URLENCODED)) {
			Form form = new Form();

			postBody = form;
		}

		return apiInvoker.invokeAPI(new GenericType<PagesOverview>() {
		}, "/pages/all", "GET", queryParams, pathParams, postBody, headerParams, contentType);

	}

	/**
	 * Return all pages for a given region
	 *
	 * @param regionCode
	 * @param type
	 * @return PagesOverview
	 */
	public PagesOverview getAllPagesByRegion(String regionCode, PageTypeEnum type) {
		Object postBody = null;


		Map<String, String> pathParams = new HashMap<>();
		Map<String, String> queryParams = new HashMap<>();
		Map<String, String> headerParams = new HashMap<>();

		if (type != null) {
			queryParams.put("type", Objects.toString(type));
		}


		pathParams.put("regionCode", Objects.toString(regionCode));


		String[] contentTypes = {
				"application/x-www-form-urlencoded",
		};

		String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

		if (contentType.equals(APPLICATION_FORM_URLENCODED)) {
			Form form = new Form();

			postBody = form;
		}

		return apiInvoker.invokeAPI(new GenericType<PagesOverview>() {
		}, "/pages/all/{regionCode}", "GET", queryParams, pathParams, postBody, headerParams, contentType);

	}

	/**
	 * Return all pages owned by the current user
	 *
	 * @return PagesOverview
	 */
	public PagesOverview getMyPages() {
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

			postBody = form;
		}

		return apiInvoker.invokeAPI(new GenericType<PagesOverview>() {
		}, "/pages/mine", "GET", queryParams, pathParams, postBody, headerParams, contentType);

	}

}

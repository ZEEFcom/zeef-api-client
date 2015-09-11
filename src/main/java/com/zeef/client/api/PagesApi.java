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
import com.zeef.client.model.PagesOverview;

public class PagesApi {

	private final ApiInvoker apiInvoker;


	public PagesApi(ApiInvoker apiInvoker) {
		this.apiInvoker = apiInvoker;
	}


	/**
	 * Return all international pages
	 *
	 * @return PagesOverview
	 */
	public PagesOverview getAllInternationalPages() {


		Map<String, String> pathParams = new HashMap<>();
		Map<String, String> queryParams = new HashMap<>();
		Map<String, String> headerParams = new HashMap<>();


		return apiInvoker.invokeAPI(new GenericType<PagesOverview>() {
		}, "/pages/all", "GET", queryParams, pathParams, null, headerParams, null);

	}

	/**
	 * Return all pages for a given region
	 *
	 * @param regionCode
	 * @return PagesOverview
	 */
	public PagesOverview getAllPagesByRegion(String regionCode) {


		Map<String, String> pathParams = new HashMap<>();
		Map<String, String> queryParams = new HashMap<>();
		Map<String, String> headerParams = new HashMap<>();


		pathParams.put("regionCode", ApiUtil.toString(regionCode));


		return apiInvoker.invokeAPI(new GenericType<PagesOverview>() {
		}, "/pages/all/{regionCode}", "GET", queryParams, pathParams, null, headerParams, null);

	}

	/**
	 * Return all pages owned by the current user
	 *
	 * @return PagesOverview
	 */
	public PagesOverview getMyPages() {


		Map<String, String> pathParams = new HashMap<>();
		Map<String, String> queryParams = new HashMap<>();
		Map<String, String> headerParams = new HashMap<>();


		return apiInvoker.invokeAPI(new GenericType<PagesOverview>() {
		}, "/pages/mine", "GET", queryParams, pathParams, null, headerParams, null);

	}

	/**
	 * Search for pages
	 *
	 * @param query
	 * @param maxResults
	 * @param firstResult
	 * @param preferredLanguageCode
	 * @return PagesOverview
	 */
	public PagesOverview search(String query, Integer maxResults, Integer firstResult, String preferredLanguageCode) {


		Map<String, String> pathParams = new HashMap<>();
		Map<String, String> queryParams = new HashMap<>();
		Map<String, String> headerParams = new HashMap<>();

		if (query != null) {
			queryParams.put("query", ApiUtil.toString(query));
		}

		if (maxResults != null) {
			queryParams.put("maxResults", ApiUtil.toString(maxResults));
		}

		if (firstResult != null) {
			queryParams.put("firstResult", ApiUtil.toString(firstResult));
		}

		if (preferredLanguageCode != null) {
			queryParams.put("preferredLanguageCode", ApiUtil.toString(preferredLanguageCode));
		}


		return apiInvoker.invokeAPI(new GenericType<PagesOverview>() {
		}, "/pages/search", "GET", queryParams, pathParams, null, headerParams, null);

	}

}

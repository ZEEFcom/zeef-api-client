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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import javax.ws.rs.core.GenericType;

import com.zeef.client.ApiClient;
import com.zeef.client.model.Activities;

public class ActivitiesApi {

	private final ApiClient apiClient;


	public enum OutputFormat {
		MARKDOWN("MARKDOWN"),
		HTML("HTML"),
		PLAIN_TEXT("PLAIN_TEXT"),;
		private final String value;

		private OutputFormat(String value) {
			this.value = value;
		}

		public String toString() {
			return "" + value;
		}

		public static OutputFormat getByValue(String value) {
			for (OutputFormat item : OutputFormat.values()) {
				if (Objects.equals(item.value, value)) {
					return item;
				}
			}

			return null;
		}

	}


	public ActivitiesApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}


	/**
	 * Retrieve the activities followed by the current user or something
	 *
	 * @param since
	 * @param before
	 * @param maxItems
	 * @param outputFormat
	 * @return Activities
	 */
	public Activities getFollowedActivities(Date since, Date before, Integer maxItems, OutputFormat outputFormat) {


		Map<String, String> pathParams = new HashMap<>();
		Map<String, String> queryParams = new HashMap<>();
		Map<String, String> headerParams = new HashMap<>();

		if (since != null) {
			queryParams.put("since", ApiUtil.toString(since));
		}

		if (before != null) {
			queryParams.put("before", ApiUtil.toString(before));
		}

		if (maxItems != null) {
			queryParams.put("maxItems", ApiUtil.toString(maxItems));
		}

		if (outputFormat != null) {
			queryParams.put("outputFormat", ApiUtil.toString(outputFormat));
		}


		return apiClient.invokeAPI(new GenericType<Activities>() {
		}, "/activities/followed", "GET", queryParams, pathParams, null, headerParams, null);

	}

	/**
	 * Retrieve the overview of activities for a specific page
	 *
	 * @param id
	 * @param since
	 * @param before
	 * @param maxItems
	 * @param outputFormat
	 * @return Activities
	 */
	public Activities getPageActivities(Long id, Date since, Date before, Integer maxItems, OutputFormat outputFormat) {


		Map<String, String> pathParams = new HashMap<>();
		Map<String, String> queryParams = new HashMap<>();
		Map<String, String> headerParams = new HashMap<>();

		if (since != null) {
			queryParams.put("since", ApiUtil.toString(since));
		}

		if (before != null) {
			queryParams.put("before", ApiUtil.toString(before));
		}

		if (maxItems != null) {
			queryParams.put("maxItems", ApiUtil.toString(maxItems));
		}

		if (outputFormat != null) {
			queryParams.put("outputFormat", ApiUtil.toString(outputFormat));
		}


		pathParams.put("id", ApiUtil.toString(id));


		return apiClient.invokeAPI(new GenericType<Activities>() {
		}, "/activities/page/{id}", "GET", queryParams, pathParams, null, headerParams, null);

	}

	/**
	 * Retrieve the overview of activities for a specific user
	 *
	 * @param id
	 * @param since
	 * @param before
	 * @param maxItems
	 * @param outputFormat
	 * @return Activities
	 */
	public Activities getUserActivities(Long id, Date since, Date before, Integer maxItems, OutputFormat outputFormat) {


		Map<String, String> pathParams = new HashMap<>();
		Map<String, String> queryParams = new HashMap<>();
		Map<String, String> headerParams = new HashMap<>();

		if (since != null) {
			queryParams.put("since", ApiUtil.toString(since));
		}

		if (before != null) {
			queryParams.put("before", ApiUtil.toString(before));
		}

		if (maxItems != null) {
			queryParams.put("maxItems", ApiUtil.toString(maxItems));
		}

		if (outputFormat != null) {
			queryParams.put("outputFormat", ApiUtil.toString(outputFormat));
		}


		pathParams.put("id", ApiUtil.toString(id));


		return apiClient.invokeAPI(new GenericType<Activities>() {
		}, "/activities/user/{id}", "GET", queryParams, pathParams, null, headerParams, null);

	}

}

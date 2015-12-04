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
import java.util.Objects;

import com.zeef.client.ApiClient;
import com.zeef.client.FormBody;
import com.zeef.client.ResponseType;
import com.zeef.client.model.Page;

public class PageApi {

	private final ApiClient apiClient;


	public enum UserCreatableBlockType {
		LINK("LINK"),
		TEXT("TEXT"),
		FEED("FEED"),
		IMAGE("IMAGE"),
		LATEST_PAGES("LATEST_PAGES"),;
		private final String value;

		private UserCreatableBlockType(String value) {
			this.value = value;
		}

		public String toString() {
			return "" + value;
		}

		public static UserCreatableBlockType getByValue(String value) {
			for (UserCreatableBlockType item : UserCreatableBlockType.values()) {
				if (Objects.equals(item.value, value)) {
					return item;
				}
			}

			return null;
		}

	}


	public PageApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}


	/**
	 * Create a new page
	 *
	 * @param displayName
	 * @param languageCode
	 * @return Page
	 */
	public Page create(String displayName, String languageCode) {

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
			if (displayName != null) {
				formBody.put("displayName", ApiUtil.toString(displayName));
			}

			if (languageCode != null) {
				formBody.put("languageCode", ApiUtil.toString(languageCode));
			}


			postBody = formBody;
		}


		return apiClient.invokeAPI(new ResponseType<Page>() {
		}, "/page/create", "POST", queryParams, pathParams, postBody, headerParams, contentType);

	}

	/**
	 * Retrieve a page
	 *
	 * @param alias
	 * @param username
	 * @return Page
	 */
	public Page getPageByAliasAndUsername(String alias, String username) {


		Map<String, String> pathParams = new HashMap<>();
		Map<String, String> queryParams = new HashMap<>();
		Map<String, String> headerParams = new HashMap<>();


		pathParams.put("alias", ApiUtil.toString(alias));

		pathParams.put("username", ApiUtil.toString(username));


		return apiClient.invokeAPI(new ResponseType<Page>() {
		}, "/page/{alias}/{username}", "GET", queryParams, pathParams, null, headerParams, null);

	}

	/**
	 * Retrieve a page
	 *
	 * @param alias
	 * @param username
	 * @param region
	 * @return Page
	 */
	public Page getPageByAliasUsernameAndRegion(String alias, String username, String region) {


		Map<String, String> pathParams = new HashMap<>();
		Map<String, String> queryParams = new HashMap<>();
		Map<String, String> headerParams = new HashMap<>();


		pathParams.put("alias", ApiUtil.toString(alias));

		pathParams.put("username", ApiUtil.toString(username));

		pathParams.put("region", ApiUtil.toString(region));


		return apiClient.invokeAPI(new ResponseType<Page>() {
		}, "/page/{alias}/{username}/{region}", "GET", queryParams, pathParams, null, headerParams, null);

	}

	/**
	 * Retrieve a page
	 *
	 * @param id
	 * @return Page
	 */
	public Page getPageByID(Long id) {


		Map<String, String> pathParams = new HashMap<>();
		Map<String, String> queryParams = new HashMap<>();
		Map<String, String> headerParams = new HashMap<>();


		pathParams.put("id", ApiUtil.toString(id));


		return apiClient.invokeAPI(new ResponseType<Page>() {
		}, "/page/{id}", "GET", queryParams, pathParams, null, headerParams, null);

	}

	/**
	 * Update a page
	 *
	 * @param id
	 * @param markdownDescription
	 * @return Page
	 */
	public Page updatePage(Long id, String markdownDescription) {

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
			if (markdownDescription != null) {
				formBody.put("markdownDescription", ApiUtil.toString(markdownDescription));
			}


			postBody = formBody;
		}


		return apiClient.invokeAPI(new ResponseType<Page>() {
		}, "/page/{id}", "POST", queryParams, pathParams, postBody, headerParams, contentType);

	}

	/**
	 * Add a block
	 *
	 * @param id
	 * @param blockType
	 * @param title
	 * @param columnIndex
	 * @param publiclyVisible
	 * @param promoted
	 * @return Page
	 */
	public Page addBlock(Long id, UserCreatableBlockType blockType, String title, Integer columnIndex, Boolean publiclyVisible, Boolean promoted) {

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
			if (blockType != null) {
				formBody.put("blockType", ApiUtil.toString(blockType));
			}

			if (title != null) {
				formBody.put("title", ApiUtil.toString(title));
			}

			if (columnIndex != null) {
				formBody.put("columnIndex", ApiUtil.toString(columnIndex));
			}

			if (publiclyVisible != null) {
				formBody.put("publiclyVisible", ApiUtil.toString(publiclyVisible));
			}

			if (promoted != null) {
				formBody.put("promoted", ApiUtil.toString(promoted));
			}


			postBody = formBody;
		}


		return apiClient.invokeAPI(new ResponseType<Page>() {
		}, "/page/{id}/addBlock", "POST", queryParams, pathParams, postBody, headerParams, contentType);

	}

	/**
	 * Request publication of a page
	 *
	 * @param id
	 */
	public void requestPublication(Long id) {


		Map<String, String> pathParams = new HashMap<>();
		Map<String, String> queryParams = new HashMap<>();
		Map<String, String> headerParams = new HashMap<>();


		pathParams.put("id", ApiUtil.toString(id));


		apiClient.invokeAPI(null, "/page/{id}/requestPublication", "POST", queryParams, pathParams, null, headerParams, null);
	}

}

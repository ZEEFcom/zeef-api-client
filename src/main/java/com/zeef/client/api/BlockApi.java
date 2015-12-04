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
import com.zeef.client.model.Block;

public class BlockApi {

	private final ApiClient apiClient;


	public BlockApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}


	/**
	 * Retrieve a block
	 *
	 * @param id
	 * @return Block
	 */
	public Block getByBlockID(Long id) {


		Map<String, String> pathParams = new HashMap<>();
		Map<String, String> queryParams = new HashMap<>();
		Map<String, String> headerParams = new HashMap<>();


		pathParams.put("id", ApiUtil.toString(id));


		return apiClient.invokeAPI(new ResponseType<Block>() {
		}, "/block/{id}", "GET", queryParams, pathParams, null, headerParams, null);

	}

	/**
	 * Update a block
	 *
	 * @param id
	 * @param title
	 * @param promoted
	 * @param publiclyVisible
	 * @param markdownText           (Text blocks only)
	 * @param markdownDescription    (Link blocks only)
	 * @param feedURL                (Feed blocks only)
	 * @param maxLinks               (Feed blocks only)
	 * @param refreshIntervalMinutes (Feed blocks only)
	 * @return Block
	 */
	public Block updateBlock(Long id, String title, Boolean promoted, Boolean publiclyVisible, String markdownText, String markdownDescription,
			String feedURL, Integer maxLinks, Integer refreshIntervalMinutes) {

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
			if (title != null) {
				formBody.put("title", ApiUtil.toString(title));
			}

			if (promoted != null) {
				formBody.put("promoted", ApiUtil.toString(promoted));
			}

			if (publiclyVisible != null) {
				formBody.put("publiclyVisible", ApiUtil.toString(publiclyVisible));
			}

			if (markdownText != null) {
				formBody.put("markdownText", ApiUtil.toString(markdownText));
			}

			if (markdownDescription != null) {
				formBody.put("markdownDescription", ApiUtil.toString(markdownDescription));
			}

			if (feedURL != null) {
				formBody.put("feedURL", ApiUtil.toString(feedURL));
			}

			if (maxLinks != null) {
				formBody.put("maxLinks", ApiUtil.toString(maxLinks));
			}

			if (refreshIntervalMinutes != null) {
				formBody.put("refreshIntervalMinutes", ApiUtil.toString(refreshIntervalMinutes));
			}


			postBody = formBody;
		}


		return apiClient.invokeAPI(new ResponseType<Block>() {
		}, "/block/{id}", "POST", queryParams, pathParams, postBody, headerParams, contentType);

	}

	/**
	 * Delete a block
	 *
	 * @param id
	 */
	public void deleteBlockByID(Long id) {


		Map<String, String> pathParams = new HashMap<>();
		Map<String, String> queryParams = new HashMap<>();
		Map<String, String> headerParams = new HashMap<>();


		pathParams.put("id", ApiUtil.toString(id));


		apiClient.invokeAPI(null, "/block/{id}", "DELETE", queryParams, pathParams, null, headerParams, null);
	}

	/**
	 * Add a link to a block
	 *
	 * @param id
	 * @param url
	 * @param title
	 * @param description
	 * @param ranking
	 * @return Block
	 */
	public Block addLink(Long id, String url, String title, String description, Integer ranking) {

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

			if (ranking != null) {
				formBody.put("ranking", ApiUtil.toString(ranking));
			}


			postBody = formBody;
		}


		return apiClient.invokeAPI(new ResponseType<Block>() {
		}, "/block/{id}/addLink", "POST", queryParams, pathParams, postBody, headerParams, contentType);

	}

	/**
	 * Move a link within a block
	 *
	 * @param id
	 * @param linkID
	 * @param newPosition
	 * @return Block
	 */
	public Block moveLink(Long id, Long linkID, Integer newPosition) {

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
			if (linkID != null) {
				formBody.put("linkID", ApiUtil.toString(linkID));
			}

			if (newPosition != null) {
				formBody.put("newPosition", ApiUtil.toString(newPosition));
			}


			postBody = formBody;
		}


		return apiClient.invokeAPI(new ResponseType<Block>() {
		}, "/block/{id}/moveLink", "POST", queryParams, pathParams, postBody, headerParams, contentType);

	}

}

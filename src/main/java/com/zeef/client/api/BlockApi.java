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
import com.zeef.client.model.Block;

public class BlockApi {

	private final ApiInvoker apiInvoker;


	public BlockApi(ApiInvoker apiInvoker) {
		this.apiInvoker = apiInvoker;
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


		return apiInvoker.invokeAPI(new GenericType<Block>() {
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

		String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";


		if (contentType.equals(APPLICATION_FORM_URLENCODED)) {
			Form form = new Form();
			if (title != null) {
				form.param("title", Objects.toString(title));
			}

			if (promoted != null) {
				form.param("promoted", Objects.toString(promoted));
			}

			if (publiclyVisible != null) {
				form.param("publiclyVisible", Objects.toString(publiclyVisible));
			}

			if (markdownText != null) {
				form.param("markdownText", Objects.toString(markdownText));
			}

			if (markdownDescription != null) {
				form.param("markdownDescription", Objects.toString(markdownDescription));
			}

			if (feedURL != null) {
				form.param("feedURL", Objects.toString(feedURL));
			}

			if (maxLinks != null) {
				form.param("maxLinks", Objects.toString(maxLinks));
			}

			if (refreshIntervalMinutes != null) {
				form.param("refreshIntervalMinutes", Objects.toString(refreshIntervalMinutes));
			}


			postBody = form;
		}


		return apiInvoker.invokeAPI(new GenericType<Block>() {
		}, "/block/{id}", "POST", queryParams, pathParams, postBody, headerParams, contentType);

	}

	/**
	 * Delete a block
	 *
	 * @param id
	 * @return void
	 */
	public void deleteBlockByID(Long id) {


		Map<String, String> pathParams = new HashMap<>();
		Map<String, String> queryParams = new HashMap<>();
		Map<String, String> headerParams = new HashMap<>();


		pathParams.put("id", ApiUtil.toString(id));


		apiInvoker.invokeAPI(null, "/block/{id}", "DELETE", queryParams, pathParams, null, headerParams, null);
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

			if (ranking != null) {
				form.param("ranking", Objects.toString(ranking));
			}


			postBody = form;
		}


		return apiInvoker.invokeAPI(new GenericType<Block>() {
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

		String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";


		if (contentType.equals(APPLICATION_FORM_URLENCODED)) {
			Form form = new Form();
			if (linkID != null) {
				form.param("linkID", Objects.toString(linkID));
			}

			if (newPosition != null) {
				form.param("newPosition", Objects.toString(newPosition));
			}


			postBody = form;
		}


		return apiInvoker.invokeAPI(new GenericType<Block>() {
		}, "/block/{id}/moveLink", "POST", queryParams, pathParams, postBody, headerParams, contentType);

	}

}

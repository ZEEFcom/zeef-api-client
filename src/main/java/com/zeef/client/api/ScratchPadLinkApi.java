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
import com.zeef.client.model.ScratchPadLink;
import com.zeef.client.model.TitleSuggestions;

public class ScratchPadLinkApi {

	private final ApiClient apiClient;


	public ScratchPadLinkApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}


	/**
	 * Retrieve a scratch pad link
	 *
	 * @param id
	 * @return ScratchPadLink
	 */
	public ScratchPadLink getById(Long id) {


		Map<String, String> pathParams = new HashMap<>();
		Map<String, String> queryParams = new HashMap<>();
		Map<String, String> headerParams = new HashMap<>();


		pathParams.put("id", ApiUtil.toString(id));


		return apiClient.invokeAPI(new ResponseType<ScratchPadLink>() {
		}, "/scratchPadLink/{id}", "GET", queryParams, pathParams, null, headerParams, null);

	}

	/**
	 * Delete a scratch pad link
	 *
	 * @param id
	 */
	public void delete(Long id) {


		Map<String, String> pathParams = new HashMap<>();
		Map<String, String> queryParams = new HashMap<>();
		Map<String, String> headerParams = new HashMap<>();


		pathParams.put("id", ApiUtil.toString(id));


		apiClient.invokeAPI(null, "/scratchPadLink/{id}", "DELETE", queryParams, pathParams, null, headerParams, null);
	}

	/**
	 * Move a link from the scratch pad to a block
	 *
	 * @param id
	 * @param blockId
	 * @param title
	 * @param description
	 * @param ranking
	 */
	public void moveToBlock(Long id, Long blockId, String title, String description, Integer ranking) {

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
			if (blockId != null) {
				formBody.put("blockId", ApiUtil.toString(blockId));
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


		apiClient.invokeAPI(null, "/scratchPadLink/{id}/moveToBlock", "POST", queryParams, pathParams, postBody, headerParams, contentType);
	}

	/**
	 * Retrieve title suggestions for a scratch pad link
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
		}, "/scratchPadLink/{id}/titleSuggestions", "GET", queryParams, pathParams, null, headerParams, null);

	}

}

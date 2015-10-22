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
import com.zeef.client.model.ScratchPadLink;
import com.zeef.client.model.TitleSuggestions;

public class ScratchPadLinkApi {

	private final ApiInvoker apiInvoker;


	public ScratchPadLinkApi(ApiInvoker apiInvoker) {
		this.apiInvoker = apiInvoker;
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


		return apiInvoker.invokeAPI(new GenericType<ScratchPadLink>() {
		}, "/scratchPadLink/{id}", "GET", queryParams, pathParams, null, headerParams, null);

	}

	/**
	 * Delete a scratch pad link
	 *
	 * @param id
	 * @return void
	 */
	public void delete(Long id) {


		Map<String, String> pathParams = new HashMap<>();
		Map<String, String> queryParams = new HashMap<>();
		Map<String, String> headerParams = new HashMap<>();


		pathParams.put("id", ApiUtil.toString(id));


		apiInvoker.invokeAPI(null, "/scratchPadLink/{id}", "DELETE", queryParams, pathParams, null, headerParams, null);
	}

	/**
	 * Move a link from the scratch pad to a block
	 *
	 * @param id
	 * @param blockId
	 * @param title
	 * @param description
	 * @param ranking
	 * @return void
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

		String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";


		if (contentType.equals(APPLICATION_FORM_URLENCODED)) {
			Form form = new Form();
			if (blockId != null) {
				form.param("blockId", Objects.toString(blockId));
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


		apiInvoker.invokeAPI(null, "/scratchPadLink/{id}/moveToBlock", "POST", queryParams, pathParams, postBody, headerParams, contentType);
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


		return apiInvoker.invokeAPI(new GenericType<TitleSuggestions>() {
		}, "/scratchPadLink/{id}/titleSuggestions", "GET", queryParams, pathParams, null, headerParams, null);

	}

}

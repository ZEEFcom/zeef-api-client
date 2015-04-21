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
import com.zeef.client.model.BlockType;
import com.zeef.client.model.Page;
import com.zeef.client.model.Page.PageTypeEnum;

public class PageApi {

	private final ApiInvoker apiInvoker;

	public PageApi(ApiInvoker apiInvoker) {
		this.apiInvoker = apiInvoker;
	}

	/**
	 * Create a new page
	 *
	 * @param displayName
	 * @param languageCode
	 * @param type
	 * @return Page
	 */
	public Page create(String displayName, String languageCode, PageTypeEnum type) {
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
			if (displayName != null) {
				form.param("displayName", Objects.toString(displayName));
			}

			if (languageCode != null) {
				form.param("languageCode", Objects.toString(languageCode));
			}

			if (type != null) {
				form.param("type", Objects.toString(type));
			}


			postBody = form;
		}

		return apiInvoker.invokeAPI(new GenericType<Page>() {
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
		Object postBody = null;


		Map<String, String> pathParams = new HashMap<>();
		Map<String, String> queryParams = new HashMap<>();
		Map<String, String> headerParams = new HashMap<>();


		pathParams.put("alias", Objects.toString(alias));

		pathParams.put("username", Objects.toString(username));


		String[] contentTypes = {
				"application/x-www-form-urlencoded",
		};

		String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

		if (contentType.equals(APPLICATION_FORM_URLENCODED)) {
			Form form = new Form();

			postBody = form;
		}

		return apiInvoker.invokeAPI(new GenericType<Page>() {
		}, "/page/{alias}/{username}", "GET", queryParams, pathParams, postBody, headerParams, contentType);

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
		Object postBody = null;


		Map<String, String> pathParams = new HashMap<>();
		Map<String, String> queryParams = new HashMap<>();
		Map<String, String> headerParams = new HashMap<>();


		pathParams.put("alias", Objects.toString(alias));

		pathParams.put("username", Objects.toString(username));

		pathParams.put("region", Objects.toString(region));


		String[] contentTypes = {
				"application/x-www-form-urlencoded",
		};

		String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

		if (contentType.equals(APPLICATION_FORM_URLENCODED)) {
			Form form = new Form();

			postBody = form;
		}

		return apiInvoker.invokeAPI(new GenericType<Page>() {
		}, "/page/{alias}/{username}/{region}", "GET", queryParams, pathParams, postBody, headerParams, contentType);

	}

	/**
	 * Retrieve a page
	 *
	 * @param id
	 * @return Page
	 */
	public Page getPageByID(Long id) {
		Object postBody = null;


		Map<String, String> pathParams = new HashMap<>();
		Map<String, String> queryParams = new HashMap<>();
		Map<String, String> headerParams = new HashMap<>();


		pathParams.put("id", Objects.toString(id));


		String[] contentTypes = {
				"application/x-www-form-urlencoded",
		};

		String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

		if (contentType.equals(APPLICATION_FORM_URLENCODED)) {
			Form form = new Form();

			postBody = form;
		}

		return apiInvoker.invokeAPI(new GenericType<Page>() {
		}, "/page/{id}", "GET", queryParams, pathParams, postBody, headerParams, contentType);

	}

	/**
	 * Update a page
	 *
	 * @param id
	 * @param type
	 * @param markdownDescription
	 * @return Page
	 */
	public Page updatePage(Long id, String type, String markdownDescription) {
		Object postBody = null;


		Map<String, String> pathParams = new HashMap<>();
		Map<String, String> queryParams = new HashMap<>();
		Map<String, String> headerParams = new HashMap<>();


		pathParams.put("id", Objects.toString(id));


		String[] contentTypes = {
				"application/x-www-form-urlencoded",
		};

		String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

		if (contentType.equals(APPLICATION_FORM_URLENCODED)) {
			Form form = new Form();
			if (type != null) {
				form.param("type", Objects.toString(type));
			}

			if (markdownDescription != null) {
				form.param("markdownDescription", Objects.toString(markdownDescription));
			}


			postBody = form;
		}

		return apiInvoker.invokeAPI(new GenericType<Page>() {
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
	public Page addBlock(Long id, BlockType blockType, String title, Integer columnIndex, Boolean publiclyVisible, Boolean promoted) {
		Object postBody = null;


		Map<String, String> pathParams = new HashMap<>();
		Map<String, String> queryParams = new HashMap<>();
		Map<String, String> headerParams = new HashMap<>();


		pathParams.put("id", Objects.toString(id));


		String[] contentTypes = {
				"application/x-www-form-urlencoded",
		};

		String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

		if (contentType.equals(APPLICATION_FORM_URLENCODED)) {
			Form form = new Form();
			if (blockType != null) {
				form.param("blockType", Objects.toString(blockType));
			}

			if (title != null) {
				form.param("title", Objects.toString(title));
			}

			if (columnIndex != null) {
				form.param("columnIndex", Objects.toString(columnIndex));
			}

			if (publiclyVisible != null) {
				form.param("publiclyVisible", Objects.toString(publiclyVisible));
			}

			if (promoted != null) {
				form.param("promoted", Objects.toString(promoted));
			}


			postBody = form;
		}

		return apiInvoker.invokeAPI(new GenericType<Page>() {
		}, "/page/{id}/addBlock", "POST", queryParams, pathParams, postBody, headerParams, contentType);

	}

	/**
	 * Request publication of a page
	 *
	 * @param id
	 * @return void
	 */
	public void requestPublication(Long id) {
		Object postBody = null;


		Map<String, String> pathParams = new HashMap<>();
		Map<String, String> queryParams = new HashMap<>();
		Map<String, String> headerParams = new HashMap<>();


		pathParams.put("id", Objects.toString(id));


		String[] contentTypes = {
				"application/x-www-form-urlencoded",
		};

		String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

		if (contentType.equals(APPLICATION_FORM_URLENCODED)) {
			Form form = new Form();

			postBody = form;
		}


		apiInvoker.invokeAPI(null, "/page/{id}/requestPublication", "POST", queryParams, pathParams, postBody, headerParams, contentType);
	}

}

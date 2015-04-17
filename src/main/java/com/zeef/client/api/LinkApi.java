package com.zeef.client.api;

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

		return apiInvoker.invokeAPI(new GenericType<Link>() {
		}, "/link/{id}", "GET", queryParams, pathParams, postBody, headerParams, contentType);

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


		pathParams.put("id", Objects.toString(id));


		String[] contentTypes = {
				"application/x-www-form-urlencoded",
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


		apiInvoker.invokeAPI(null, "/link/{id}", "DELETE", queryParams, pathParams, postBody, headerParams, contentType);
	}

}

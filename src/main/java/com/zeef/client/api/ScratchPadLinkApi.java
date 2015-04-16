package com.zeef.client.api;

import static javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import javax.ws.rs.core.Form;
import javax.ws.rs.core.GenericType;

import com.zeef.client.ApiInvoker;
import com.zeef.client.model.ScratchPadLink;

public class ScratchPadLinkApi {


	/**
	 * Retrieve a scratch pad link
	 *
	 * @param id
	 * @return ScratchPadLink
	 */
	public ScratchPadLink getById(Long id) {
		ApiInvoker apiInvoker = ApiInvoker.getInstance();

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

		return apiInvoker.invokeAPI(new GenericType<ScratchPadLink>() {
		}, "/scratchPadLink/{id}", "GET", queryParams, pathParams, postBody, headerParams, contentType);

	}

	/**
	 * Delete a scratch pad link
	 *
	 * @param id
	 * @return void
	 */
	public void delete(Long id) {
		ApiInvoker apiInvoker = ApiInvoker.getInstance();

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


		apiInvoker.invokeAPI(null, "/scratchPadLink/{id}", "DELETE", queryParams, pathParams, postBody, headerParams, contentType);
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
		ApiInvoker apiInvoker = ApiInvoker.getInstance();

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

}

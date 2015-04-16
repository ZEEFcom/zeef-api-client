package com.zeef.client.api;

import static javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import javax.ws.rs.core.Form;
import javax.ws.rs.core.GenericType;

import com.zeef.client.ApiInvoker;
import com.zeef.client.model.ScratchPad;

public class ScratchPadApi {


	/**
	 * Retrieve the scratch pad belonging to the current user
	 *
	 * @return ScratchPad
	 */
	public ScratchPad getMine() {
		ApiInvoker apiInvoker = ApiInvoker.getInstance();

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

			postBody = form;
		}

		return apiInvoker.invokeAPI(new GenericType<ScratchPad>() {
		}, "/scratchPad/mine", "GET", queryParams, pathParams, postBody, headerParams, contentType);

	}

	/**
	 * Add a link to the scratch pad belonging to the current user
	 *
	 * @param url
	 * @return ScratchPad
	 */
	public ScratchPad addLink(String url) {
		ApiInvoker apiInvoker = ApiInvoker.getInstance();

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
			if (url != null) {
				form.param("url", Objects.toString(url));
			}


			postBody = form;
		}

		return apiInvoker.invokeAPI(new GenericType<ScratchPad>() {
		}, "/scratchPad/mine/addLink", "POST", queryParams, pathParams, postBody, headerParams, contentType);

	}

}

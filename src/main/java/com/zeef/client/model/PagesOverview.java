package com.zeef.client.model;

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

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PagesOverview {

	private List<PageOverview> pageOverviews = new ArrayList<PageOverview>();


	/**
	 **/
	@JsonProperty("pageOverviews")
	public List<PageOverview> getPageOverviews() {
		return pageOverviews;
	}

	public void setPageOverviews(List<PageOverview> pageOverviews) {
		this.pageOverviews = pageOverviews;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PagesOverview {\n");

		sb.append("  pageOverviews: ").append(pageOverviews).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

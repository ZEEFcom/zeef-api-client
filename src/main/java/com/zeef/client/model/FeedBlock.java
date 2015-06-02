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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class FeedBlock extends LinkBlock {

	private String feedURL = null;
	private Integer maxLinks = null;
	private Integer refreshIntervalMinutes = null;

	/**
	 **/
	@JsonProperty("feedURL")
	public String getFeedURL() {
		return feedURL;
	}

	public void setFeedURL(String feedURL) {
		this.feedURL = feedURL;
	}


	/**
	 **/
	@JsonProperty("maxLinks")
	public Integer getMaxLinks() {
		return maxLinks;
	}

	public void setMaxLinks(Integer maxLinks) {
		this.maxLinks = maxLinks;
	}


	/**
	 **/
	@JsonProperty("refreshIntervalMinutes")
	public Integer getRefreshIntervalMinutes() {
		return refreshIntervalMinutes;
	}

	public void setRefreshIntervalMinutes(Integer refreshIntervalMinutes) {
		this.refreshIntervalMinutes = refreshIntervalMinutes;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FeedBlock {\n");
		sb.append("  " + super.toString()).append("\n");
		sb.append("  id: ").append(getId()).append("\n");
		sb.append("  owningPageID: ").append(getOwningPageID()).append("\n");
		sb.append("  publiclyVisible: ").append(getPubliclyVisible()).append("\n");
		sb.append("  promoted: ").append(getPromoted()).append("\n");
		sb.append("  title: ").append(getTitle()).append("\n");
		sb.append("  columnIndexHint: ").append(getColumnIndexHint()).append("\n");
		sb.append("  markdownDescription: ").append(getMarkdownDescription()).append("\n");
		sb.append("  htmlDescription: ").append(getHtmlDescription()).append("\n");
		sb.append("  imageURL: ").append(getImageURL()).append("\n");
		sb.append("  linkOrder: ").append(getLinkOrder()).append("\n");
		sb.append("  feedURL: ").append(getFeedURL()).append("\n");
		sb.append("  maxLinks: ").append(getMaxLinks()).append("\n");
		sb.append("  refreshIntervalMinutes: ").append(getRefreshIntervalMinutes()).append("\n");
		sb.append("  links: ").append(getLinks()).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

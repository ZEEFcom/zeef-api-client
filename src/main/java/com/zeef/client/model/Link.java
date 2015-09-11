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


import static com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
import static com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(include = PROPERTY, use = NAME, property = "@type")
@JsonSubTypes({
		@JsonSubTypes.Type(name = "link", value = Link.class),
		@JsonSubTypes.Type(name = "pageLink", value = PageLink.class),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Link {

	private Integer curatorRanking = null;
	private Integer popularityRanking = null;
	private String title = null;
	private String description = null;
	private String url = null;
	private String hostname = null;
	private String clickUrl = null;
	private String faviconUrl = null;
	private Long id = null;


	/**
	 **/
	@JsonProperty("curatorRanking")
	public Integer getCuratorRanking() {
		return curatorRanking;
	}

	public void setCuratorRanking(Integer curatorRanking) {
		this.curatorRanking = curatorRanking;
	}


	/**
	 **/
	@JsonProperty("popularityRanking")
	public Integer getPopularityRanking() {
		return popularityRanking;
	}

	public void setPopularityRanking(Integer popularityRanking) {
		this.popularityRanking = popularityRanking;
	}


	/**
	 **/
	@JsonProperty("title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	/**
	 **/
	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 **/
	@JsonProperty("url")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}


	/**
	 **/
	@JsonProperty("hostname")
	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}


	/**
	 **/
	@JsonProperty("clickUrl")
	public String getClickUrl() {
		return clickUrl;
	}

	public void setClickUrl(String clickUrl) {
		this.clickUrl = clickUrl;
	}


	/**
	 **/
	@JsonProperty("faviconUrl")
	public String getFaviconUrl() {
		return faviconUrl;
	}

	public void setFaviconUrl(String faviconUrl) {
		this.faviconUrl = faviconUrl;
	}


	/**
	 **/
	@JsonProperty("id")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Link {\n");

		sb.append("  curatorRanking: ").append(getCuratorRanking()).append("\n");
		sb.append("  popularityRanking: ").append(getPopularityRanking()).append("\n");
		sb.append("  title: ").append(getTitle()).append("\n");
		sb.append("  description: ").append(getDescription()).append("\n");
		sb.append("  url: ").append(getUrl()).append("\n");
		sb.append("  hostname: ").append(getHostname()).append("\n");
		sb.append("  clickUrl: ").append(getClickUrl()).append("\n");
		sb.append("  faviconUrl: ").append(getFaviconUrl()).append("\n");
		sb.append("  id: ").append(getId()).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

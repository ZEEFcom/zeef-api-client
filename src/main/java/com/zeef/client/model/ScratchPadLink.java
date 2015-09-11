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

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ScratchPadLink {

	private Long id = null;
	private Long scratchPadId = null;
	private String title = null;
	private String url = null;
	private String faviconUrl = null;
	private Date created = null;


	/**
	 **/
	@JsonProperty("id")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	/**
	 **/
	@JsonProperty("scratchPadId")
	public Long getScratchPadId() {
		return scratchPadId;
	}

	public void setScratchPadId(Long scratchPadId) {
		this.scratchPadId = scratchPadId;
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
	@JsonProperty("url")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
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
	@JsonProperty("created")
	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ScratchPadLink {\n");

		sb.append("  id: ").append(getId()).append("\n");
		sb.append("  scratchPadId: ").append(getScratchPadId()).append("\n");
		sb.append("  title: ").append(getTitle()).append("\n");
		sb.append("  url: ").append(getUrl()).append("\n");
		sb.append("  faviconUrl: ").append(getFaviconUrl()).append("\n");
		sb.append("  created: ").append(getCreated()).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

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
public class PageOverview {

	private Long id = null;
	private String url = null;
	private String subjectName = null;
	private String curator = null;
	private String languageCode = null;

	public enum StatusEnum {
		NEW, UNDER_REVIEW, PUBLISHED, NEEDS_WORK, UNPUBLISHED,
	}

	private StatusEnum status = null;

	public enum PageTypeEnum {
		SUBJECT, COMPANY, PERSONAL, PROFILE,
	}

	private PageTypeEnum pageType = null;
	private String imageURL = null;


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
	@JsonProperty("url")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}


	/**
	 **/
	@JsonProperty("subjectName")
	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}


	/**
	 **/
	@JsonProperty("curator")
	public String getCurator() {
		return curator;
	}

	public void setCurator(String curator) {
		this.curator = curator;
	}


	/**
	 **/
	@JsonProperty("languageCode")
	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}


	/**
	 **/
	@JsonProperty("status")
	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}


	/**
	 **/
	@JsonProperty("pageType")
	public PageTypeEnum getPageType() {
		return pageType;
	}

	public void setPageType(PageTypeEnum pageType) {
		this.pageType = pageType;
	}


	/**
	 **/
	@JsonProperty("imageURL")
	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PageOverview {\n");

		sb.append("  id: ").append(getId()).append("\n");
		sb.append("  url: ").append(getUrl()).append("\n");
		sb.append("  subjectName: ").append(getSubjectName()).append("\n");
		sb.append("  curator: ").append(getCurator()).append("\n");
		sb.append("  languageCode: ").append(getLanguageCode()).append("\n");
		sb.append("  status: ").append(getStatus()).append("\n");
		sb.append("  pageType: ").append(getPageType()).append("\n");
		sb.append("  imageURL: ").append(getImageURL()).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

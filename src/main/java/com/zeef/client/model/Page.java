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

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;


@JsonTypeInfo(include = PROPERTY, use = NAME, property = "@type")
@JsonSubTypes({
		@JsonSubTypes.Type(name = "profilePage", value = ProfilePage.class),
		@JsonSubTypes.Type(name = "subjectPage", value = SubjectPage.class),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Page {

	private Long id = null;
	private User owner = null;
	private Profile profile = null;
	private String imageURL = null;
	private String bannerImageURL = null;
	private String markdownDescription = null;
	private String htmlDescription = null;
	private String plainTextDescription = null;

	public enum PageTypeEnum {
		SUBJECT, COMPANY, PERSONAL, PROFILE,
	}

	private PageTypeEnum pageType = null;
	private List<Block> blocks = new ArrayList<Block>();


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
	@JsonProperty("owner")
	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}


	/**
	 **/
	@JsonProperty("profile")
	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
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


	/**
	 **/
	@JsonProperty("bannerImageURL")
	public String getBannerImageURL() {
		return bannerImageURL;
	}

	public void setBannerImageURL(String bannerImageURL) {
		this.bannerImageURL = bannerImageURL;
	}


	/**
	 **/
	@JsonProperty("markdownDescription")
	public String getMarkdownDescription() {
		return markdownDescription;
	}

	public void setMarkdownDescription(String markdownDescription) {
		this.markdownDescription = markdownDescription;
	}


	/**
	 **/
	@JsonProperty("htmlDescription")
	public String getHtmlDescription() {
		return htmlDescription;
	}

	public void setHtmlDescription(String htmlDescription) {
		this.htmlDescription = htmlDescription;
	}


	/**
	 **/
	@JsonProperty("plainTextDescription")
	public String getPlainTextDescription() {
		return plainTextDescription;
	}

	public void setPlainTextDescription(String plainTextDescription) {
		this.plainTextDescription = plainTextDescription;
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
	@JsonProperty("blocks")
	public List<Block> getBlocks() {
		return blocks;
	}

	public void setBlocks(List<Block> blocks) {
		this.blocks = blocks;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Page {\n");

		sb.append("  id: ").append(getId()).append("\n");
		sb.append("  owner: ").append(getOwner()).append("\n");
		sb.append("  profile: ").append(getProfile()).append("\n");
		sb.append("  imageURL: ").append(getImageURL()).append("\n");
		sb.append("  bannerImageURL: ").append(getBannerImageURL()).append("\n");
		sb.append("  markdownDescription: ").append(getMarkdownDescription()).append("\n");
		sb.append("  htmlDescription: ").append(getHtmlDescription()).append("\n");
		sb.append("  plainTextDescription: ").append(getPlainTextDescription()).append("\n");
		sb.append("  pageType: ").append(getPageType()).append("\n");
		sb.append("  blocks: ").append(getBlocks()).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

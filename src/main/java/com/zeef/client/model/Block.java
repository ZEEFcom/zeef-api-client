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
		@JsonSubTypes.Type(name = "textBlock", value = TextBlock.class),
		@JsonSubTypes.Type(name = "linkBlock", value = LinkBlock.class),
		@JsonSubTypes.Type(name = "imageBlock", value = ImageBlock.class),
		@JsonSubTypes.Type(name = "mirroredBlock", value = MirroredBlock.class),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Block {

	private Long id = null;
	private Long owningPageID = null;
	private Boolean publiclyVisible = null;
	private Boolean promoted = null;
	private String title = null;
	private Integer columnIndexHint = null;


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
	@JsonProperty("owningPageID")
	public Long getOwningPageID() {
		return owningPageID;
	}

	public void setOwningPageID(Long owningPageID) {
		this.owningPageID = owningPageID;
	}


	/**
	 **/
	@JsonProperty("publiclyVisible")
	public Boolean getPubliclyVisible() {
		return publiclyVisible;
	}

	public void setPubliclyVisible(Boolean publiclyVisible) {
		this.publiclyVisible = publiclyVisible;
	}


	/**
	 **/
	@JsonProperty("promoted")
	public Boolean getPromoted() {
		return promoted;
	}

	public void setPromoted(Boolean promoted) {
		this.promoted = promoted;
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
	@JsonProperty("columnIndexHint")
	public Integer getColumnIndexHint() {
		return columnIndexHint;
	}

	public void setColumnIndexHint(Integer columnIndexHint) {
		this.columnIndexHint = columnIndexHint;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Block {\n");

		sb.append("  id: ").append(getId()).append("\n");
		sb.append("  owningPageID: ").append(getOwningPageID()).append("\n");
		sb.append("  publiclyVisible: ").append(getPubliclyVisible()).append("\n");
		sb.append("  promoted: ").append(getPromoted()).append("\n");
		sb.append("  title: ").append(getTitle()).append("\n");
		sb.append("  columnIndexHint: ").append(getColumnIndexHint()).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

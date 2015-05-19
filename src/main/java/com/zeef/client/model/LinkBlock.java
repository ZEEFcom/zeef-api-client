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
		@JsonSubTypes.Type(name = "linkBlock", value = LinkBlock.class),
		@JsonSubTypes.Type(name = "feedBlock", value = FeedBlock.class),
		@JsonSubTypes.Type(name = "latestPagesBlock", value = LatestPagesBlock.class)
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class LinkBlock extends Block {

	private String markdownDescription = null;
	private String htmlDescription = null;
	private String imageURL = null;

	public enum LinkOrderEnum {
		CURATOR_RANKING, MOST_POPULAR, ALPHABETICAL,
	}

	private LinkOrderEnum linkOrder = null;
	private List<Link> links = new ArrayList<Link>();

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
	@JsonProperty("imageURL")
	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}


	/**
	 **/
	@JsonProperty("linkOrder")
	public LinkOrderEnum getLinkOrder() {
		return linkOrder;
	}

	public void setLinkOrder(LinkOrderEnum linkOrder) {
		this.linkOrder = linkOrder;
	}


	/**
	 **/
	@JsonProperty("links")
	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LinkBlock {\n");
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
		sb.append("  links: ").append(getLinks()).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

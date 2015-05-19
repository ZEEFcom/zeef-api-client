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
public class TextBlock extends Block {

	private String markdownText = null;
	private String htmlText = null;


	/**
	 **/
	@JsonProperty("markdownText")
	public String getMarkdownText() {
		return markdownText;
	}

	public void setMarkdownText(String markdownText) {
		this.markdownText = markdownText;
	}


	/**
	 **/
	@JsonProperty("htmlText")
	public String getHtmlText() {
		return htmlText;
	}

	public void setHtmlText(String htmlText) {
		this.htmlText = htmlText;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TextBlock {\n");
		sb.append("  " + super.toString()).append("\n");
		sb.append("  id: ").append(getId()).append("\n");
		sb.append("  owningPageID: ").append(getOwningPageID()).append("\n");
		sb.append("  publiclyVisible: ").append(getPubliclyVisible()).append("\n");
		sb.append("  promoted: ").append(getPromoted()).append("\n");
		sb.append("  title: ").append(getTitle()).append("\n");
		sb.append("  columnIndexHint: ").append(getColumnIndexHint()).append("\n");
		sb.append("  markdownText: ").append(getMarkdownText()).append("\n");
		sb.append("  htmlText: ").append(getHtmlText()).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

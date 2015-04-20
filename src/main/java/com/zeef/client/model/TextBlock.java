package com.zeef.client.model;


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

		sb.append("  id: ").append(getId()).append("\n");
		sb.append("  owningPageID: ").append(getOwningPageID()).append("\n");
		sb.append("  publiclyVisible: ").append(getPubliclyVisible()).append("\n");
		sb.append("  promoted: ").append(getPromoted()).append("\n");
		sb.append("  title: ").append(getTitle()).append("\n");
		sb.append("  columnIndexHint: ").append(getColumnIndexHint()).append("\n");
		sb.append("  markdownText: ").append(markdownText).append("\n");
		sb.append("  htmlText: ").append(htmlText).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

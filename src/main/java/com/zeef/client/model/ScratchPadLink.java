package com.zeef.client.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ScratchPadLink {

	private Long id = null;
	private Long scratchPadId = null;
	private String title = null;
	private String url = null;


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


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ScratchPadLink {\n");

		sb.append("  id: ").append(id).append("\n");
		sb.append("  scratchPadId: ").append(scratchPadId).append("\n");
		sb.append("  title: ").append(title).append("\n");
		sb.append("  url: ").append(url).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

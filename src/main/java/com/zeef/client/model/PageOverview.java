package com.zeef.client.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zeef.client.model.Page.PageTypeEnum;

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

		sb.append("  id: ").append(id).append("\n");
		sb.append("  url: ").append(url).append("\n");
		sb.append("  subjectName: ").append(subjectName).append("\n");
		sb.append("  curator: ").append(curator).append("\n");
		sb.append("  languageCode: ").append(languageCode).append("\n");
		sb.append("  status: ").append(status).append("\n");
		sb.append("  pageType: ").append(pageType).append("\n");
		sb.append("  imageURL: ").append(imageURL).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

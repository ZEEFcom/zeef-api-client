package com.zeef.client.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Link {

	private Integer curatorRanking = null;
	private Integer popularityRanking = null;
	private String title = null;
	private String description = null;
	private String url = null;
	private String hostname = null;
	private String clickUrl = null;
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

		sb.append("  curatorRanking: ").append(curatorRanking).append("\n");
		sb.append("  popularityRanking: ").append(popularityRanking).append("\n");
		sb.append("  title: ").append(title).append("\n");
		sb.append("  description: ").append(description).append("\n");
		sb.append("  url: ").append(url).append("\n");
		sb.append("  hostname: ").append(hostname).append("\n");
		sb.append("  clickUrl: ").append(clickUrl).append("\n");
		sb.append("  id: ").append(id).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

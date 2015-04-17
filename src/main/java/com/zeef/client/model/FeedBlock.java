package com.zeef.client.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


public class FeedBlock extends Block {

	private String markdownDescription = null;
	private String htmlDescription = null;
	private String imageURL = null;

	public enum LinkOrderEnum {
		CURATOR_RANKING, MOST_POPULAR, ALPHABETICAL,
	}

	;
	private LinkOrderEnum linkOrder = null;
	private String feedURL = null;
	private Integer maxLinks = null;
	private Integer refreshIntervalMinutes = null;
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
	@JsonProperty("feedURL")
	public String getFeedURL() {
		return feedURL;
	}

	public void setFeedURL(String feedURL) {
		this.feedURL = feedURL;
	}


	/**
	 **/
	@JsonProperty("maxLinks")
	public Integer getMaxLinks() {
		return maxLinks;
	}

	public void setMaxLinks(Integer maxLinks) {
		this.maxLinks = maxLinks;
	}


	/**
	 **/
	@JsonProperty("refreshIntervalMinutes")
	public Integer getRefreshIntervalMinutes() {
		return refreshIntervalMinutes;
	}

	public void setRefreshIntervalMinutes(Integer refreshIntervalMinutes) {
		this.refreshIntervalMinutes = refreshIntervalMinutes;
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
		sb.append("class FeedBlock {\n");

		sb.append("  id: ").append(getId()).append("\n");
		sb.append("  owningPageID: ").append(getOwningPageID()).append("\n");
		sb.append("  publiclyVisible: ").append(getPubliclyVisible()).append("\n");
		sb.append("  promoted: ").append(getPromoted()).append("\n");
		sb.append("  title: ").append(getTitle()).append("\n");
		sb.append("  columnIndexHint: ").append(getColumnIndexHint()).append("\n");
		sb.append("  markdownDescription: ").append(markdownDescription).append("\n");
		sb.append("  htmlDescription: ").append(htmlDescription).append("\n");
		sb.append("  imageURL: ").append(imageURL).append("\n");
		sb.append("  linkOrder: ").append(linkOrder).append("\n");
		sb.append("  feedURL: ").append(feedURL).append("\n");
		sb.append("  maxLinks: ").append(maxLinks).append("\n");
		sb.append("  refreshIntervalMinutes: ").append(refreshIntervalMinutes).append("\n");
		sb.append("  links: ").append(links).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

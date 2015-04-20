package com.zeef.client.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LatestPagesBlock extends Block {

	private String markdownDescription = null;
	private String htmlDescription = null;
	private String imageURL = null;

	public enum LinkOrderEnum {
		CURATOR_RANKING, MOST_POPULAR, ALPHABETICAL,
	}

	;
	private LinkOrderEnum linkOrder = null;
	private Integer maxLinks = null;

	public enum FetchTypeEnum {
		POPULAR, LATEST,
	}

	;
	private FetchTypeEnum fetchType = null;

	public enum StatisticPeriodEnum {
		ALL_TIME, YEAR, TWO_MONTHS, MONTH, TWO_WEEKS, WEEK, YESTERDAY, TODAY,
	}

	;
	private StatisticPeriodEnum statisticPeriod = null;
	private List<Link> links = new ArrayList<Link>();
	private List<String> tags = new ArrayList<String>();

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
	@JsonProperty("maxLinks")
	public Integer getMaxLinks() {
		return maxLinks;
	}

	public void setMaxLinks(Integer maxLinks) {
		this.maxLinks = maxLinks;
	}


	/**
	 **/
	@JsonProperty("fetchType")
	public FetchTypeEnum getFetchType() {
		return fetchType;
	}

	public void setFetchType(FetchTypeEnum fetchType) {
		this.fetchType = fetchType;
	}


	/**
	 **/
	@JsonProperty("statisticPeriod")
	public StatisticPeriodEnum getStatisticPeriod() {
		return statisticPeriod;
	}

	public void setStatisticPeriod(StatisticPeriodEnum statisticPeriod) {
		this.statisticPeriod = statisticPeriod;
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


	/**
	 **/
	@JsonProperty("tags")
	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LatestPagesBlock {\n");

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
		sb.append("  maxLinks: ").append(maxLinks).append("\n");
		sb.append("  fetchType: ").append(fetchType).append("\n");
		sb.append("  statisticPeriod: ").append(statisticPeriod).append("\n");
		sb.append("  links: ").append(links).append("\n");
		sb.append("  tags: ").append(tags).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

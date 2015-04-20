package com.zeef.client.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(include = JsonTypeInfo.As.PROPERTY, use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
		              @JsonSubTypes.Type(name = "textBlock", value = TextBlock.class),
		              @JsonSubTypes.Type(name = "linkBlock", value = LinkBlock.class),
		              @JsonSubTypes.Type(name = "feedBlock", value = FeedBlock.class),
		              @JsonSubTypes.Type(name = "imageBlock", value = ImageBlock.class),
		              @JsonSubTypes.Type(name = "mirroredBlock", value = MirroredBlock.class),
		              @JsonSubTypes.Type(name = "latestPagesBlock", value = LatestPagesBlock.class)
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

		sb.append("  id: ").append(id).append("\n");
		sb.append("  owningPageID: ").append(owningPageID).append("\n");
		sb.append("  publiclyVisible: ").append(publiclyVisible).append("\n");
		sb.append("  promoted: ").append(promoted).append("\n");
		sb.append("  title: ").append(title).append("\n");
		sb.append("  columnIndexHint: ").append(columnIndexHint).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

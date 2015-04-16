package com.zeef.client.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Page {

	private Long id = null;
	private Subject subject = null;
	private User owner = null;
	private Profile profile = null;
	private String markdownDescription = null;
	private String htmlDescription = null;
	private String plainTextDescription = null;

	public enum PageTypeEnum {
		SUBJECT, COMPANY, PERSONAL,
	}

	;
	private PageTypeEnum pageType = null;
	private List<Block> blocks = new ArrayList<Block>();


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
	@JsonProperty("subject")
	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}


	/**
	 **/
	@JsonProperty("owner")
	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}


	/**
	 **/
	@JsonProperty("profile")
	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}


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
	@JsonProperty("plainTextDescription")
	public String getPlainTextDescription() {
		return plainTextDescription;
	}

	public void setPlainTextDescription(String plainTextDescription) {
		this.plainTextDescription = plainTextDescription;
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
	@JsonProperty("blocks")
	public List<Block> getBlocks() {
		return blocks;
	}

	public void setBlocks(List<Block> blocks) {
		this.blocks = blocks;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Page {\n");

		sb.append("  id: ").append(id).append("\n");
		sb.append("  subject: ").append(subject).append("\n");
		sb.append("  owner: ").append(owner).append("\n");
		sb.append("  profile: ").append(profile).append("\n");
		sb.append("  markdownDescription: ").append(markdownDescription).append("\n");
		sb.append("  htmlDescription: ").append(htmlDescription).append("\n");
		sb.append("  plainTextDescription: ").append(plainTextDescription).append("\n");
		sb.append("  pageType: ").append(pageType).append("\n");
		sb.append("  blocks: ").append(blocks).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

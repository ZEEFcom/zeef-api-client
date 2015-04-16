package com.zeef.client.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ScratchPad {

	private Long id = null;
	private User owner = null;
	private List<ScratchPadLink> scratchPadLinks = new ArrayList<ScratchPadLink>();


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
	@JsonProperty("owner")
	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}


	/**
	 **/
	@JsonProperty("scratchPadLinks")
	public List<ScratchPadLink> getScratchPadLinks() {
		return scratchPadLinks;
	}

	public void setScratchPadLinks(List<ScratchPadLink> scratchPadLinks) {
		this.scratchPadLinks = scratchPadLinks;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ScratchPad {\n");

		sb.append("  id: ").append(id).append("\n");
		sb.append("  owner: ").append(owner).append("\n");
		sb.append("  scratchPadLinks: ").append(scratchPadLinks).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

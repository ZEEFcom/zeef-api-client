package com.zeef.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MirroredBlock extends Block {

	private Long originalPageID = null;
	private User curator = null;
	private Profile curatorProfile = null;
	private Block originalBlock = null;

	/**
	 **/
	@JsonProperty("originalPageID")
	public Long getOriginalPageID() {
		return originalPageID;
	}

	public void setOriginalPageID(Long originalPageID) {
		this.originalPageID = originalPageID;
	}


	/**
	 **/
	@JsonProperty("curator")
	public User getCurator() {
		return curator;
	}

	public void setCurator(User curator) {
		this.curator = curator;
	}


	/**
	 **/
	@JsonProperty("curatorProfile")
	public Profile getCuratorProfile() {
		return curatorProfile;
	}

	public void setCuratorProfile(Profile curatorProfile) {
		this.curatorProfile = curatorProfile;
	}


	/**
	 **/
	@JsonProperty("originalBlock")
	public Block getOriginalBlock() {
		return originalBlock;
	}

	public void setOriginalBlock(Block originalBlock) {
		this.originalBlock = originalBlock;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class MirroredBlock {\n");

		sb.append("  id: ").append(getId()).append("\n");
		sb.append("  owningPageID: ").append(getOwningPageID()).append("\n");
		sb.append("  publiclyVisible: ").append(getPubliclyVisible()).append("\n");
		sb.append("  promoted: ").append(getPromoted()).append("\n");
		sb.append("  title: ").append(getTitle()).append("\n");
		sb.append("  columnIndexHint: ").append(getColumnIndexHint()).append("\n");
		sb.append("  originalPageID: ").append(originalPageID).append("\n");
		sb.append("  curator: ").append(curator).append("\n");
		sb.append("  curatorProfile: ").append(curatorProfile).append("\n");
		sb.append("  originalBlock: ").append(originalBlock).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

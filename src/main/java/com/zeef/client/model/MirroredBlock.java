package com.zeef.client.model;

/*
 * #%L
 * ZEEF API Client
 * ----------------------------------------
 * Copyright (C) 2015 ZEEF
 * ----------------------------------------
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

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
		sb.append("  " + super.toString()).append("\n");
		sb.append("  id: ").append(getId()).append("\n");
		sb.append("  owningPageID: ").append(getOwningPageID()).append("\n");
		sb.append("  publiclyVisible: ").append(getPubliclyVisible()).append("\n");
		sb.append("  promoted: ").append(getPromoted()).append("\n");
		sb.append("  title: ").append(getTitle()).append("\n");
		sb.append("  columnIndexHint: ").append(getColumnIndexHint()).append("\n");
		sb.append("  originalPageID: ").append(getOriginalPageID()).append("\n");
		sb.append("  curator: ").append(getCurator()).append("\n");
		sb.append("  curatorProfile: ").append(getCuratorProfile()).append("\n");
		sb.append("  originalBlock: ").append(getOriginalBlock()).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

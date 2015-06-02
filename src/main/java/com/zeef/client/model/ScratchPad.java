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

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
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

		sb.append("  id: ").append(getId()).append("\n");
		sb.append("  owner: ").append(getOwner()).append("\n");
		sb.append("  scratchPadLinks: ").append(getScratchPadLinks()).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

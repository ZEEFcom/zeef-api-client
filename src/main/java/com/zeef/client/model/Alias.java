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
public class Alias {

	private Long id = null;
	private String name = null;
	private String displayName = null;
	private Boolean defaultAlias = null;


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
	@JsonProperty("name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	/**
	 **/
	@JsonProperty("displayName")
	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}


	/**
	 **/
	@JsonProperty("defaultAlias")
	public Boolean getDefaultAlias() {
		return defaultAlias;
	}

	public void setDefaultAlias(Boolean defaultAlias) {
		this.defaultAlias = defaultAlias;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Alias {\n");

		sb.append("  id: ").append(id).append("\n");
		sb.append("  name: ").append(name).append("\n");
		sb.append("  displayName: ").append(displayName).append("\n");
		sb.append("  defaultAlias: ").append(defaultAlias).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

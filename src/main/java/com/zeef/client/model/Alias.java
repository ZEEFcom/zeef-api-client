package com.zeef.client.model;


import com.fasterxml.jackson.annotation.JsonProperty;


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

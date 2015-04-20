package com.zeef.client.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

	private String username = null;
	private String fullName = null;


	/**
	 **/
	@JsonProperty("username")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	/**
	 **/
	@JsonProperty("fullName")
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class User {\n");

		sb.append("  username: ").append(username).append("\n");
		sb.append("  fullName: ").append(fullName).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

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

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Activity {

	private Long id = null;
	private Long pageId = null;
	private String profileImageURL = null;
	private User user = null;
	private Date timestamp = null;
	private String message = null;


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
	@JsonProperty("pageId")
	public Long getPageId() {
		return pageId;
	}

	public void setPageId(Long pageId) {
		this.pageId = pageId;
	}


	/**
	 **/
	@JsonProperty("profileImageURL")
	public String getProfileImageURL() {
		return profileImageURL;
	}

	public void setProfileImageURL(String profileImageURL) {
		this.profileImageURL = profileImageURL;
	}


	/**
	 **/
	@JsonProperty("user")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	/**
	 **/
	@JsonProperty("timestamp")
	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}


	/**
	 **/
	@JsonProperty("message")
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Activity {\n");

		sb.append("  id: ").append(getId()).append("\n");
		sb.append("  pageId: ").append(getPageId()).append("\n");
		sb.append("  profileImageURL: ").append(getProfileImageURL()).append("\n");
		sb.append("  user: ").append(getUser()).append("\n");
		sb.append("  timestamp: ").append(getTimestamp()).append("\n");
		sb.append("  message: ").append(getMessage()).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

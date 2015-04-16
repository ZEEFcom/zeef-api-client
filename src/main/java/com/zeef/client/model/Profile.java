package com.zeef.client.model;


import com.fasterxml.jackson.annotation.JsonProperty;


public class Profile {

	private Long id = null;
	private String markdownSummary = null;
	private String htmlSummary = null;
	private String profileImageURL = null;
	private String facebookURL = null;
	private String twitterURL = null;
	private String linkedinURL = null;
	private String googlePlusURL = null;
	private String twentyFourSessionsURL = null;


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
	@JsonProperty("markdownSummary")
	public String getMarkdownSummary() {
		return markdownSummary;
	}

	public void setMarkdownSummary(String markdownSummary) {
		this.markdownSummary = markdownSummary;
	}


	/**
	 **/
	@JsonProperty("htmlSummary")
	public String getHtmlSummary() {
		return htmlSummary;
	}

	public void setHtmlSummary(String htmlSummary) {
		this.htmlSummary = htmlSummary;
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
	@JsonProperty("facebookURL")
	public String getFacebookURL() {
		return facebookURL;
	}

	public void setFacebookURL(String facebookURL) {
		this.facebookURL = facebookURL;
	}


	/**
	 **/
	@JsonProperty("twitterURL")
	public String getTwitterURL() {
		return twitterURL;
	}

	public void setTwitterURL(String twitterURL) {
		this.twitterURL = twitterURL;
	}


	/**
	 **/
	@JsonProperty("linkedinURL")
	public String getLinkedinURL() {
		return linkedinURL;
	}

	public void setLinkedinURL(String linkedinURL) {
		this.linkedinURL = linkedinURL;
	}


	/**
	 **/
	@JsonProperty("googlePlusURL")
	public String getGooglePlusURL() {
		return googlePlusURL;
	}

	public void setGooglePlusURL(String googlePlusURL) {
		this.googlePlusURL = googlePlusURL;
	}


	/**
	 **/
	@JsonProperty("twentyFourSessionsURL")
	public String getTwentyFourSessionsURL() {
		return twentyFourSessionsURL;
	}

	public void setTwentyFourSessionsURL(String twentyFourSessionsURL) {
		this.twentyFourSessionsURL = twentyFourSessionsURL;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Profile {\n");

		sb.append("  id: ").append(id).append("\n");
		sb.append("  markdownSummary: ").append(markdownSummary).append("\n");
		sb.append("  htmlSummary: ").append(htmlSummary).append("\n");
		sb.append("  profileImageURL: ").append(profileImageURL).append("\n");
		sb.append("  facebookURL: ").append(facebookURL).append("\n");
		sb.append("  twitterURL: ").append(twitterURL).append("\n");
		sb.append("  linkedinURL: ").append(linkedinURL).append("\n");
		sb.append("  googlePlusURL: ").append(googlePlusURL).append("\n");
		sb.append("  twentyFourSessionsURL: ").append(twentyFourSessionsURL).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

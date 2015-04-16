package com.zeef.client.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


public class PagesOverview {

	private List<PageOverview> pageOverviews = new ArrayList<PageOverview>();


	/**
	 **/
	@JsonProperty("pageOverviews")
	public List<PageOverview> getPageOverviews() {
		return pageOverviews;
	}

	public void setPageOverviews(List<PageOverview> pageOverviews) {
		this.pageOverviews = pageOverviews;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PagesOverview {\n");

		sb.append("  pageOverviews: ").append(pageOverviews).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

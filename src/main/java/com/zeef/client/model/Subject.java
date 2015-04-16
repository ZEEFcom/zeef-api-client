package com.zeef.client.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Subject {

	private Long id = null;
	private List<Alias> aliases = new ArrayList<Alias>();


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
	@JsonProperty("aliases")
	public List<Alias> getAliases() {
		return aliases;
	}

	public void setAliases(List<Alias> aliases) {
		this.aliases = aliases;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Subject {\n");

		sb.append("  id: ").append(id).append("\n");
		sb.append("  aliases: ").append(aliases).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

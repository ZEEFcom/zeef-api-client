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
public class Activities {

	private List<Activity> activities = new ArrayList<Activity>();
	private Long remainingNumberOfActivities = null;


	/**
	 **/
	@JsonProperty("activities")
	public List<Activity> getActivities() {
		return activities;
	}

	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}


	/**
	 * The remaining number of activities matching the specified criteria, after the given page.
	 */
	@JsonProperty("remainingNumberOfActivities")
	public Long getRemainingNumberOfActivities() {
		return remainingNumberOfActivities;
	}

	public void setRemainingNumberOfActivities(Long remainingNumberOfActivities) {
		this.remainingNumberOfActivities = remainingNumberOfActivities;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Activities {\n");

		sb.append("  activities: ").append(getActivities()).append("\n");
		sb.append("  remainingNumberOfActivities: ").append(getRemainingNumberOfActivities()).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

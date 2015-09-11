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


@JsonIgnoreProperties(ignoreUnknown = true)
public class ProfilePage extends Page {

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProfilePage {\n");
		sb.append("  " + super.toString()).append("\n");
		sb.append("  id: ").append(getId()).append("\n");
		sb.append("  owner: ").append(getOwner()).append("\n");
		sb.append("  profile: ").append(getProfile()).append("\n");
		sb.append("  imageURL: ").append(getImageURL()).append("\n");
		sb.append("  bannerImageURL: ").append(getBannerImageURL()).append("\n");
		sb.append("  markdownDescription: ").append(getMarkdownDescription()).append("\n");
		sb.append("  htmlDescription: ").append(getHtmlDescription()).append("\n");
		sb.append("  plainTextDescription: ").append(getPlainTextDescription()).append("\n");
		sb.append("  pageType: ").append(getPageType()).append("\n");
		sb.append("  blocks: ").append(getBlocks()).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

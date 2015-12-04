package com.zeef.client;

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

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FormBody implements Map<String, String> {

	private final Map<String, String> parameters = new HashMap<>();

	@Override
	public int size() {
		return parameters.size();
	}

	@Override
	public boolean isEmpty() {
		return parameters.isEmpty();
	}

	@Override
	public boolean containsKey(Object key) {
		return parameters.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		return parameters.containsValue(value);
	}

	@Override
	public String get(Object key) {
		return parameters.get(key);
	}

	@Override
	public String put(String key, String value) {
		return parameters.put(key, value);
	}

	@Override
	public String remove(Object key) {
		return parameters.remove(key);
	}

	@Override
	public void putAll(Map<? extends String, ? extends String> m) {
		parameters.putAll(m);
	}

	@Override
	public void clear() {
		parameters.clear();
	}

	@Override
	public Set<String> keySet() {
		return parameters.keySet();
	}

	@Override
	public Collection<String> values() {
		return parameters.values();
	}

	@Override
	public Set<java.util.Map.Entry<String, String>> entrySet() {
		return parameters.entrySet();
	}

	@Override
	public boolean equals(Object o) {
		return parameters.equals(o);
	}

	@Override
	public int hashCode() {
		return parameters.hashCode();
	}

	public FormBody addParameter(String key, String value) {
		put(key, value);
		return this;
	}

}
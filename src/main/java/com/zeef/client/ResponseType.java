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

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ResponseType<T> {

	private final Type type;

	public ResponseType() {
		type = deriveType();
	}

	private Type deriveType() {
		Type type = getClass().getGenericSuperclass();

		Map<TypeVariable<?>, Type> typeMapping = new HashMap<>();
		while (!(type instanceof ParameterizedType) || !ResponseType.class.equals(((ParameterizedType) type).getRawType())) {
			if (type instanceof ParameterizedType) {
				Class<?> rawType = (Class<?>) ((ParameterizedType) type).getRawType();

				Type[] typeArguments = ((ParameterizedType) type).getActualTypeArguments();
				TypeVariable<?>[] typeParameters = rawType.getTypeParameters();

				for (int i = 0; i < typeParameters.length; i++) {
					if (typeArguments[i] instanceof TypeVariable) {
						typeMapping.put(typeParameters[i], typeMapping.get(typeArguments[i]));
					}
					else {
						typeMapping.put(typeParameters[i], typeArguments[i]);
					}
				}

				type = ((Class<?>) ((ParameterizedType) type).getRawType()).getGenericSuperclass();
			}
			else {
				type = ((Class<?>) type).getGenericSuperclass();
			}
		}

		Type typeArgument = ((ParameterizedType) type).getActualTypeArguments()[0];

		if (typeArgument instanceof TypeVariable) {
			typeArgument = typeMapping.get(typeArgument);
		}

		Objects.requireNonNull(typeArgument);

		return typeArgument;
	}

	public ResponseType(Type type) {
		this.type = type;
	}

	public Type getType() {
		return type;
	}

}

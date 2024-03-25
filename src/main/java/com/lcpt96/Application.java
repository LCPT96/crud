package com.lcpt96;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.stream.Stream;

public class Application {

	public static void main(String[] args) {

	}

	private Map<String, Object> repositories;

	private Map<String, Object> services;

	private Map<String, Object> controllers;

	private Application() {

	}

	public Stream<Class<?>> scan(final String packageName) {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(ClassLoader.getSystemClassLoader().getResourceAsStream(packageName.replaceAll("[.]", "/"))))) {
			return reader.lines()
				.flatMap((final String entryName) -> {
					if (!entryName.endsWith(".class")) {
						return this.scan(packageName.concat(".").concat(entryName));
					}
					try {
						return Stream.of(Class.forName(packageName.concat(".").concat(entryName.substring(0, entryName.length() - 6))));
					} catch (ClassNotFoundException exception) {
						return Stream.empty();
					}
				});
		} catch (IOException exception) {
			return Stream.empty();
		}
	}

}

package com.tmb.utils;

import java.io.FileInputStream;
import java.util.Objects;
import java.util.Properties;

public final class ReadPropertyFile {

	private ReadPropertyFile() {

	}

	public static String getValue(String key) throws Exception {
		String value = "";
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "/src/test/resources/config/config.properties");

		prop.load(fis);
		value = prop.getProperty(key);
		if (Objects.isNull(value)) {
			throw new Exception("Property name" + key + " is not found. Please check config.properties");
		}
		return value;
	}

}

package com.tmb.constants;

public final class FrameworkConstants {

	private FrameworkConstants() {

	}

	private static final String RESOURCES_PATH = System.getProperty("user.dir") + "/src/test/resources";
	private static final String CONFIG_FILE_PATH = RESOURCES_PATH + "/config/config.properties";

	public static String getConfigFilePath() {
		return CONFIG_FILE_PATH;
	}

}
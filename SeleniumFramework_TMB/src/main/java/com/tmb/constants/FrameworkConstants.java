package com.tmb.constants;

import com.tmb.enums.ConfigProperties;
import com.tmb.utils.PropertyUtils;

public final class FrameworkConstants {

	private FrameworkConstants() {

	}

	private static final String RESOURCESPATH = System.getProperty("user.dir") + "/src/test/resources";
	private static final String CONFIGFILEPATH = RESOURCESPATH + "/config/config.properties";
	private static final String EXTENTREPORTFOLDERPATH = System.getProperty("user.dir") + "/extent-test-output";
	private static final String EXCELPATH = RESOURCESPATH + "/excel/testdata.xlsx";

	private static final int EXPLICITWAIT = 10;
	private static String extentReportFilePath = "";

	public static String getExtentReportFilePath() throws Exception {
		if (extentReportFilePath.isEmpty()) {
			extentReportFilePath = createReportPath();
		}
		return extentReportFilePath;
	}

	public static String createReportPath() throws Exception {
		if (PropertyUtils.getValue(ConfigProperties.OVERRIDEREPORTS).equalsIgnoreCase("no")) {
			return EXTENTREPORTFOLDERPATH + "/" + System.currentTimeMillis() + "index.html";
		} else {
			return EXTENTREPORTFOLDERPATH + "/" + "index.html";
		}
	}

	public static String getExcelPath() {
		return EXCELPATH;
	}
	
	public static int getExplicitWait() {
		return EXPLICITWAIT;
	}

	public static String getConfigFilePath() {
		return CONFIGFILEPATH;
	}

}
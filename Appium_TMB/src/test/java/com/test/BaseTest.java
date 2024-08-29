package com.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseTest {

	public AndroidDriver driver;

	@BeforeClass
	public void setUp() throws MalformedURLException {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Pixel 8 Pro");
		options.setApp(System.getProperty("user.dir") + "/apps/Android-MyDemoAppRN.1.3.0.build-244.apk");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}

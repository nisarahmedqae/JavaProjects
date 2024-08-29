package com.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import com.codeborne.selenide.WebDriverProvider;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class SauceLabAndroidAppProvider implements WebDriverProvider {

	@Override
	public WebDriver createDriver(Capabilities capabilities) {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Pixel 8 Pro");
		options.setApp(System.getProperty("user.dir") + "/apps/Android-MyDemoAppRN.1.3.0.build-244.apk");

		try {
			return new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}

	}

}

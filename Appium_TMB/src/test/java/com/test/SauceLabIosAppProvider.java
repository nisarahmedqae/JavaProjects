package com.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import com.codeborne.selenide.WebDriverProvider;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

public class SauceLabIosAppProvider implements WebDriverProvider {

	@Override
	public WebDriver createDriver(Capabilities capabilities) {
		XCUITestOptions options = new XCUITestOptions();
		options.setDeviceName("iPad mini (6th generation)");
		options.setApp(System.getProperty("user.dir") + "/apps/iOS-Simulator-MyRNDemoApp.1.3.0-162.zip");

		try {
			return new IOSDriver(new URL("http://127.0.0.1:4723"), options);
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}
	}

}

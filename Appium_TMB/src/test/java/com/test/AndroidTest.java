package com.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

public class AndroidTest {

	@Test
	public void androidLaunchTest() throws MalformedURLException, InterruptedException {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("Android"); // optional
		options.setAutomationName("UIAutomator2"); // optional
		options.setDeviceName("Pixel 3");
		options.setApp(System.getProperty("user.dir") + "/apps/Android-MyDemoAppRN.1.3.0.build-244.apk");
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		Thread.sleep(5000);

		new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(e -> e.findElement(AppiumBy.accessibilityId("menu item log in")));
		driver.findElement(AppiumBy.accessibilityId("open menu")).click();
		// driver.findElement(AppiumBy.accessibilityId("menu item log in")).click();
		driver.findElement(AppiumBy.accessibilityId("Username input field")).sendKeys("bob@example.com");
		driver.findElement(AppiumBy.accessibilityId("Password input field")).sendKeys("10203040");
		driver.findElement(AppiumBy.accessibilityId("Login button")).click();
	}

	@Test(enabled = false)
	public void iosLaunchTest() throws MalformedURLException, InterruptedException {
		XCUITestOptions options = new XCUITestOptions();
		options.setDeviceName("iPad mini (6th generation)");
		options.setApp(System.getProperty("user.dir") + "/apps/iOS-Simulator-MyRNDemoApp.1.3.0-162.zip");
		IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723"), options);
		Thread.sleep(5000);

	}

}

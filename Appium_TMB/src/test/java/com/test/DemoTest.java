package com.test;

import org.testng.annotations.Test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.appium.ScreenObject;
import com.codeborne.selenide.appium.SelenideAppium;

import static com.codeborne.selenide.appium.SelenideAppium.*;

import io.appium.java_client.AppiumBy;
import pages.HomeScreen;

public class DemoTest {

	@Test
	void androidLaunchTest() {
		SelenideAppium.launchApp();
		ScreenObject.screen(HomeScreen.class).clickProduct1().checkWhetherAddToCartButtonIsPresent();
	}

	@Test(enabled = false)
	void iosLaunchTest() {
		Configuration.browser = SauceLabIosAppProvider.class.getName();
		SelenideAppium.launchApp();
		$$(AppiumBy.name("store item text")).get(0).click();
	}

}

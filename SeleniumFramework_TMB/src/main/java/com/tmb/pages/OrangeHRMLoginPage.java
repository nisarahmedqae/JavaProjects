package com.tmb.pages;

import org.openqa.selenium.By;

import com.tmb.driver.DriverManager;

public final class OrangeHRMLoginPage extends BasePage {
	// All your page methods needs to have some return type

	private final By textboxUsername = By.xpath("//input[@placeholder='Username']");
	private final By textboxPassword = By.xpath("//input[@placeholder='Password']");
	private final By buttonLogin = By.xpath("//button[@type='submit']");

	public OrangeHRMLoginPage enterUserName(String username) {
		sendKeys(textboxUsername, username, "present");
		return this;
	}

	public OrangeHRMLoginPage enterPassword(String password) {
		sendKeys(textboxPassword, password, "present");
		return this;
	}

	public OrangeHRMHomePage clickLogin() {
		click(buttonLogin, "clickable");
		return new OrangeHRMHomePage();
	}

	public String getPageTitle() {
		return getTitle();
	}

}

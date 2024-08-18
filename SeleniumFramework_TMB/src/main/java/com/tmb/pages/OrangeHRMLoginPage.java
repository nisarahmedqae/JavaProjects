package com.tmb.pages;

import org.openqa.selenium.By;

import com.tmb.driver.DriverManager;

public final class OrangeHRMLoginPage {
	// All your page methods needs to have some return type

	private final By textboxUsername = By.xpath("//input[@placeholder='Username']");
	private final By textboxPassword = By.xpath("//input[@placeholder='Password']");
	private final By buttonLogin = By.xpath("//button[@type='submit']");

	public OrangeHRMLoginPage enterUserName(String username) {
		DriverManager.getDriver().findElement(textboxUsername).sendKeys(username);
		return this;
	}

	public OrangeHRMLoginPage enterPassword(String password) {
		DriverManager.getDriver().findElement(textboxPassword).sendKeys(password);
		return this;
	}

	public OrangeHRMHomePage clickLogin() {
		DriverManager.getDriver().findElement(buttonLogin).click();
		return new OrangeHRMHomePage();
	}

	public String getTitle() {
		return DriverManager.getDriver().getTitle();
	}

}

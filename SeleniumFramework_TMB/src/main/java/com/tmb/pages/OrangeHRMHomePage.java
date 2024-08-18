package com.tmb.pages;

import org.openqa.selenium.By;

public class OrangeHRMHomePage extends BasePage {

	private final By linkWelcome = By.xpath("//span[@class='oxd-userdropdown-tab']");
	private final By linkLogout = By.linkText("Logout");

	public OrangeHRMHomePage clickWelcome() {
		click(linkWelcome, "present");
		return this;
	}

	public OrangeHRMLoginPage clickLogout() {
		click(linkLogout, "clickable");
		return new OrangeHRMLoginPage();
	}

}

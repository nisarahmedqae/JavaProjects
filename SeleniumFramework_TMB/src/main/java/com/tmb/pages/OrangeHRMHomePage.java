package com.tmb.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tmb.driver.DriverManager;

public class OrangeHRMHomePage {

	private final By linkWelcome = By.xpath("//span[@class='oxd-userdropdown-tab']");
	private final By linkLogout = By.linkText("Logout");

	public OrangeHRMHomePage clickWelcome() {
		DriverManager.getDriver().findElement(linkWelcome).click();
		return this;
	}

	public OrangeHRMLoginPage clickLogout() {
		// Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
		new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(linkLogout));
		DriverManager.getDriver().findElement(linkLogout).click();
		return new OrangeHRMLoginPage();
	}

}

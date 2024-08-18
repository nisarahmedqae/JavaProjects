package com.tmb.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tmb.constants.FrameworkConstants;
import com.tmb.driver.DriverManager;

public class BasePage {

	// Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
	
	protected void click(By by, String waitstrategy) {
		if(waitstrategy.equalsIgnoreCase("clickable")) {
			explicitlyWaitForTheElementToBeClicable(by);
		}else if(waitstrategy.equalsIgnoreCase("present")) {
			explicitlyWaitForTheElementToBePresent(by);
		}
		
		DriverManager.getDriver().findElement(by).click();
	}

	protected void sendKeys(By by, String value, String waitstrategy) {
		if(waitstrategy.equalsIgnoreCase("clickable")) {
			explicitlyWaitForTheElementToBeClicable(by);
		}else if(waitstrategy.equalsIgnoreCase("present")) {
			explicitlyWaitForTheElementToBePresent(by);
		}
		
		DriverManager.getDriver().findElement(by).sendKeys(value);
	}
	
	protected String getTitle() {
		return DriverManager.getDriver().getTitle();
	}
	
	private void explicitlyWaitForTheElementToBeClicable(By by) {
		new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getExplicitWait()))
		.until(ExpectedConditions.elementToBeClickable(by));
	}
	
	private void explicitlyWaitForTheElementToBePresent(By by) {
		new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getExplicitWait()))
		.until(ExpectedConditions.presenceOfElementLocated(by));
	}

}

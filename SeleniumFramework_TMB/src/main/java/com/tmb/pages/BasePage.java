package com.tmb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.tmb.driver.DriverManager;
import com.tmb.enums.WaitStrategy;
import com.tmb.factories.ExplicitWaitFactory;

public class BasePage {

	// Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
	
	protected void click(By by, WaitStrategy waitstrategy) {
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitstrategy, by);
		element.click();
	}

	protected void sendKeys(By by, String value, WaitStrategy waitstrategy) {
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitstrategy, by);
		element.sendKeys(value);
	}
	
	protected String getTitle() {
		return DriverManager.getDriver().getTitle();
	}

}

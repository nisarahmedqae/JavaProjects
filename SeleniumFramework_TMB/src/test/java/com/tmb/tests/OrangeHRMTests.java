package com.tmb.tests;

import java.time.Duration;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import com.tmb.driver.DriverManager;
import com.tmb.pages.OrangeHRMLoginPage;

public final class OrangeHRMTests extends BaseTest {
	private OrangeHRMTests() {

	}

	@Test
	public void loginLogoutTest() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String title = new OrangeHRMLoginPage().enterUserName("Admin").enterPassword("admin123").clickLogin()
				.clickWelcome().clickLogout().getTitle();
		
		Assertions.assertThat(title)
		.isEqualTo("OrangeHRM");
	}

}

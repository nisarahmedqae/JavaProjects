package com.tmb.tests;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import com.tmb.pages.OrangeHRMLoginPage;

public final class OrangeHRMTests extends BaseTest {
	private OrangeHRMTests() {

	}

	@Test
	public void loginLogoutTest() {
		String title = new OrangeHRMLoginPage().enterUserName("Admin").enterPassword("admin123").clickLogin()
				.clickWelcome().clickLogout().getPageTitle();
		
		Assertions.assertThat(title)
		.isEqualTo("OrangeHRM");
	}

}

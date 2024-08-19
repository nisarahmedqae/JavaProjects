package com.tmb.tests;

import org.assertj.core.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.tmb.pages.OrangeHRMLoginPage;

public final class OrangeHRMTests extends BaseTest {
	private OrangeHRMTests() {

	}

	@Test(dataProvider = "LoginTestData")
	public void loginLogoutTest(String username, String password) {
		String title = new OrangeHRMLoginPage().enterUserName(username).enterPassword(password).clickLogin()
				.clickWelcome().clickLogout().getPageTitle();

		Assertions.assertThat(title).isEqualTo("OrangeHRM");
	}

	@DataProvider(name = "LoginTestData", parallel = true)
	public Object[][] getData() {
		return new Object[][] { { "Admin", "admin123" }, { "Admin123", "admin1234" }, { "Admin123", "admin1234" },
				{ "Admin123", "admin1234" } };
	}

}

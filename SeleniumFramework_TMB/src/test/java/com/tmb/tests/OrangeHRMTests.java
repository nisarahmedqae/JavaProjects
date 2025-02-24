package com.tmb.tests;

import java.util.Map;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import com.tmb.pages.OrangeHRMLoginPage;
import com.tmb.utils.DataProviderUtils;

public final class OrangeHRMTests extends BaseTest {
	private OrangeHRMTests() {

	}

	@Test
	public void loginLogoutTest(Map<String, String> data) {
		String title = new OrangeHRMLoginPage().enterUserName(data.get("username")).enterPassword(data.get("password"))
				.clickLogin().clickWelcome().clickLogout().getPageTitle();

		Assertions.assertThat(title).isEqualTo("OrangeHRM");
	}

	@Test
	public void newTest(Map<String, String> data) {
		String title = new OrangeHRMLoginPage().enterUserName(data.get("username")).enterPassword(data.get("password"))
				.clickLogin().clickWelcome().clickLogout().getPageTitle();

		Assertions.assertThat(title).isEqualTo("OrangeHRM");
	}

}

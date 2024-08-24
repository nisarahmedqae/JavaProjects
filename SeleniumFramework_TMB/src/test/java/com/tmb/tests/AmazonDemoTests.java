package com.tmb.tests;

import java.util.Map;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import com.tmb.pages.AmazonHomePage;

public final class AmazonDemoTests extends BaseTest {

	private AmazonDemoTests() {
	}

	@Test
	public void amazonTest(Map<String, String> data) {
		String title = new AmazonHomePage().clickHamburger().clickComputer().clickOnSubMenuItem(data.get("menutext"))
				.getPageTitle();
		Assertions.assertThat(title).isNotNull().isNotBlank();
	}
}

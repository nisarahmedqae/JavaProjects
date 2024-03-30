package Tests;

import org.testng.annotations.Test;

public class day4 {

	@Test(groups = { "Smoke" })
	public void WebLoginHomeLoan() {
		System.out.println("WebLoginHome");
	}

	@Test
	// @Test(enabled=false)
	public void MobileLoginHomeLoan() {
		System.out.println("MobileLoginHome");
	}

	@Test(dependsOnMethods = { "MobileLoginHomeLoan" })
	public void ApiLoginHomeLoan() {
		System.out.println("ApiLoginHome");
	}
}

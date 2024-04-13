package eCommerce;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class eCommerce_tc_1 extends eBaseTest {

	@Test
	public void FillForm() {
		// Enter name field
		driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("Nisar Tester");
		driver.hideKeyboard(); // to hide already opened keyboard

		// Select gender as female
		driver.findElement(AppiumBy.xpath("//android.widget.RadioButton[@text='Female']")).click();

		// Click on country select dropdown
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry")).click();

		// Scrol to India
		scrollToElement("India");

		// Click on India
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='India']")).click();

		// Click on Shop button
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();

	}

}

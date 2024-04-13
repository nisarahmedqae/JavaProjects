package eCommerce;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ToastMessage extends eBaseTest {

	@Test
	public void ToastMessageTest() {
		// Select gender as female
		driver.findElement(AppiumBy.xpath("//android.widget.RadioButton[@text='Female']")).click();

		// Click on Shop button
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();

		// Get Toast message
		String toastMessage = driver.findElement(AppiumBy.xpath("//android.widget.Toast[1]")).getAttribute("name");
		System.out.println(toastMessage);

	}

}

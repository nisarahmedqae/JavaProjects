package eCommerce;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class eCommerce_tc_2 extends eBaseTest {

	@Test
	public void FillForm() throws InterruptedException {
		// Enter name field
		driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("Nisar Tester");
		driver.hideKeyboard(); // to hide already opened keyboard

		// Select gender as female
		driver.findElement(AppiumBy.xpath("//android.widget.RadioButton[@text='Female']")).click();

		// Click on Shop button
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();

		// Scrol to Jordan 6 Rings
		// scrollToElement("Jordan 6 Rings");

		// Get product list
		List<WebElement> productsList = driver.findElements(AppiumBy
				.xpath("//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productName']"));

		productsList.stream().filter(s -> s.getText().equalsIgnoreCase("Air Jordan 1 Mide SE"))
				.forEach(s -> s.findElement(AppiumBy.xpath(
						"//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productAddCart']"))
						.click());

		Thread.sleep(3000);
	}

}

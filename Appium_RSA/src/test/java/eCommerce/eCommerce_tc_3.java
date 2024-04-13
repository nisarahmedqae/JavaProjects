package eCommerce;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class eCommerce_tc_3 extends eBaseTest {

	@Test
	public void FillForm() throws InterruptedException {
		// Enter name field
		driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("Nisar Tester");
		driver.hideKeyboard(); // to hide already opened keyboard

		// Select gender as female
		driver.findElement(AppiumBy.xpath("//android.widget.RadioButton[@text='Female']")).click();

		// Click on Shop button
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();

		// Add products to cart
		for (int i = 0; i < 2; i++) {
			driver.findElements(AppiumBy.xpath(
					"//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productAddCart']"))
					.get(i).click();
		}

		// Go to cart menu
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

		WebElement cartTitleElement = driver
				.findElement(AppiumBy.id("com.androidsample.generalstore:id/toolbar_title"));

		// Wait until element attribute changes to required value
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.attributeContains(cartTitleElement, "text", "Cart"));

		List<WebElement> pricesList = driver
				.findElements(AppiumBy.id("com.androidsample.generalstore:id/productPrice"));

		double calculatedSum = 0;
		for (int i = 0; i < pricesList.size(); i++) {
			String price = pricesList.get(i).getText();
			String splittedPrice = price.substring(1);
			double parsedAmount = Double.parseDouble(splittedPrice);
			System.out.println(parsedAmount);

			calculatedSum = calculatedSum + parsedAmount;
		}
		System.out.println(calculatedSum);

		String totalAmount = driver
				.findElement(AppiumBy.xpath(
						"//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/totalAmountLbl']"))
				.getText();
		String splittedTotalAmount = totalAmount.substring(2);
		double parsedTotalAmount = Double.parseDouble(splittedTotalAmount);
		System.out.println(parsedTotalAmount);

	}

}

package eCommerce;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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
		scrollToElement("Jordan 6 Rings");

		// Get product list
		List<WebElement> productsList = driver.findElements(AppiumBy
				.xpath("//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productName']"));

		productsList.stream().filter(s -> s.getText().equalsIgnoreCase("Jordan 6 Rings")).forEach(s -> {
			WebElement addToCartButton = driver.findElement(AppiumBy.xpath(
					"//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productAddCart']"));
			addToCartButton.click();
		});

		// Go to cart menu
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

		WebElement cartTitleElement = driver
				.findElement(AppiumBy.id("com.androidsample.generalstore:id/toolbar_title"));

		// Wait until element attribute changes to required value
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.attributeContains(cartTitleElement, "text", "Cart"));

		String addedProducts = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/productName"))
				.getText();

		Assert.assertEquals(addedProducts, "Jordan 6 Rings");
	}

}

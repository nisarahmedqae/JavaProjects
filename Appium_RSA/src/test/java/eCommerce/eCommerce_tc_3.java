package eCommerce;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

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

		// long press terms conditions
		WebElement termsClick = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/termsButton"));
		longPressAction(termsClick);

		String termsText = driver
				.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id='android:id/message']")).getText();
		System.out.println(termsText);

		// Close the terms
		driver.findElement(AppiumBy.id("android:id/button1")).click();

		// checkbox tick
		driver.findElement(AppiumBy.className("android.widget.CheckBox")).click();

		// complete purchase
		driver.findElement(AppiumBy.className("android.widget.Button")).click();
		Thread.sleep(6000);

		// As we shifted from App to WebView we need to get handles to switch
		Set<String> contexts = driver.getContextHandles();

		for (String contextName : contexts) {
			System.out.println(contextName);
		}

		driver.context("WEBVIEW_com.androidsample.generalstore");

		// work on browser
		driver.findElement(By.name("q")).sendKeys("rahul shetty academy");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.context("NATIVE_APP");
	}

}

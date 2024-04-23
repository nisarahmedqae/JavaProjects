package nahmed;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class LongPress extends BaseTest {

	@Test
	public void LongPressGesture() {
		// Click on Views option
		driver.findElement(AppiumBy.accessibilityId("Views")).click();

		// Click on Expandable Lists
		driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();

		// Long Press on Custom Adapter
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();

		// Long Press on Custom Adapter
		WebElement peopleNamesEle = driver
				.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"People Names\"]"));
		longClickGesture(peopleNamesEle);

		// get text of long press menu option
		String optionText = driver
				.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id='android:id/title']")).getText();
		System.out.println("Text fetched: " + optionText);
		Assert.assertEquals(optionText, "Sample menu");
	}

}

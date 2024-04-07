package nahmed;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class SwipeDemo2 extends BaseTest {

	@Test
	public void SwipeDemoTest() {
		// Click on Views option
		driver.findElement(AppiumBy.accessibilityId("Views")).click();

		// Click on Gallery option
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();

		// Click on Photos option
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"1. Photos\"]")).click();

		// first photo is selected by default, swipe and check its state again
		WebElement firstPhoto = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[1]"));
		Assert.assertEquals(firstPhoto.getAttribute("focusable"), "true");

		swipeAction(firstPhoto, "left", 0.1);

		Assert.assertEquals(firstPhoto.getAttribute("focusable"), "false");
	}

}

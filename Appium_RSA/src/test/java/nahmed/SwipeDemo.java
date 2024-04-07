package nahmed;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class SwipeDemo extends BaseTest {

	@Test
	public void SwipeDemoTest() {
		// Click on Views option
		driver.findElement(AppiumBy.accessibilityId("Views")).click();

		// Click on Gallery option
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();

		// Click on Photos option
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"1. Photos\"]")).click();

		// Click on second photo and get its attribute value
		WebElement secondPhoto = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[2]"));
		String focusableTextBefore = secondPhoto.getAttribute("focusable");
		System.out.println(focusableTextBefore);
		secondPhoto.click();
		String focusableTextAfter = secondPhoto.getAttribute("focusable");
		System.out.println(focusableTextAfter);
	}

}

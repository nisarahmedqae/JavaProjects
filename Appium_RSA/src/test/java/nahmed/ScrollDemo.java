package nahmed;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ScrollDemo extends BaseTest {

	@Test
	public void LongPressGesture() {
		// Click on Views option
		driver.findElement(AppiumBy.accessibilityId("Views")).click();

		// Where to scroll in known prior
		scrollToElement("WebView");

		// No prior idea where to scroll
		// scrollToEndAction();
	}

}

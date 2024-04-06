package nahmed;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;

public class AppiumBasics extends BaseTest {

	@Test
	public void WifiSettingsName() {
		// Click on preference option
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();

		// Click on preference dependencies
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]"))
				.click();

		// Click on Wifi checkbox
		driver.findElement(AppiumBy.id("android:id/checkbox")).click();

		// Click on Wifi settings
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='WiFi settings']")).click();

		// get title
		String title = driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
		System.out.println("This is the title fetched: " + title);
		Assert.assertEquals(title, "WiFi settings");

		// write wifi name
		driver.findElement(AppiumBy.id("android:id/edit")).sendKeys("nHome");

		// Click OK button
		driver.findElement(AppiumBy.id("android:id/button1")).click();
	}

}

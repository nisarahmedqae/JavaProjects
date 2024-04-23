package nahmed;

import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class MiscellaneousAppiumActions extends BaseTest {
	// To capture mobile activity
	// adb shell dumpsys window | find "mCurrentFocus"

	@Test
	public void SwipeDemoTest() {
		// Go to preference dependencies through mobile activity
		startActivity("io.appium.android.apis/io.appium.android.apis.preference.PreferenceDependencies");

		// Click on Wifi checkbox
		driver.findElement(AppiumBy.id("android:id/checkbox")).click();

		// Rotate the device orientation
		DeviceRotation landscape = new DeviceRotation(0, 0, 90);
		driver.rotate(landscape);

		// Click on Wifi settings
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='WiFi settings']")).click();

		// get title
		String title = driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
		System.out.println("This is the title fetched: " + title);
		Assert.assertEquals(title, "WiFi settings");

		// write wifi name using clipboard copy/paste
		driver.setClipboardText("nHome");
		driver.findElement(AppiumBy.id("android:id/edit")).sendKeys(driver.getClipboardText());
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));

		// Click OK button
		driver.findElement(AppiumBy.id("android:id/button1")).click();

		// go to home
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
	}

}

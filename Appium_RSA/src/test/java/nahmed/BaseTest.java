package nahmed;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {

	public AppiumDriverLocalService service;
	public AndroidDriver driver;

	@BeforeClass
	public void ConfigureAppium() throws MalformedURLException {
		service = new AppiumServiceBuilder()
				.withAppiumJS(
						new File("C:\\Users\\iamni\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();

		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Pixel 3");
		options.setApp(new File("src/test/java/resources/ApiDemos-debug.apk").getAbsolutePath());

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public void longPressAction(WebElement ele) {
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) ele).getId(), "duration", 2000));
	}

	public void swipeAction(WebElement ele, String direction, double percent) {
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of("elementId",
				((RemoteWebElement) ele).getId(), "direction", direction, "percent", percent));
	}

	public void dragGestureAction(WebElement ele, int endX, int endY) {
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) ele).getId(), "endX", endX, "endY", endY));
	}

	public void startActivity(String intent) {
		((JavascriptExecutor) driver).executeScript("mobile: startActivity", ImmutableMap.of("intent", intent));
	}

	public void scrollToEndAction() {
		boolean canScrollMore;
		do {
			canScrollMore = (boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap
					.of("left", 100, "top", 100, "width", 200, "height", 200, "direction", "down", "percent", 3.0));
		} while (canScrollMore);
	}

	public void scrollToElement(String elementName) {
		String uiAutomatorExpression = String.format("new UiScrollable(new UiSelector()).scrollIntoView(text(\"%s\"));",
				elementName);
		driver.findElement(AppiumBy.androidUIAutomator(uiAutomatorExpression));
	}

	@AfterClass
	public void tearDown() {
		// driver.quit();
		service.stop();
	}

}

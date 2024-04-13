package nahmed;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class DragAndDropDemo extends BaseTest {

	@Test
	public void SwipeDemoTest() {
		// Click on Views option
		driver.findElement(AppiumBy.accessibilityId("Views")).click();

		// Click on Drag and Drop option
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();

		WebElement sourceElement = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));

		dragGestureAction(sourceElement, 645, 576);

		String draggedText = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_result_text")).getText();
		System.out.println(draggedText);
	}

}

package section10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		// select droppable link: it will start with anchor a
		driver.findElement(By.linkText("Droppable")).click();

		// get the count of frames //Outside frame
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		// driver.switchTo().frame(0); //for switching to default frame

		// switch to frame by className
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		// using actions class to perform drag and drop operation
		Actions actions = new Actions(driver);

		WebElement sourceElement = driver.findElement(By.cssSelector("#draggable"));
		WebElement targetElement = driver.findElement(By.cssSelector("#droppable"));

		actions.dragAndDrop(sourceElement, targetElement).build().perform();

		// get the count of frames //Inside frame
		System.out.println(driver.findElements(By.tagName("iframe")).size());

		// switch to main default page
		driver.switchTo().defaultContent();

		driver.quit();
	}

}

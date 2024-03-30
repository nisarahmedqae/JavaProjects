package nahmed;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().setSize(new Dimension(1440, 900));
		driver.manage().window().maximize();

		WebElement mousehover = driver.findElement(By.id("mousehover"));
		System.out.println(mousehover.getLocation().getX());
		System.out.println(mousehover.getLocation().getY());

		//scrollTo sets the absolute position of the window scroll.
		//scrollBy scrolls the window by a specified amount relative to its current position.
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(22,1371)");
		Thread.sleep(5000);

		driver.quit();
	}

}

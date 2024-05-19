package nisarahmedqae.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	// scrollTo sets the absolute position of the window scroll.
	// scrollBy scrolls the window by a specified amount relative to its current
	// position.

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/List_of_countries_and_dependencies_by_population");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		// Scroll by 200 pixels horizontally and 0 pixels vertically
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 4000)");
		Thread.sleep(3000);

		// Scroll to the top of the page (coordinates: 0,0)
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		Thread.sleep(3000);

		driver.quit();

	}
}
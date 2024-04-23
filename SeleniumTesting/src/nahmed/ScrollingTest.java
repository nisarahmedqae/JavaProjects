package nahmed;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingTest {

	// scrollTo sets the absolute position of the window scroll.
	// scrollBy scrolls the window by a specified amount relative to its current
	// position.

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/List_of_countries_and_dependencies_by_population");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		// Find the element for Switzerland
		WebElement switzerland = driver.findElement(By.xpath("//a[@title='Switzerland']"));
		System.out.println("Switzerland Location: " + switzerland.getLocation());

		// Scroll to the Switzerland element using scrollIntoView
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", switzerland);
		Thread.sleep(3000);

		// Scroll by 200 pixels horizontally and 0 pixels vertically
		((JavascriptExecutor) driver).executeScript("window.scrollBy(200, 0)");
		Thread.sleep(3000);

		// Scroll to the element with id 'cite_note-230'
		WebElement ele200 = driver.findElement(By.xpath("//li[@id='cite_note-230']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele200);
		Thread.sleep(3000);

		// Scroll to the top of the page (coordinates: 0,0)
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		Thread.sleep(3000);

		driver.quit();

	}
}
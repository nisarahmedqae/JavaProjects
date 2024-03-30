package section7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// search in country field with "Ind"
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");

		// get all country options containing "Ind"
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		// search and click on india
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("india")) {
				option.click();
				break;
			}
		}

		driver.quit();

	}

}

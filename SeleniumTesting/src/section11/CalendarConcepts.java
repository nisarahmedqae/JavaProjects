package section11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarConcepts {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().setSize(new Dimension(1440, 900));
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,104)");

		// click on "date of travel" field
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement dateField = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("form-field-travel_comp_date")));
		dateField.click();

		// select all dates in calendar
		List<WebElement> dates = driver.findElements(By.cssSelector(".flatpickr-day"));

		// get the size of calendar
		int count = driver.findElements(By.cssSelector(".flatpickr-day")).size();

		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.cssSelector(".flatpickr-day")).get(i).getText();

			if (text.equalsIgnoreCase("23")) {
				driver.findElements(By.cssSelector(".flatpickr-day")).get(i).click();
				break;
			}
		}

		driver.quit();
	}

}

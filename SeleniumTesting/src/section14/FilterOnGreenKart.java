package section14;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FilterOnGreenKart {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// search rice in the search bar
		driver.findElement(By.id("search-field")).sendKeys("Rice");

		// Suppose if filter function is broken then it will show whole list i.e 5
		List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));

		// after filtering with method now it will show only 1 result i.e. Rice
		List<WebElement> filteredList = veggies.stream().filter(veggie -> veggie.getText().contains("Rice"))
				.collect(Collectors.toList());

		Assert.assertEquals(veggies.size(), filteredList.size());
		
		driver.quit();
	}

}

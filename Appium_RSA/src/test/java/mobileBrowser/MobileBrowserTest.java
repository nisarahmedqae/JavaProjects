package mobileBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MobileBrowserTest extends Base {

	@Test
	public void browserTest() {
		driver.get("https://www.google.com/");
		System.out.println("Browser Title fetched: " + driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("rahul shetty academy");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Test(priority = 2)
	public void angularWebsiteTest() {
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");

		// Click on hamburger menu
		driver.findElement(By.cssSelector("button[type='button']")).click();

		// Click on products
		driver.findElement(By.cssSelector("a[routerlink='/products']")).click();

		// Scroll to DevOps
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)");

		// fetch product names
		List<WebElement> productList = driver.findElements(By.className("mt-0"));
		productList.stream().map(s -> s.getText()).forEach(s -> System.out.println(s));
	}

}

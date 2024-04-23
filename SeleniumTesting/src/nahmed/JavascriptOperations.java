package nahmed;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavascriptOperations {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		// Create object of Javascript
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Enter Email field
		WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
		Email.clear();
		js.executeScript("arguments[0].value = 'admin@yourstore.com';", Email);

		// Enter Password field
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.clear();
		js.executeScript("arguments[0].value = 'admin';", Password);

		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		js.executeScript("arguments[0].click();", loginButton);

		String expectedTitle = "Dashboard / nopCommerce administration";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);

		driver.quit();

	}

}

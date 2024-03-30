package nahmed;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonTesting {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Actions actions = new Actions(driver);

		// move to signIn element and click
		WebElement signInEle = driver.findElement(By.id("nav-link-accountList"));
		actions.moveToElement(signInEle).click().perform();

		// enter username
		WebElement userName = driver.findElement(By.id("ap_email"));
		userName.click();
		userName.sendKeys("nisarahmed812@gmail.com");

		driver.findElement(By.id("continue")).click();

		// enter password
		WebElement password = driver.findElement(By.id("ap_password"));
		password.click();
		password.sendKeys("Testpass@123");
		password.sendKeys(Keys.ENTER);

		// click on search field
		WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
		searchField.click();
		searchField.sendKeys("xiaomi 14");
		searchField.sendKeys(Keys.ENTER);

		driver.close();
	}

}

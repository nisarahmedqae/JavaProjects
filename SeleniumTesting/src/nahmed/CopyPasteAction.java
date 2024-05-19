package nahmed;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CopyPasteAction {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://only-testing-blog.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Locate the name input field
		WebElement firstName = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='FirstName']")));
		Actions actions = new Actions(driver);

		// Enter text into the first input field
		actions.moveToElement(firstName).click().sendKeys("ahmed").perform();
		Thread.sleep(2000);

		// Copy the text from the first input field
		actions.moveToElement(firstName).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL)
				.perform();
		Thread.sleep(2000);

		// Locate the email input field
		WebElement email = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='EmailID']")));

		// Paste the copied text into the second input field and append "@gmail.com"
		actions.moveToElement(email).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL)
				.sendKeys("@gmail.com").perform();
		Thread.sleep(2000);

		driver.quit();

	}
}

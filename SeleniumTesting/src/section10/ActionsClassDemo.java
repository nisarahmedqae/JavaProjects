package section10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		// build and perform is present to perform composite action from actions class
		Actions actions = new Actions(driver);

		// select element where we need to move mouse cursor
		WebElement move = driver.findElement(By.id("mousehover"));
		actions.moveToElement(move).build().perform(); // move to mousehover section

		// move to "Switch To Alert Example" section
		actions.moveToElement(driver.findElement(By.id("name"))).click().keyDown(Keys.SHIFT).sendKeys("hello")
				.doubleClick().build().perform();
		actions.moveToElement(driver.findElement(By.id("name"))).contextClick().build().perform();

		driver.quit();
	}

}

package nahmed;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://tools.pingdom.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Actions actions = new Actions(driver);

		WebElement titleField = driver.findElement(By.xpath("//h1[@class='ng-tns-c3-0']"));

		// Hover Over
		actions.moveToElement(titleField).perform();
		Thread.sleep(2000);

		// Double Click
		actions.doubleClick(titleField).perform();
		Thread.sleep(2000);

		// Right Click
		actions.contextClick(titleField).perform();
		Thread.sleep(2000);

		driver.quit();
	}

}

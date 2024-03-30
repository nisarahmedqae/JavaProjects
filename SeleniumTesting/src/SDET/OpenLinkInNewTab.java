package SDET;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenLinkInNewTab {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		/*********************************************************/
		driver.get("https://jqueryui.com/tooltip/");

		WebElement draggableEle = driver.findElement(By.linkText("Draggable"));
		String keysEntered = Keys.chord(Keys.CONTROL, Keys.ENTER);
		draggableEle.sendKeys(keysEntered);
		Thread.sleep(3000);

		driver.quit();
	}

}

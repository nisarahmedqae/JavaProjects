package SDET;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserNotifications {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		// to dismiss browser notifications
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		driver.get("https://redbus.in");
		Thread.sleep(3000);

		driver.quit();
	}

}

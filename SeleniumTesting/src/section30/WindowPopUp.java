package section30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		// window authentication pop-up
		driver.get("https://admin:admin@the-internet.herokuapp.com");

		driver.findElement(By.linkText("Basic Auth")).click();
		driver.close();
	}

}

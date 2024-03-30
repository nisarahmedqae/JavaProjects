package section7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.spicejet.com/");

		// click on FROM field
		driver.findElement(By.cssSelector("div[data-testid='to-testID-origin']")).click();

		// select from "FROM" field
		System.out.println(driver.findElement(By.xpath("//div[text()='Bengaluru']")).getText());
		driver.findElement(By.xpath("//div[text()='Bengaluru']")).click();
		
		// select from "TO" field
		System.out.println(driver.findElement(By.xpath("//div[text()='Ajmer']")).getText());
		driver.findElement(By.xpath("//div[text()='Ajmer']")).click();

		driver.quit();
	}

}

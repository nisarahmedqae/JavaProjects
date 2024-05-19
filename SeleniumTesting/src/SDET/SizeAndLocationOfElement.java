package SDET;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SizeAndLocationOfElement {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		/*********************************************************/
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");

		WebElement usernameEle = driver.findElement(By.id("username"));

		// Location - method1
		System.out.println("Location(x,y) : " + usernameEle.getLocation());
		System.out.println("Location(x) : " + usernameEle.getLocation().getX());
		System.out.println("Location(y) : " + usernameEle.getLocation().getY());

		// Location - method2
		System.out.println("Location(x) : " + usernameEle.getRect().getX());
		System.out.println("Location(y) : " + usernameEle.getRect().getY());

		// Size - method1
		System.out.println("Size(Width,Height) : " + usernameEle.getSize());
		System.out.println("Size(Width) : " + usernameEle.getSize().getWidth());
		System.out.println("Size(Height) : " + usernameEle.getSize().getHeight());

		// Size - method2
		System.out.println("Size(Width) : " + usernameEle.getRect().getDimension().getWidth());
		System.out.println("Size(Height) : " + usernameEle.getRect().getDimension().getHeight());

		driver.quit();
	}

}

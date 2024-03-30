package SDET;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsAlerts {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		// Alert window with OK button
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println(driver.findElement(By.id("result")).getText());

		// Alert window with OK & Cancel button
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		alert.dismiss();
		System.out.println(driver.findElement(By.id("result")).getText());
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		alert.accept();
		System.out.println(driver.findElement(By.id("result")).getText());

		// Alert window with input box, capture text from alert
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		System.out.println(alert.getText());
		alert.sendKeys("Message putted on alert");
		alert.accept();
		System.out.println(driver.findElement(By.id("result")).getText());

		driver.quit();
	}

}

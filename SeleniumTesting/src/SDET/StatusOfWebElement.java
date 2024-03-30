package SDET;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusOfWebElement {

	/*
	 * isDisplayed: Checks if the element is visible on the page. 
	 * isSelected: Checks if the element is selected (usually used with checkboxes, radio buttons).
	 * isEnabled: Checks if the element is enabled for interaction.
	 */

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement selectCountry = driver.findElement(By.id("autocomplete"));
		System.out.println(selectCountry.isDisplayed());
		System.out.println(selectCountry.isEnabled());

		WebElement checkBoxOption1 = driver.findElement(By.id("checkBoxOption1"));
		System.out.println(checkBoxOption1.isSelected());
		checkBoxOption1.click();
		System.out.println(checkBoxOption1.isSelected());

		driver.quit();
	}

}

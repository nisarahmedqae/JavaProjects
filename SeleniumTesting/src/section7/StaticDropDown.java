package section7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//DropDown with 'Select' tag
		//TagName Select means static dropdown
		
		// select currency dropdown field
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select select = new Select(staticDropdown);
		
		select.selectByIndex(0);
		System.out.println(select.getFirstSelectedOption().getText());
	
		select.selectByVisibleText("USD");
		System.out.println(select.getFirstSelectedOption().getText());
		
		select.selectByValue("AED");
		System.out.println(select.getFirstSelectedOption().getText());

		driver.quit();
	}

}

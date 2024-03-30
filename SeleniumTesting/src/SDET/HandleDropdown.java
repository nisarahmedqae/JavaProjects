package SDET;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement selectDropdown = driver.findElement(By.id("dropdown-class-example"));
		Select select = new Select(selectDropdown);
		List<WebElement> selectDropdownOptions = select.getOptions();

		for (WebElement ele : selectDropdownOptions) {
			if (ele.getText().equalsIgnoreCase("option2")) {
				ele.click();
				System.out.println(ele.getText());
				break;
			}
		}
		
		driver.quit();

	}

}

package SDET;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleMultipleDropDowns {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");

		WebElement greenEle = driver.findElement(By.id("oldSelectMenu"));
		selectOptionFromDropDown(greenEle, "Green");

		WebElement carsEle = driver.findElement(By.name("cars"));
		selectOptionFromDropDown(carsEle, "volvo");

		driver.quit();
	}

	public static void selectOptionFromDropDown(WebElement selectDropdown, String selectValue) {
		Select select = new Select(selectDropdown);
		List<WebElement> selectDropdownOptions = select.getOptions();

		for (WebElement ele : selectDropdownOptions) {
			if (ele.getText().equalsIgnoreCase(selectValue)) {
				ele.click();
				System.out.println(ele.getText());
				break;
			}
		}
	}

}

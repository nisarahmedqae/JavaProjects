package SDET;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");

		// Product Type
		driver.findElement(By.linkText("Select Product Type")).click();
		List<WebElement> productTypes = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		System.out.println(productTypes.size());

		for (WebElement ptype : productTypes) {
			if (ptype.getText().equals("Accounts")) {
				ptype.click();
				break;
			}
		}

		// Product
		driver.findElement(By.linkText("Select Product")).click();
		List<WebElement> products = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
		System.out.println(products.size());

		for (WebElement product : products) {
			if (product.getText().equals("Savings Accounts")) {
				product.click();
				break;
			}
		}

		driver.quit();
	}
}
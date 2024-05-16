package nahmed;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTesting {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// search a phone
		WebElement searchField = driver.findElement(By.className("Pke_EE"));
		searchField.click();
		searchField.sendKeys("xiaomi 14");
		searchField.sendKeys(Keys.ENTER);

		// select xiaomi 14 white variant
		List<WebElement> mobilesList = driver.findElements(By.className("_4rR01T"));
		for (WebElement mobileName : mobilesList) {
			if (mobileName.getText().equalsIgnoreCase("Xiaomi 14 (White, 512 GB)")) {
				mobileName.click();
			}
		}

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();

		driver.switchTo().window(childWindow);

		System.out.println(driver.getTitle());

		WebElement productPrice = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
		System.out.println(productPrice.getText());

		driver.quit();
	}

}

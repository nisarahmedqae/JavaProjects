package section12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);

		// scroll on selected table "Web Table Fixed header"
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		Thread.sleep(3000);

		List<WebElement> amountValues = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));

		int sum = 0;
		for (WebElement value : amountValues) {
			String amount = value.getText();
			int intAmount = Integer.parseInt(amount);
			sum = sum + intAmount;
		}
		System.out.println(sum);

		String totalAmount = driver.findElement(By.cssSelector(".totalAmount")).getText();
		String splittedTotalAmount = totalAmount.split(":")[1].trim();
		System.out.println(splittedTotalAmount);
		int total = Integer.parseInt(splittedTotalAmount);
		System.out.println(total);

		driver.quit();
	}

}

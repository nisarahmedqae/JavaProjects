package section31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSiblingValue {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/upload-download-test/index.html");

		// get value of Banana
		String fruitName = "Orange";
		List<WebElement> fruitNamesList = driver
				.findElements(By.xpath("//div[@class='sc-hIPBNq eXWrwD rdt_TableBody']/div/div[2]"));
		for (WebElement ele : fruitNamesList) {
			if (ele.getText().equalsIgnoreCase(fruitName)) {
				String fruitPrice = ele.findElement(By.xpath("following-sibling::div[@id='cell-4-undefined']"))
						.getText();
				System.out.println(fruitName + " Price = " + fruitPrice);
			}
		}

		driver.close();
	}

}

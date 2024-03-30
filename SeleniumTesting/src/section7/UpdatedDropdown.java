package section7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.spicejet.com/");

		// verify if "Senior Citizen" is selected
		System.out.println(driver.findElement(By.xpath("//div[text()='Senior Citizen']")).isSelected());

		// verify if "Senior Citizen" is selected after click
		driver.findElement(By.xpath("//div[text()='Senior Citizen']")).click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Senior Citizen']")).isSelected());

		// click on "Passengers" field
		driver.findElement(By.xpath("//div[contains(text(),'1 Adult')]")).click();

		// print "Passengers" field text
		System.out.println(driver.findElement(By.cssSelector("div[data-testid='home-page-travellers']")).getText());

		int i = 0;
		while (i < 4) // loop to add 5 times as 1 is already selected by default
		{
			// add 5 adults
			driver.findElement(By.cssSelector("div[data-testid='Adult-testID-plus-one-cta']")).click();
			i++;
		}

		// click on done
		driver.findElement(By.cssSelector("div[data-testid='home-page-travellers-done-cta']"));

		// print "Passengers" field text after selection
		System.out.println(driver.findElement(By.cssSelector("div[data-testid='home-page-travellers']")).getText());

		// count the number of checkboxes
		System.out.println(
				driver.findElements(By.cssSelector("div[class='css-1dbjc4n'] div[style='cursor: pointer;']")).size());

		driver.quit();
	}

}

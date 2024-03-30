package section14;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class VeggiesListComparison {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// click on veg/fruit name column for sorting
		driver.findElement(By.xpath("//tr/th[1]")).click();

		// capture all column list into new(original) list
		List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));
		elementsList.stream().map(s -> s.getText()).forEach(s -> System.out.println(s));

		List<String> originalList = elementsList.stream().map(s -> s.getText()).collect(Collectors.toList());

		// sort in the list of step 3 -> sorted list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());

		// compare original list vs sorted list
		Assert.assertTrue(originalList.equals(sortedList));

		driver.quit();
	}

}

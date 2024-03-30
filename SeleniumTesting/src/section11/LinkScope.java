package section11;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkScope {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		// every link should have tag name "a"
		// Count of links on the page
		System.out.println(driver.findElements(By.tagName("a")).size());

		// limiting webdriver scope to only footer section
		// count of footer section
		WebElement footerSection = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerSection.findElements(By.tagName("a")).size());

		// links count of only 1st column of footer section
		WebElement columnSection = driver.findElement(By.xpath("//tr/td[1]/ul"));
		int columnSectionCount = columnSection.findElements(By.tagName("a")).size();
		System.out.println(columnSectionCount); // returning 5 size

		// click on each links and check if pages are opening
		// skipping link "0" index so starting with "1" index
		for (int i = 1; i < columnSectionCount; i++) {
			String clickonlinktab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columnSection.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
		}

		Set<String> windows = driver.getWindowHandles(); // 4
		Iterator<String> it = windows.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		driver.quit();
	}

}

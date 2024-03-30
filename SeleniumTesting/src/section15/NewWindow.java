package section15;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// open new window
		driver.switchTo().newWindow(WindowType.TAB);
		// driver.switchTo().newWindow(WindowType.WINDOW);

		// get window handles
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();

		// switch to childWindow
		driver.switchTo().window(childWindow);
		driver.get("https://courses.rahulshettyacademy.com/");
		String courseName = driver.findElement(By.cssSelector("div[title*='Postman']:nth-child(2)")).getText();

		// switch to parentWindow
		driver.switchTo().window(parentWindow);
		WebElement name = driver.findElement(By.name("name")); // Name Field
		name.sendKeys(courseName);

		driver.quit();
	}

}

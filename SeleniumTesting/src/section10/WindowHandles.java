package section10;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		// click on Free Access link to go to some other page
		driver.findElement(By.className("blinkingText")).click();

		Set<String> windowHandles = driver.getWindowHandles(); // [parentId, childId]
		Iterator<String> it = windowHandles.iterator();
		String parentId = it.next();
		String childId = it.next();

		// switch to child window
		driver.switchTo().window(childId);

		// get some text from child window
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());

		// through debug and watch mode trim the text
		String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].split("with")[0]
				.trim();
		System.out.println(emailId);
		
		// switch to parent window
		driver.switchTo().window(parentId);
		driver.findElement(By.name("username")).sendKeys(emailId);
		
		driver.quit();
	}

}

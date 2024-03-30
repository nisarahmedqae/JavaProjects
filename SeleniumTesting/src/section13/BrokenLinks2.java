package section13;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLinks2 {

	public static void main(String[] args) throws MalformedURLException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		SoftAssert softAssert = new SoftAssert();
		
		//get all the links
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for(WebElement link: links)
		{
			String url = link.getAttribute("href");
			
			HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
			int statusCode = connection.getResponseCode();
			System.out.println("Status Code: " + statusCode);
			connection.disconnect();
	        
	        softAssert.assertTrue(statusCode<400, "Broken Link = "+link.getText()+" & Status Code = " +statusCode);
	        
		}
		softAssert.assertAll();
		
		driver.quit();
	}

}

package section13;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Step 1: is to get all urls tied up to the links using selenium
		// Java methods will call urls and gets you the status code
		// if status code >400 then that url is not working i.e link tied up to url is
		// not working

		String url = driver.findElement(By.xpath("//a[text()='SoapUI']")).getAttribute("href");
		System.out.println(driver.findElement(By.xpath("//a[text()='SoapUI']")).getAttribute("href"));

		HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
		int statusCode = connection.getResponseCode();
		System.out.println("Status Code: " + statusCode);
		connection.disconnect();

		driver.quit();
	}

}

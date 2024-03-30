package SDET;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {
	/*
	 * get(): accepts only one string parameter
	 * navigate().to(): accepts only string parameter and URL instance as parameter
	 */

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		/*
		// Navigating to a URL using a String parameter
		driver.navigate().to("https://flipkart.com");
		
		// Navigating to a URL using a URL instance
		URL urlInstance = new URL("https://flipkart.com");
		driver.navigate().to(urlInstance);
		*/
		
		driver.get("https://flipkart.com");
		driver.get("https://amazon.in");

		driver.navigate().back();
		driver.navigate().forward();

		driver.navigate().refresh();

		driver.quit();

	}

}

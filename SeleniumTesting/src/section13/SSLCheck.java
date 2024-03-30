package section13;

import java.time.Duration;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck {

	public static void main(String[] args) {
		// for different browsers selenium has
		// EdgeOptions, FirefoxOptions, SafariOptions
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);

		/*
		//use of proxy in selenium
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipAddress: 4444");
		options.setCapability("proxy", proxy); 
		*/

		// passing ChromeOptions argument in SeleniumManager
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		System.out.println(driver.getTitle());

	}

}

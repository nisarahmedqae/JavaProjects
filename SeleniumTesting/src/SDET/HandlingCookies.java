package SDET;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingCookies {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		/*********************************************************/
		driver.get("https://demo.nopcommerce.com/");

		// How to capture cookies from browser
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println("Size of cookies: " + cookies.size()); // 3

		// How to print cookies from browser
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName() + " : " + cookie.getValue());
		}

		// How to add cookie to the browser
		Cookie cookieObj = new Cookie("myCookie", "thisIsCookie");
		driver.manage().addCookie(cookieObj);
		cookies = driver.manage().getCookies();
		System.out.println("Size of cookies after adding: " + cookies.size()); // 4

		// How to delete specific cookie from the browser?
		// driver.manage().deleteCookie(cookieObj);
		driver.manage().deleteCookieNamed("myCookie");
		cookies = driver.manage().getCookies();
		System.out.println("Size of cookies after deleting: " + cookies.size()); // 3

		// How to delete all cookies from the browser
		driver.manage().deleteAllCookies();
		cookies = driver.manage().getCookies();
		System.out.println("Size after deleting all cookies: " + cookies.size()); // 0

		driver.quit();
	}

}

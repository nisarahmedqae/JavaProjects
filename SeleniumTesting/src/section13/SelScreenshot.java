package section13;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class SelScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// maximize window
		driver.manage().window().maximize();

		// delete all cookies
		driver.manage().deleteAllCookies();

		// delete specific cookie
		driver.manage().deleteCookieNamed("cookie name mention here");

		// Screenshot of: Full Page
		File pageScreenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(pageScreenshotFile, new File("C:\\WebDrivers\\SeleniumScreenshots\\FullPageScreenshot.png"));

		// Screenshot of: Element
		WebElement searchElement = driver.findElement(By.className("SDkEP"));
		File elementScreenshotFile = searchElement.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(elementScreenshotFile, new File("C:\\WebDrivers\\SeleniumScreenshots\\ElementScreenshot.png"));

		
		// Using timestamp while Capturing Screenshots
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        String timestamp = dateFormat.format(new Date());

        FileUtils.copyFile(pageScreenshotFile, new File("C:\\WebDrivers\\SeleniumScreenshots\\" + timestamp + ".png"));

        // Screenshot using Shutterbug library
     	Shutterbug.shootPage(driver,Capture.FULL_SCROLL,true).save("C:\\WebDrivers\\SeleniumScreenshots\\");
     		
		
		driver.quit();
	}

}

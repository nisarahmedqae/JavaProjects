package section13;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Base64;
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
		driver.manage().window().maximize();

		// Screenshot of: Full Page
		File pageScreenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(pageScreenshotFile, new File("C:\\WebDrivers\\SeleniumScreenshots\\FullPageScreenshot.png"));

		// Screenshot of: Element
		WebElement searchElement = driver.findElement(By.className("SDkEP"));
		File elementScreenshotFile = searchElement.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(elementScreenshotFile,
				new File("C:\\WebDrivers\\SeleniumScreenshots\\ElementScreenshot.png"));

		// Using timestamp while Capturing Screenshots
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
		String timestamp = dateFormat.format(new Date());

		FileUtils.copyFile(pageScreenshotFile, new File("C:\\WebDrivers\\SeleniumScreenshots\\" + timestamp + ".png"));

		// Screenshot using Shutterbug library
		Shutterbug.shootPage(driver, Capture.FULL_SCROLL, true).save("C:\\WebDrivers\\SeleniumScreenshots\\");

		// Screenshot as Base64 string
		String screenshotBase64 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
		System.out.println("Screenshot as Base64 String: " + screenshotBase64);

		// Decode Base64 to byte array
		byte[] decodedBytes = Base64.getDecoder().decode(screenshotBase64);

		// Save the bytes to a .jpeg file
		File jpegFile = new File("C:\\WebDrivers\\SeleniumScreenshots\\screenshotBase64.jpeg");
		try (FileOutputStream fos = new FileOutputStream(jpegFile)) {
			fos.write(decodedBytes);
			System.out.println("Screenshot saved as JPEG at: " + jpegFile.getAbsolutePath());
		}

		driver.quit();
	}

}

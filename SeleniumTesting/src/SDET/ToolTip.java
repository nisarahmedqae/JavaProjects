package SDET;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToolTip {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		/*********************************************************/
		driver.get("https://jqueryui.com/tooltip/");

		WebElement tooltipFrame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(tooltipFrame);

		// tooltip webelement
		WebElement toolTip = driver.findElement(By.linkText("Tooltips"));
		String toolTipText = toolTip.getAttribute("title");
		System.out.println(toolTipText);
		
		driver.quit();
	}

}

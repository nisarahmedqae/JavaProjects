package SDET;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		/*********************************************************/
		driver.get("https://jqueryui.com/slider/");

		WebElement sliderFrame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(sliderFrame);

		WebElement minSlider = driver.findElement(By.className("ui-slider-handle"));
		System.out.println(minSlider.getLocation()); // location of the min slider
		System.out.println(minSlider.getSize()); // height and width of the element
		
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(minSlider, 100, 0).perform();
		
		System.out.println(minSlider.getLocation()); 
		System.out.println(minSlider.getSize()); 
		
		/*
		 * Action: is an interface
		 * Actions: is a class
		 * perform(): it includes both build().perform()
		 * build(): can be written to store action element
		 */
		
		Action actionEle = actions.moveToElement(minSlider).build();
		actionEle.perform();
	}

}

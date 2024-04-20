package section31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadExcelFile {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/upload-download-test/index.html");

		// click on download button
		driver.findElement(By.id("downloadButton")).click();

		// click on choose file
		// Make sure type = file this will assure selenium knows its a upload option
		WebElement upload = driver.findElement(By.id("fileinput"));
		upload.sendKeys("C:\\Users\\iamni\\Downloads\\updatedData.xlsx");

		WebElement toast = driver.findElement(By.className("Toastify__toast-body"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOf(toast));

		// get updated value
		WebElement updatedColor = driver.findElement(By.xpath("//div[@id='row-0']/div[3]"));
		System.out.println(updatedColor.getText());

		Thread.sleep(4000);
		driver.close();
	}

}

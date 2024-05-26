package testing;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class DataDrivenTestUsingXLUtility {

	WebDriver driver;
	XSSFWorkbook workbook;
	DataFormatter formatter = new DataFormatter();

	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}

	@Test(dataProvider = "LoginData")
	public void loginTest(String username, String password, String providedDataset) throws InterruptedException {
		driver.get("https://admin-demo.nopcommerce.com/login");

		WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
		Email.clear();
		Email.sendKeys(username);

		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.clear();
		Password.sendKeys(password);

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		// Thread.sleep(3000);
		String expectedTitle = "Dashboard / nopCommerce administration";
		String actualTitle = driver.getTitle();

		System.out.println("Provided Dataset : " + providedDataset);
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@DataProvider(name = "LoginData")
	public Object[][] getData() throws IOException {
		String excelFilePath = "..\\ExcelDataDriven\\src\\test\\java\\resources\\loginData.xlsx";
		XLUtility xlutil = new XLUtility(excelFilePath);

		int rowCount = xlutil.getRowCount("Sheet1");
		System.out.println("Row Count: " + rowCount);
		int columnCount = xlutil.getCellCount("Sheet1", 1);
		System.out.println("Column Count: " + columnCount);

		Object[][] data = new Object[rowCount][columnCount];

		for (int r = 0; r < rowCount; r++) {
			for (int c = 0; c < columnCount; c++) {
				data[r][c] = xlutil.getCellData("Sheet1", r + 1, c);
			}
		}
		return data;
	}

	@AfterClass
	public void tearDown() throws IOException {
		driver.close();
		workbook.close();
	}

}

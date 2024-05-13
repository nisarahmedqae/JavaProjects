package testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DataDrivenTest {

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
		FileInputStream fis = new FileInputStream("..\\ExcelDataDriven\\src\\test\\java\\resources\\loginData.xlsx");
		workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		int rowCount = sheet.getPhysicalNumberOfRows() - 1; // Excluding header row
		System.out.println("Row Count: " + rowCount);
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Column Count: " + columnCount);

		Object[][] data = new Object[rowCount][columnCount];

		for (int r = 0; r < rowCount; r++) {
			XSSFRow row = sheet.getRow(r + 1); // Adding 1 to skip header row
			for (int c = 0; c < columnCount; c++) {
				XSSFCell cell = row.getCell(c);
				data[r][c] = formatter.formatCellValue(cell);
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

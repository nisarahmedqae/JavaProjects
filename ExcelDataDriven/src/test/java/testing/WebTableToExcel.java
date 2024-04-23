package testing;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableToExcel {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/List_of_countries_and_dependencies_by_population");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		String excelFilePath = "..\\ExcelDataDriven\\src\\test\\java\\resources\\population.xlsx";

		XLUtility xlutil = new XLUtility(excelFilePath);

		// Write headers in excel sheet
		xlutil.setCellData("Sheet1", 0, 0, "Country");
		xlutil.setCellData("Sheet1", 0, 1, "Population");
		xlutil.setCellData("Sheet1", 0, 2, "perOfWorld");
		xlutil.setCellData("Sheet1", 0, 3, "Date");
		xlutil.setCellData("Sheet1", 0, 4, "Source");

		WebElement table = driver.findElement(By.xpath("//table[starts-with(@class,'wikitable sortable')]/tbody"));
		int rowCount = table.findElements(By.xpath("tr")).size();
		System.out.println("Row Count: " + rowCount);

		for (int r = 1; r < rowCount; r++) {
			// Read data from web table
			String Country = table.findElement(By.xpath("tr[" + r + "]/td[2]")).getText();
			String Population = table.findElement(By.xpath("tr[" + r + "]/td[3]")).getText();
			String perOfWorld = table.findElement(By.xpath("tr[" + r + "]/td[4]")).getText();
			String Date = table.findElement(By.xpath("tr[" + r + "]/td[5]")).getText();
			String Source = table.findElement(By.xpath("tr[" + r + "]/td[6]")).getText();

			System.out.println(Country + " | " + Population + " | " + perOfWorld + " | " + Date + " | " + Source);

			// Writing the data in excel sheet
			xlutil.setCellData("Sheet1", r, 0, Country);
			xlutil.setCellData("Sheet1", r, 1, Population);
			xlutil.setCellData("Sheet1", r, 2, perOfWorld);
			xlutil.setCellData("Sheet1", r, 3, Date);
			xlutil.setCellData("Sheet1", r, 4, Source);

		}
		System.out.println("Web Scrapping is done successfully");
		driver.close();
	}

}

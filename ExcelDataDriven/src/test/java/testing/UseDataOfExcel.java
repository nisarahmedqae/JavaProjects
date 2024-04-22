package testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UseDataOfExcel {
	DataFormatter formatter = new DataFormatter();

	@Test(dataProvider = "ExcelData")
	public void testExcelData(String sno, String fruit_name, String color, String price, String season) {
		System.out.println(sno + "\t" + fruit_name + "\t" + color + "\t" + price + "\t" + season);

	}

	@DataProvider(name = "ExcelData")
	public Object[][] getData() throws IOException {
		FileInputStream fis = new FileInputStream(
				"..\\ExcelDataDriven\\src\\test\\java\\resources\\ExcelDataFile.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("CopySheet");

		int rowCount = sheet.getPhysicalNumberOfRows() - 1; // Excluding header row
		System.out.println("Row Count: " + rowCount);
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Column Count: " + columnCount);

		Object[][] data = new Object[rowCount][columnCount];

		for (int i = 0; i < rowCount; i++) {
			XSSFRow row = sheet.getRow(i + 1); // Adding 1 to skip header row
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formatter.formatCellValue(cell);
			}
		}
		workbook.close();
		return data;
	}

}

package exceloperations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelToHashMap {

	public static void main(String[] args) throws IOException {
		String excelFilePath = "..\\ExcelDataDriven\\src\\test\\java\\resources\\student.xlsx";
		FileInputStream fis = new FileInputStream(excelFilePath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Student Data");

		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("Row Count: " + rowCount);

		HashMap<String, String> data = new HashMap<>();

		// Reading data from excel and mapping it to HashMap
		for (int r = 0; r < rowCount; r++) {
			String key = sheet.getRow(r).getCell(0).getStringCellValue();
			String value = sheet.getRow(r).getCell(1).getStringCellValue();

			data.put(key, value);
		}

		data.forEach((k, v) -> System.out.println(k + " : " + v));
	}

}

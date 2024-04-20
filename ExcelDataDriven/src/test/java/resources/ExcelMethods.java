package resources;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelMethods {

	public static XSSFSheet selectWorkSheet(String WorkbookPath, String SheetName) throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + WorkbookPath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheetsSize = workbook.getNumberOfSheets(); // get all sheets in a workbook

		for (int i = 0; i < sheetsSize; i++) {
			String sheetname = workbook.getSheetName(i); // get sheet names of workbook
			if (sheetname.equalsIgnoreCase(SheetName)) {
				return workbook.getSheet(sheetname);
			}
		}
		// If the loop finishes without finding the sheet, return null
		return null;
	}

}

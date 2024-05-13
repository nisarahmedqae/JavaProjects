package exceloperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingPasswordProtectedExcel {

	@SuppressWarnings("incomplete-switch")
	public static void main(String[] args) throws IOException {
		String excelFilePath = "..\\ExcelDataDriven\\src\\test\\java\\resources\\customersLocked.xlsx";
		FileInputStream fis = new FileInputStream(excelFilePath);
		String workbookPassword = "test123";

		XSSFWorkbook workbook = (XSSFWorkbook) WorkbookFactory.create(fis, workbookPassword);
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(columnCount);

		for (int r = 0; r <= rowCount; r++) {
			XSSFRow row = sheet.getRow(r);
			for (int c = 0; c < columnCount; c++) {
				XSSFCell cell = row.getCell(c);

				switch (cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
				case FORMULA:
					System.out.print(cell.getNumericCellValue());
					break;
				}
				System.out.print(" | ");
			}
			System.out.println();
			workbook.close();
			fis.close();
		}

	}

}

package testing;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WorkingWithDateCells {

	public static void main(String[] args) throws IOException {

		// Create blank workbook
		XSSFWorkbook workbook = new XSSFWorkbook();

		// Create a blank sheet
		XSSFSheet sheet = workbook.createSheet("Date formats");

		// Date in number format
		XSSFCell cell = sheet.createRow(0).createCell(0);
		cell.setCellValue(new Date());

		CreationHelper creationHelper = workbook.getCreationHelper();

		// Date format
		XSSFCellStyle style1 = workbook.createCellStyle();
		style1.setDataFormat(creationHelper.createDataFormat().getFormat("dd-mm-yyyy"));
		XSSFCell cell1 = sheet.createRow(1).createCell(0);
		cell1.setCellValue(new Date());
		cell1.setCellStyle(style1);

		String excelFilePath = "..\\ExcelDataDriven\\src\\test\\java\\resources\\dataformats.xlsx";
		FileOutputStream fos = new FileOutputStream(excelFilePath);

		workbook.write(fos);
		workbook.close();
		fos.close();

		System.out.println("Done");

	}

}

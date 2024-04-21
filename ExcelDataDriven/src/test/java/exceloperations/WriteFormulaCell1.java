package exceloperations;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteFormulaCell1 {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Numbers");

		XSSFRow row = sheet.createRow(0);

		row.createCell(0).setCellValue(10);
		row.createCell(1).setCellValue(20);
		row.createCell(2).setCellValue(30);
		row.createCell(3).setCellFormula("A1*B1*C1");

		String excelFilePath = "..\\ExcelDataDriven\\src\\test\\java\\resources\\writeformula.xlsx";
		FileOutputStream fos = new FileOutputStream(excelFilePath);
		workbook.write(fos);

		fos.close();
		System.out.println("Done");
	}

}

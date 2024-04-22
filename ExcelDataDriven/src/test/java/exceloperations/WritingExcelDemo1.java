package exceloperations;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcelDemo1 {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Emp info");

		Object[][] empData = { { "EmpId", "Name", "Job" }, { "101", "David", "Engineer" },
				{ "102", "Smith", "Manager" }, { "103", "Scott", "Analyst" } };

		int rowCount = empData.length;
		System.out.println(rowCount);
		int columnCount = empData[0].length;
		System.out.println(columnCount);

		for (int r = 0; r < rowCount; r++) {
			XSSFRow row = sheet.createRow(r);
			for (int c = 0; c < columnCount; c++) {
				XSSFCell cell = row.createCell(c);

				Object value = empData[r][c];

				if (value instanceof String) {
					cell.setCellValue((String) value);
				} else if (value instanceof Integer) {
					cell.setCellValue((Integer) value);
				} else if (value instanceof Boolean) {
					cell.setCellValue((Boolean) value);
				}

			}

			String excelFilePath = "..\\ExcelDataDriven\\src\\test\\java\\resources\\employee.xlsx";
			FileOutputStream fos = new FileOutputStream(excelFilePath);
			workbook.write(fos);

			fos.close();
			workbook.close();
			System.out.println("Done");
		}

	}

}

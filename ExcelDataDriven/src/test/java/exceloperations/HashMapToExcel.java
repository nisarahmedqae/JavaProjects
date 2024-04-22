package exceloperations;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HashMapToExcel {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Student Data");

		Map<String, String> data = new HashMap<>();
		data.put("101", "John");
		data.put("102", "Smith");
		data.put("103", "Scott");
		data.put("104", "Kim");
		data.put("105", "Mary");

		int rowNum = 0;

		for (Map.Entry<String, String> entry : data.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();

			XSSFRow row = sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(key);
			row.createCell(1).setCellValue(value);
		}

		String excelFilePath = "..\\ExcelDataDriven\\src\\test\\java\\resources\\student.xlsx";
		FileOutputStream fos = new FileOutputStream(excelFilePath);
		workbook.write(fos);

		fos.close();
		workbook.close();
		System.out.println("Done");
	}

}

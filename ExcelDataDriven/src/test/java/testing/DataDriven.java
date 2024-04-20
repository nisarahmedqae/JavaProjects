package testing;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import resources.ExcelMethods;

public class DataDriven extends ExcelMethods {

	public static void main(String[] args) throws IOException {

		XSSFSheet sheet = selectWorkSheet("/src/test/java/resources/ExcelDataFile.xlsx", "MainSheet");
		Iterator<Row> rows = sheet.iterator(); // sheet is a collection of rows
		Row firstRow = rows.next();
		Iterator<Cell> cells = firstRow.cellIterator(); // row is a collection of cells
		while (cells.hasNext()) {
			Cell value = cells.next();
			if (value.getStringCellValue().equalsIgnoreCase("fruit_name")) {

			}
		}
	}

}
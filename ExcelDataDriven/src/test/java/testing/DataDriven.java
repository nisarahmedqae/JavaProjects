package testing;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import resources.ExcelMethods;

public class DataDriven {

	public static void main(String[] args) throws IOException {

		ExcelMethods excel = new ExcelMethods();
		XSSFSheet sheet = excel.selectWorkSheet("/src/test/java/resources/ExcelDataFile.xlsx", "MainSheet");
		Iterator<Row> rows = sheet.iterator(); // sheet is a collection of rows
		Row firstRow = rows.next();
		Iterator<Cell> cells = firstRow.cellIterator(); // row is a collection of cells

		int columnIndex = excel.getColumnHeaderIndex(cells, "season"); // it should be starting index
		System.out.println(columnIndex);

		ArrayList<String> rowValueList = excel.getRowValues(rows, "Mango");
		System.out.println(rowValueList);

		Iterator<Row> rows2 = sheet.iterator();
		int rowIndex = excel.getRowHeaderIndex(rows2, "Kivi");
		System.out.println(rowIndex);
		
		Iterator<Row> rows3 = sheet.iterator();
		ArrayList<String> columnValueList = excel.getColumnValues(rows3, columnIndex);
		System.out.println(columnValueList);

	}
}

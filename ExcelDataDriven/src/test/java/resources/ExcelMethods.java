package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelMethods {

	public XSSFSheet selectWorkSheet(String workbookPath, String sheetName) throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + workbookPath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheetsSize = workbook.getNumberOfSheets(); // get all sheets in a workbook

		for (int i = 0; i < sheetsSize; i++) {
			String currentSheetName = workbook.getSheetName(i); // get sheet names of workbook
			if (currentSheetName.equalsIgnoreCase(sheetName)) {
				return workbook.getSheetAt(i); // Return the sheet at index i
			}
		}
		// If the loop finishes without finding the sheet, return null
		return null;
	}

	public int getColumnHeaderIndex(Iterator<Cell> cells, String columnName) {
		int columnIndex = 0;
		for (int k = 0; cells.hasNext(); k++) {
			Cell currentColumn = cells.next();
			if (currentColumn.getStringCellValue().equalsIgnoreCase(columnName)) {
				columnIndex = k;
				break; // exit loop once found
			}
		}
		return columnIndex;
	}

	public int getRowHeaderIndex(Iterator<Row> rows, String rowName) {
		int rowIndex = 0;
		for (int k = 0; rows.hasNext(); k++) {
			Row currentRow = rows.next();
			if (currentRow.getCell(0).getStringCellValue().equalsIgnoreCase(rowName)) {
				rowIndex = k;
				break; // exit loop once found
			}
		}
		return rowIndex;
	}

	public ArrayList<String> getRowValues(Iterator<Row> rows, String firtRowValue) {
		ArrayList<String> rowValueList = new ArrayList<String>();
		while (rows.hasNext()) {
			Row row = rows.next();
			for (Cell cell : row) {
				if (cell.getStringCellValue().equalsIgnoreCase(firtRowValue)) {
					Iterator<Cell> cellIterator = row.cellIterator();
					while (cellIterator.hasNext()) {
						String rowValue = cellIterator.next().getStringCellValue();
						rowValueList.add(rowValue);
					}
					break; // Exit the loop after printing the values of the current row
				}
			}
		}
		return rowValueList;
	}

	public ArrayList<String> getColumnValues(Iterator<Row> rows, int columnIndex) {
	    ArrayList<String> columnValueList = new ArrayList<>();

	    // Iterate over the rows and retrieve values from the target column
	    while (rows.hasNext()) {
	        Row row = rows.next();
	        Cell cell = row.getCell(columnIndex);
	        if (cell != null) {
	            columnValueList.add(cell.getStringCellValue());
	        }
	    }

	    return columnValueList;
	}


}

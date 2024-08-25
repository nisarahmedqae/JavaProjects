package com.tmb.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.tmb.constants.FrameworkConstants;

public final class ExcelUtils {

	private ExcelUtils() {

	}

	static DataFormatter formatter = new DataFormatter();

	public static List<Map<String, String>> getTestDetails(String sheetname) {
		List<Map<String, String>> list = null;

		try (FileInputStream fis = new FileInputStream(FrameworkConstants.getExcelPath())) {

			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet(sheetname);

			int rowCount = sheet.getLastRowNum();
			int columnCount = sheet.getRow(0).getLastCellNum();

			Map<String, String> map = null;
			list = new ArrayList<>();

			for (int r = 1; r <= rowCount; r++) {
				map = new HashMap<>();
				for (int c = 0; c < columnCount; c++) {
					String key = sheet.getRow(0).getCell(c).getStringCellValue();
					XSSFCell valueCell = sheet.getRow(r).getCell(c);

					String value = formatter.formatCellValue(valueCell);

					map.put(key, value);

				}
				list.add(map);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return list;
	}

}
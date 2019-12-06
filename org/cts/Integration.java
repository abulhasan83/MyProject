package org.cts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Integration {
public static String getData(int rowNo, int CellNo) throws IOException {
	String value=null;
	File f = new File("D:\\eclipse\\FirstProjectMaven\\TestData\\AbulExcel.xlsx");
	FileInputStream in  = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(in);
	Sheet sh = w.getSheet("Abul");
	Row r = sh.getRow(0);
	Cell c = r.getCell(0);
	value = c.getStringCellValue();
	return value;
	
}
}

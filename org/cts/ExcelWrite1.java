package org.cts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite1 {
public static void main(String[] args) throws IOException {
	File f = new File("D:\\eclipse\\FirstProjectMaven\\TestData\\AbulExcel.xlsx");
	
	Workbook w = new XSSFWorkbook();
	Sheet sh = w.createSheet("Abul");
	Row r = sh.createRow(1);
	Cell cl = r.createCell(0);
	cl.setCellValue("Hasan");
	String val = cl.getStringCellValue();
	System.out.println(val);
	if(val.equals("Hasan")) {
		cl.setCellValue("Julaiha");
	}
	FileOutputStream o = new FileOutputStream(f);
	w.write(o);
	o.close();
	
	
	
}
}

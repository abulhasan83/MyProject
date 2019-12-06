package org.cts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
public static void main(String[] args) throws IOException, FileNotFoundException{
	File loc = new File("D:\\eclipse\\FirstProjectMaven\\TestData\\datawrite.xlsx");
	Workbook w = new XSSFWorkbook();
	Sheet s = w.createSheet();
	Row r = s.createRow(5);
	Cell c = r.createCell(6);
	c.setCellValue("Abinesh");
	FileOutputStream fo = new FileOutputStream(loc);
	w.write(fo);
	System.out.println("Wrote Successfully");
	
}
}

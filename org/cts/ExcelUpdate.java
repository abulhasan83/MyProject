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

public class ExcelUpdate {
public static void main(String[] args) throws FileNotFoundException,IOException{
	File loc = new File("D:\\eclipse\\FirstProjectMaven\\TestData\\datawrite.xlsx");
	FileInputStream stream = new FileInputStream(loc);
	Workbook w = new XSSFWorkbook(stream);
	Sheet s = w.getSheet("Sheet0");
	Row r=s.getRow(5);
	Cell c = r.getCell(6);
	String sv = c.getStringCellValue();
	
	if(sv.equals("Abinesh"))
	{
		c.setCellValue("Abulhasan");
	}
	
	FileOutputStream fo = new FileOutputStream(loc);
	w.write(fo);
	System.out.println("Wrote Successfully");
}
}

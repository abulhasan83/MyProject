package org.cts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOwn {
public static void main(String[] args) throws FileNotFoundException, IOException, NullPointerException{
	File loc = new File("D:\\eclipse\\FirstProjectMaven\\TestData\\data.xlsx");
	FileInputStream str = new FileInputStream(loc);
	Workbook w = new XSSFWorkbook(str);
	Sheet s = w.getSheet("Sheet1");
	for(int i=0;i<s.getPhysicalNumberOfRows();i++)
	{
		Row r = s.getRow(i);
		for(int j=0;j<r.getPhysicalNumberOfCells();j++)
		{
			 Cell c = r.getCell(j);
			 if(c.getCellType()==0)
			 { 
				  if(DateUtil.isCellDateFormatted(c))
			      {
				              Date dateCellValue = c.getDateCellValue();
				              SimpleDateFormat sim = new SimpleDateFormat("dd-MMM-yy");
				              String val = sim.format(dateCellValue);
				              System.out.println(val);
			       }
				 else
				 {
				 double sval = c.getNumericCellValue();
				 long l = (long) sval;
				  String s1 = String.valueOf(l);
				  System.out.println(s1);
				 }
			 }
			 
			  else
			 {
				 String stringCellValue = c.getStringCellValue();
				 System.out.println(stringCellValue);
			 }
		}
	}
	
}
}

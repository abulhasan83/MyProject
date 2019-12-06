package org.cts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JRadioButton;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class InputType {
public static void main(String[] args) throws IOException,FileNotFoundException {
	int type=0;
	File f = new File("D:\\eclipse\\FirstProjectMaven\\TestData\\data.xlsx");
	FileInputStream in = new FileInputStream(f);
	Workbook b = new XSSFWorkbook(in);
	Sheet s = b.getSheet("Sheet1");
	Row r = s.getRow(1);
	Cell c = r.getCell(0);
	type = c.getCellType();
	System.out.println(type);
	for(int i=0;i<s.getPhysicalNumberOfRows();i++) {
		Row r1 = s.getRow(i);
		for(int j=0;j<r.getPhysicalNumberOfCells();j++)
		{
			Cell c1 = r1.getCell(j);
			type = c1.getCellType();
	if(type==1)
	{
		String sv = c1.getStringCellValue();
		System.out.println(sv);
	}
		else if(type==0) {
			  if(DateUtil.isCellDateFormatted(c1))
		            {
			 Date dateCellValue = c1.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd-MMM-yy");
			String f1 = sim.format(dateCellValue);
			System.out.println(f1);
		            }
			  else
			       {
			 	double nv=c1.getNumericCellValue();
				long l = (long) nv;
				String s1 = String.valueOf(l);
				System.out.println(s1);
			       }
		    }
		}
	
}
}
}
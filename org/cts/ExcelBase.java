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

public class ExcelBase {
	public static String getData(int rowNo,int colNo) throws FileNotFoundException, IOException
	{
		String val = null;
		File loc = new File("D:\\eclipse\\FirstProjectMaven\\TestData\\data.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(rowNo);
		Cell c = r.getCell(colNo);
		int type=c.getCellType();
		if(type==1) {
			val = c.getStringCellValue();
		}
		else if(type==0)
		{
			if(DateUtil.isCellDateFormatted(c)) {
				Date dateCellValue = c.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("dd-MMM-yy");
				val = sim.format(dateCellValue);
			}
			else
			{
				double numericCellValue = c.getNumericCellValue();
				long l = (long) numericCellValue;
				val = String.valueOf(l);
				
			}
		}
		return val;
		
	}

}

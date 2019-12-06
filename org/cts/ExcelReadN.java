package org.cts;
import java.util.Date;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadN {
public static void main(String[] args) throws IOException {
	File loc = new File("D:\\eclipse\\FirstProjectMaven\\TestData\\AbulRead.xlsx");
	FileInputStream in = new FileInputStream(loc);
	Workbook wb = new XSSFWorkbook(in);
	    Sheet sh = wb.getSheet("Sheet1");
	    Row row = sh.getRow(1);
	    Cell cell = row.getCell(0);
	    System.out.println(cell);
	    
	    for(int i=0;i<sh.getPhysicalNumberOfRows();i++) {
	    	Row r = sh.getRow(i);
	    	for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
	    		Cell c = r.getCell(j);
	    		//System.out.println(c);
	    		int ct = c.getCellType();
	    		//System.out.println(ct);
	    		if(ct==1) {
	    			String stringCellValue = c.getStringCellValue();
	    			System.out.println(stringCellValue);
	    		}
	    		else if(ct==0) {
	    			if(DateUtil.isCellDateFormatted(c)) {
	    				Date d = c.getDateCellValue();
	    				SimpleDateFormat sd = new SimpleDateFormat("dd-MMM-yy");
	    				String format = sd.format(d);
	    				System.out.println(format);
	    			} else {
						double numericCellValue = c.getNumericCellValue();
						long l = (long)numericCellValue;
						String valueOf = String.valueOf(l);
						System.out.println(valueOf);
					}
	    		}
	    		}
	    }
	    
}
}

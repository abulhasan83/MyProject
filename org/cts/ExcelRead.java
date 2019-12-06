package org.cts;
import java.io.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead  {
	public static void main(String[] args) throws IOException, FileNotFoundException {
		
		File f = new File("D:\\eclipse\\FirstProjectMaven\\TestData\\data.xlsx");
		FileInputStream loc = new FileInputStream(f);
		Workbook b1 = new XSSFWorkbook(loc);
		Sheet s = b1.getSheet("Sheet1");
		Row r = s.getRow(1);
		Cell c = r.getCell(1);
		System.out.println(c);
		for(int i=0;i<s.getPhysicalNumberOfRows();i++) {
			Row r1 = s.getRow(i);
		for(int j=0;j<r1.getPhysicalNumberOfCells();j++) {
				Cell c1 = r1.getCell(j);
						System.out.println(c1);
		
	}

}
	}
}


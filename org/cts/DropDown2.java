package org.cts;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\eclipse\\FirstProjectMaven\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://www.toolsqa.com/automation-practice-form/");
	dr.manage().window().maximize();
	WebElement mtd = dr.findElement(By.id("continentsmultiple"));
	Select s = new Select(mtd);
	List<WebElement> ops = s.getOptions();
	int size = ops.size();
	System.out.println(size);
	for (int i=0;i<ops.size();i++) {
		      WebElement dp = ops.get(i);
		      String text = dp.getText();
		      System.out.println(text);
	}
	    s.selectByVisibleText("Asia");
	     s.selectByIndex(1);
	     s.selectByValue("AUS");

             for(WebElement f : ops) {
            	 String t2 = f.getText();
            	 System.out.println(t2);
             }

             List<WebElement> alo = s.getAllSelectedOptions();
             Iterator<WebElement> i = alo.iterator();
             while(i.hasNext()) {
            	 WebElement next = i.next();
                  String txt1 = next.getText();
                  System.out.println(txt1);
             
             }
             WebElement fs = s.getFirstSelectedOption();
             String txt3 = fs.getText();
             System.out.println(txt3);
             
}
}

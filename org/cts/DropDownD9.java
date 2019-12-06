package org.cts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownD9 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\FirstProjectMaven\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("http://toolsqa.com/automation-practice-form/");
	dr.manage().window().maximize();
   WebElement cmds = dr.findElement(By.id("selenium_commands"));	
   Select s = new Select(cmds);
   List<WebElement> ops = s.getOptions();
   for(int i=0;i<ops.size();i++) {
	   if(i%2!=0) {
		   WebElement op = ops.get(i);
		   String text = op.getText();
		   System.out.println(text);
		   
	   }
   }
     
   
   
		   }
}

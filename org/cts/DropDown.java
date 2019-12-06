package org.cts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\eclipse\\FirstProjectMaven\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://www.facebook.com/");
	dr.manage().window().maximize();
	WebElement date = dr.findElement(By.id("day"));
	Select s = new Select(date);
	
	List<WebElement> op = s.getOptions();
	int size = op.size();
	System.out.println(size);
	for(int i=0;i<op.size();i++)
	{
		WebElement dp = op.get(i);
	String text = dp.getText();
	System.out.println(text);		
	}
	  s.selectByIndex(4);
	  
}
}

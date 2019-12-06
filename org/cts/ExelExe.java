package org.cts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExelExe extends ExcelBase {
public static void main(String[] args) throws FileNotFoundException, IOException {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\FirstProjectMaven\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement wb1 = driver.findElement(By.xpath("//input[@name='email']"));
	wb1.sendKeys(getData(1,1));
	
	WebElement wb2 = driver.findElement(By.xpath("//input[@name='pass']"));
	wb2.sendKeys(getData(2,2));
	
	
}
}

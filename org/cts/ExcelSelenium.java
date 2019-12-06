package org.cts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelSelenium extends Integration {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\FirstProjectMaven\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://www.facebook.com/");
	dr.manage().window().maximize();
	dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement loc = dr.findElement(By.id("email"));
	loc.sendKeys(getData(0,0));
WebElement pass = dr.findElement(By.id("pass"));
pass.sendKeys(getData(0,1));
	
	
}
}

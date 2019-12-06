package org.cts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Popupro {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\FirstProjectMaven\\Drivers\\chromedriver.exe");
	ChromeOptions a = new ChromeOptions();
	ChromeOptions s= a.addArguments("--disable-notifications");
	WebDriver dr = new ChromeDriver(s);
	dr.get("https://www.facebook.com");
	dr.manage().window().maximize();
	dr.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	Actions ac = new Actions(dr);
	WebElement loc = dr.findElement(By.id("email"));
	ac.keyDown(loc,Keys.SHIFT).sendKeys(loc, "itabulhasan").keyUp(loc,Keys.SHIFT).build().perform();
	WebElement pass = dr.findElement(By.id("pass"));
	Actions ac1=new Actions(dr);
	ac.sendKeys(pass, "abul").perform();
	
	

	
}
}

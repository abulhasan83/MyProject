package org.cts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Reusable {
static WebDriver dr;
static Actions s;
static Select se;
public static void launch(String url) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\FirstProjectMaven\\Drivers\\chromedriver.exe");
	dr = new ChromeDriver();
	dr.get(url);
}
public static void fill(WebElement e,String txt) {
	e.sendKeys("itabulhasan");
}
public static void clk(WebElement e) {
	e.click();
}
public static void sByIndex(WebElement e,int i) {
	se=new Select(e);
	se.selectByIndex(i);
}
public static void sByVisible(WebElement e, String txt) {
	se=new Select(e);
	se.selectByVisibleText(txt);
}
public static void mouse(WebElement e) {
	s = new Actions(dr);
	s.moveToElement(e).perform();
}
}

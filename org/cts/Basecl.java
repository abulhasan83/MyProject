package org.cts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basecl {
public static WebDriver driver;
public static void launch(String url) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\FirstProjectMaven\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(url);	
}

public static void clickEle(WebElement e, String s)
{
	e.sendKeys(s);
}

}

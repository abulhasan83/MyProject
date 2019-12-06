package org.cts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import javax.security.auth.kerberos.KerberosTicket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RRobot {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\FirstProjectMaven\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("http://greenstech.in/selenium-course-content.html");
dr.manage().window().maximize();
dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
WebElement loc = dr.findElement(By.xpath("//p[contains(text(),'Greens technology’s')]"));
Actions a = new Actions(dr);
a.doubleClick(loc).perform();
Robot r = new Robot();
r.keyPress(KeyEvent.VK_SHIFT);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_SHIFT);


}
}

package org.cts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelePrac {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\FirstProjectMaven\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://www.facebook.com/");
	dr.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
	dr.manage().window().maximize();
	FluentWait<WebDriver> fw = new FluentWait<WebDriver>(dr).withTimeout(Duration.ofMillis(2000)).pollingEvery(Duration.ofMillis(1000)).ignoring(Throwable.class);
	fw.until(ExpectedConditions.elementToBeSelected(By.name("firstname")));
	//WebDriverWait w = new WebDriverWait(dr, 5);
	//w.until(ExpectedConditions.elementToBeSelected(By.name("firstname")));
	WebElement fname = dr.findElement(By.name("firstname"));
	JavascriptExecutor js = (JavascriptExecutor)dr;
	js.executeScript("arguments[0].setAttribute('value','Hasan')",fname);
	WebElement fbtn = dr.findElement(By.xpath("//input[@value='2']"));
	fbtn.click();
	Thread.sleep(3000);
	dr.navigate().refresh();
}
}

package org.cts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExecutableC extends Basecl {
public static void main(String[] args) {
	launch("https://www.facebook.com/");
   WebElement wb1 = driver.findElement(By.xpath("//input[@name='email']"));
   clickEle(wb1,"itabulhasan@gmail.com");
   WebElement wb2 = driver.findElement(By.xpath("//input[@name='pass']"));
   clickEle(wb2,"abul@");
}
}

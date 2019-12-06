package org.cts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainClass extends Reusable {
public static void main(String[] args) {
	launch("https://www.facebook.com/");
	WebElement email = dr.findElement(By.id("email"));
	fill(email, "itabulhasan");
	WebElement pass = dr.findElement(By.id("pass"));
	fill(pass, "123456");
	
	WebElement dy = dr.findElement(By.id("day"));
	sByIndex(dy, 5);
	WebElement btn = dr.findElement(By.xpath("//input[@value='Log In']"));
		clk(btn);
WebElement btn2 = dr.findElement(By.xpath("(//a[@role='button'])[1]"));
clk(btn2);
WebElement mon = dr.findElement(By.id("month"));
sByVisible(mon, "Nov");
WebElement mv = dr.findElement(By.xpath("//a[@title='Take a look at Messenger.']"));
mouse(mv);
}
}

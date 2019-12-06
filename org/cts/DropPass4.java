package org.cts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropPass4 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\FirstProjectMaven\\Drivers\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction");
	dr.manage().window().maximize();
	WebElement loc = dr.findElement(By.id("dcdrLocation"));
	Select s = new Select(loc);
	List<WebElement> ops = s.getOptions();
	for(int i=0;i<ops.size();i++) {
		WebElement op = ops.get(i);
		String text = op.getText();
		System.out.println(text);
	}
	
	s.selectByVisibleText("Ahmedabad");
	
}
}

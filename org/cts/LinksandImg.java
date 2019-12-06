package org.cts;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksandImg {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\FirstProjectMaven\\Drivers\\chromedriver.exe");
	WebDriver dr =new ChromeDriver();
	String hr=null;
	int count =0;
	dr.get("https://www.facebook.com/");
	dr.manage().window().maximize();
	List<WebElement> links = dr.findElements(By.tagName("a"));
	int size = links.size();
	System.out.println(size);
	for(WebElement lin:links) {
		hr = lin.getAttribute("href");
		System.out.println(hr);
	}
	
	for(WebElement lin:links) {
		String linn = lin.getAttribute("href");
	if(!(linn==null)) {
		URL url = new URL(linn);
		URLConnection op = url.openConnection();
		HttpsURLConnection o = (HttpsURLConnection)op;
		int res = o.getResponseCode();
		if(!(res==200)) {
			count++;
			System.out.println(linn);
		}
	}
}
	System.out.println(count);
}
}

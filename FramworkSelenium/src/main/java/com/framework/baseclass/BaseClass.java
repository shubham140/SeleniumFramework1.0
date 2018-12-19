/**
 * 
 */
package com.framework.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * @author Shubham
 *
 */
public class BaseClass {
	public static String browser="";
	public void initializeDriver() throws Exception {
	Properties property=new Properties();
	FileInputStream fis=new FileInputStream("D:\\git\\SeleniumFramework1.0\\FramworkSelenium\\src\\main\\java\\Loader.properties");
	property.load(fis);
	browser=property.getProperty("Browser");
	String webdriverName=property.getProperty("webdriverName");
	String webdriverLocation=property.getProperty("webdriverLocation");
	if(browser.equalsIgnoreCase("Chrome")) {
		System.setProperty(webdriverName,webdriverLocation);
		WebDriver driver=new ChromeDriver();
		
	}
	else {
		// Firefox and other browser part are still to develop.
	}
}
}

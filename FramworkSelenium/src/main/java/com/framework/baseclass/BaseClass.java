/**
 * 
 */
package com.framework.baseclass;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.framework.utilities.TimeerAction;


/**
 * @author Shubham
 *
 */
public class BaseClass {
	public WebDriver driver;
	public static String browser="";
	public static String url="";
	public WebDriver initializeDriver() throws Exception {
	Properties property=new Properties();
	FileInputStream fis=new FileInputStream("D:\\git\\SeleniumFramework1.0\\FramworkSelenium\\src\\main\\java\\Loader.properties");
	property.load(fis);
	browser=property.getProperty("Browser");
	String webdriverName=property.getProperty("webdriverName");
	String webdriverLocation=property.getProperty("webdriverLocation");
	url=property.getProperty("URL");
	if(browser.equalsIgnoreCase("Chrome")) {
		System.setProperty(webdriverName,webdriverLocation);
		driver=new ChromeDriver();
		TimeerAction timer=new TimeerAction(driver);
		timer.implicitWaitAction(10);
		timer.maximizeAction();
		
	}
	else {
		// Firefox and other browser part are still to develop.
	}
	
	
	return driver;
}
}

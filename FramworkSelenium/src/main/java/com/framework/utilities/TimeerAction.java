/**
 * 
 */
package com.framework.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.framework.baseclass.BaseClass;

/**
 * @author Shubham
 *
 */
public class TimeerAction extends BaseClass {
	
	public TimeerAction(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void implicitWaitAction(long time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	public void explicitWaitAction(long time,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}
	
	public void maximizeAction() {
		driver.manage().window().maximize();
	}

}

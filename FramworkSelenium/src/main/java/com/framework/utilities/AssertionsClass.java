/**
 * 
 */
package com.framework.utilities;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.framework.baseclass.BaseClass;

/**
 * @author Shubham
 * In this class i have created various assertions
 */
public class AssertionsClass extends BaseClass{
	
	
	public void assertEqual(String expected,String actual) {
		Assert.assertEquals(expected, actual);
		
	}
//***************************** Use with isDisplayed**************************************************
	public void assertTrue(String flag) {
		Assert.assertTrue(true,flag);
	}
	
	
	

}

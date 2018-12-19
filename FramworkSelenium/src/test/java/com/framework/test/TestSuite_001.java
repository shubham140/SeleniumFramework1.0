/**
 * 
 */
package com.framework.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.baseclass.BaseClass;
import com.framework.pomclasses.HomePage;

/**
 * @author Shubham
 *
 */
public class TestSuite_001 extends BaseClass {

	
	
	@BeforeTest
	public void initializeDriverTest() throws Exception {
	driver=	initializeDriver();
	driver.get("http://qaclickacademy.com");
	}
	
	@Test
	public void registerUser() {
		HomePage home=new HomePage(driver);
		home.registerUser();
	}
	
	
}

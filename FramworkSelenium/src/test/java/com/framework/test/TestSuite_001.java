/**
 * 
 */
package com.framework.test;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.framework.baseclass.BaseClass;
import com.framework.pomclasses.HomePage;
import com.framework.pomclasses.RegisterUser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Shubham
 *
 */
public class TestSuite_001 extends BaseClass {

	private static Logger log=LogManager.getLogger(	TestSuite_001.class.getName());
	
	@BeforeTest
	public void initializeDriverTest() throws Exception {
	log.debug("Setting chrome driver property");
	driver=	initializeDriver();
	log.info("Window Maximized");
	driver.get(url);
	}
	
	@Test(priority=1)
	public void registerUser() {
		HomePage home=new HomePage(driver);
		home.registerUser();
	}
	
	@DataProvider
	public void getData() {
		
		// no .of rows number of variables and columns are no of that type of data
		Object[][] data=new Object[1][2];
		data[0][0]="asde@exc.com";
		data[0][1]="1221211jfd";
		data[0][2]="invalid@ueie.com";
		data[1][0]="imvalidpass";
		data[1][1]="shubhamchawla140@gmail.com";
		data[1][2]="Samsung007";
	}
	
	@Test(priority=2,dependsOnMethods="registerUser")
	public void addNewUser() {
		RegisterUser ruser=new RegisterUser(driver);
		ruser.registerUser();
	}
}

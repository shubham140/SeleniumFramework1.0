/**
 * 
 */
package com.framework.test;

import org.testng.annotations.Test;

import com.framework.baseclass.BaseClass;

/**
 * @author Shubham
 *
 */
public class HomePage extends BaseClass {

	
	
	@Test
	public void initializeDriverTest() throws Exception {
	driver=	initializeDriver();
	driver.get("http://google.com");
	}
}

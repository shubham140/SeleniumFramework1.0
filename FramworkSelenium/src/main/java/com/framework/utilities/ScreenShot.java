/**
 * 
 */
package com.framework.utilities;

import java.io.File;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.framework.baseclass.BaseClass;

/**
 * @author Shubham
 *
 */
public class ScreenShot extends BaseClass{
	
	public void getScreenShot() {
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src,new File("C://SCREEN.png"));
		
	}

}

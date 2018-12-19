/**
 * 
 */
package com.framework.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.framework.baseclass.BaseClass;

/**
 * @author Shubham
 * here we are clicking on register button
 */
public class HomePage extends BaseClass {
	
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	@FindBy(how=How.XPATH,using="//a[@href='http://qaclickacademy.usefedora.com/sign_up']")
	WebElement registerButton;
	
	public void registerUser() {
		registerButton.click();
	}

}

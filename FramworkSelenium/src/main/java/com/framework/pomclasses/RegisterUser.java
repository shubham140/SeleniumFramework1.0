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
import com.framework.utilities.TimeerAction;

/**
 * @author Shubham
 *
 */
public class RegisterUser extends BaseClass{
	
	public RegisterUser(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using="//*[@id='user_name']")
	WebElement fullname;
	
	@FindBy(how=How.XPATH,using="//*[@name='user[email]']")
	WebElement emailId;
	
	@FindBy(how=How.XPATH,using="//*[@name='user[password]']")
	WebElement password;
	
	@FindBy(how=How.XPATH,using="'//*[@name='user[password_confirmation']")
	WebElement confirmPassword;
	
	@FindBy(how=How.XPATH,using="//input[@id='user_unsubscribe_from_marketing_emails']")
	WebElement checkBox1;
	
	@FindBy(how=How.XPATH,using="//input[@id='user_agreed_to_terms']")
	WebElement checkBox2;
	
	@FindBy(how=How.XPATH,using="//input[@value='Sign Up']")
	WebElement submitBtn;
	
	
	public void registerUser() {
		TimeerAction time=new TimeerAction(driver);
		time.implicitWaitAction(15);
		fullname.click();
		fullname.sendKeys("Shubham Chawla");
		emailId.click();
		emailId.sendKeys("shubhamchawla140@gmail.com");
		password.click();
		password.sendKeys("Samsung007");
		confirmPassword.sendKeys("Samsung007");
		checkBox1.click();
		checkBox2.click();
		submitBtn.click();
		System.out.println("User added successfully");
	}
	

}

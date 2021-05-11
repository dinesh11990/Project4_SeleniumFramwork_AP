package com.may.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {
	
WebDriver ldriver;
	
	public LoginPageObjects(WebDriver rdriver){
		
		ldriver = rdriver;
		
		//PageFactory.initElements(driver, pageObjectClass)
		PageFactory.initElements(rdriver, this);
	}

	
	
	//Elements
	
	@FindBy(name="uid")
	public static WebElement txtUsername;
	
	@FindBy(name="password")
	public static WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	public static WebElement submitButton;
	
	
	//Actions
	
	//you can give any string name
	public void setUsername(String uname)
	{
		txtUsername.sendKeys(uname);
	}
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	public void clickSubmit()
	{
		submitButton.click();
	}
}

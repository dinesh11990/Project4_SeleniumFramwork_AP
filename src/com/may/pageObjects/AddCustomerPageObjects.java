package com.may.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPageObjects {
	
	WebDriver ldriver;
	
	public AddCustomerPageObjects(WebDriver rdriver){
		
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	
	//Elements
	@FindBy(xpath="/html/body/div[3]/div/ul/li[2]/a")
	WebElement lnkAddNewCustomer;
	
	@FindBy(name="name")
	WebElement custName;
	
	@FindBy(name="rad1")
	WebElement genDer;
	
	@FindBy(name="dob")
	WebElement dBirth;
	
	@FindBy(name="addr")
	WebElement address;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="state")
	WebElement state;
	
	@FindBy(name="pinno")
	WebElement pin;
	
	@FindBy(name="telephoneno")
	WebElement mobile;
	
	@FindBy(name="emailid")
	WebElement email;
	
	@FindBy(name="password")
	WebElement pwd1;
	
	@FindBy(name="sub")
	WebElement sub;
	
	//Actions
	
	public void clickAddNewCustomer() {
		lnkAddNewCustomer.click();
			
	}
	
	public void setCustName(String scn)
	{
		custName.sendKeys(scn);
	}
	public void setGender(String gen)
	{
		genDer.click();
	}
	public void setBirth(String mm,String dd,String year)
	{
		dBirth.sendKeys(mm);
		dBirth.sendKeys(dd);
		dBirth.sendKeys(year);
	}
	public void setAddress(String addr)
	{
		address.sendKeys(addr);
	}
	public void setCity(String cty)
	{
		city.sendKeys(cty);
	}
	public void setState(String st)
	{
		state.sendKeys(st);
	}
	//If it is integer you need to use valueOf 
	public void setPin(String psin)
	{
		pin.sendKeys(String.valueOf(psin));
	}
	public void setMobile(String tel)
	{
		mobile.sendKeys(tel);
	}
	public void setMail(String mail)
	{
		email.sendKeys(mail);
	}
	public void setPwd(String pwd){
		
		pwd1.sendKeys(pwd);
	}
	public void setSubmit()
	{
		sub.click();
	}
	
	

}

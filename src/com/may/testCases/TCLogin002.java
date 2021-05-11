package com.may.testCases;
import java.util.concurrent.TimeUnit;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.may.pageObjects.AddCustomerPageObjects;
import com.may.pageObjects.LoginPageObjects;



public class TCLogin002 extends BaseClass {
	
	//public static Properties properties =null;
	@Test	
	public void TCLogin() throws InterruptedException{
		
		
		LoginPageObjects lp = new LoginPageObjects(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		AddCustomerPageObjects cust=new AddCustomerPageObjects(driver);
		cust.clickAddNewCustomer();
		cust.setCustName("dinesh");
		cust.setGender("male");
		cust.setBirth("2", "22", "2021");
		cust.setAddress("nephal");
		cust.setCity("chaville");
		cust.setState("ile de france");
		cust.setPin("457254");
		cust.setMobile("4555580");
		String email = randomString()+"@gmail.com";
		cust.setMail(email);
		cust.setPwd("sfsdf");
		cust.setSubmit();
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
		}else{
			
			Assert.assertTrue(false);
		}
	
	}
	
	
}
			


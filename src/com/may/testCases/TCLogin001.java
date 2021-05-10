package com.may.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.may.pageObjects.LoginPageObjects;

public class TCLogin001 extends BaseClass {
	
	@Test
	public void loginTest()
	{
		LoginPageObjects lp=new LoginPageObjects(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			
			Assert.assertTrue(true);
			logger.info("Login Test Passed");
			
		}else
		{
			Assert.assertTrue(false);
			logger.info("Login Test Failed");
		}
	}

	
	

}

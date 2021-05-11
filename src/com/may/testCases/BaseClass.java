package com.may.testCases;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


import com.may.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
	
	
	
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public static WebDriver driver;
	public static Logger logger;
	
	
	
	@Parameters("browser")
	@BeforeClass
	public void setUp(String br){
		
		logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("log4j.properties");
		
		logger.info("Banking Application");
		
		if(br.equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
			driver=new ChromeDriver();
		}else if(br.equalsIgnoreCase("firefoxpath")){
			
			System.setProperty("webdriver.chrome.driver", readconfig.getFirefoxPath());
			driver=new FirefoxDriver();
		}
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
	
	}
	
	@AfterClass
	public void tearDown(){
		
		logger.info("Execution done,Closing of browser");
		driver.quit();
	}
	
	//Need to add the library commons.lang3
	//random string
		public String randomString()
		{
			String generatedString = RandomStringUtils.randomAlphabetic(8);
			return generatedString;
		}
	//random numbers
		public String randNumber()
		{
			String generatedNumber = RandomStringUtils.randomNumeric(5);
			return generatedNumber;
		}

	

}

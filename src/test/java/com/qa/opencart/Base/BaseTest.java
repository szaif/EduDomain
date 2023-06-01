package com.qa.opencart.Base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opeancart.factory.DriverFactory;
import com.qa.opencart.pages.AccountsPage;
import com.qa.opencart.pages.LoginPage;
import com.qa.opencart.pages.ProductInfoPage;
import com.qa.opencart.pages.ResultsPage;

public class BaseTest {
//setup() 
	//teardown()

	 WebDriver driver;
	protected LoginPage loginPage;
	protected AccountsPage accPage;//maintain all page class ref in Parent BaseTestClass
	protected DriverFactory df;
	protected Properties prop;
	protected ResultsPage resultsPage;
	protected ProductInfoPage productInfoPage;
	
	@BeforeTest
	public void setUp()
	{
		df = new DriverFactory();
		prop =df.initProp();
		
		driver = df.initDriver(prop);
	  loginPage = new LoginPage(driver);
	
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
















}

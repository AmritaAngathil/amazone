package com.amazone1.qa.testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazone1.qa.base.TestBase;
import com.amazone1.qa.pages.HomePage;
import com.amazone1.qa.pages.LoginPage;
import com.amazone1.qa.pages.SearchPage;



public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	SearchPage searchPage;

	public LoginPageTest()
	{
		
	super();
	
	}

	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		
	initialization();
	homePage= new HomePage();
	loginPage= new LoginPage();
	searchPage = new SearchPage();
	loginPage = homePage.login();

	}

	@Test(priority=1)
	public void PageTitleVerification()
	{
		
	Assert.assertFalse(loginPage.verefypageTitle());
	log.debug("Page title verification");
	
	}

	@Test(priority=2)
	public void loginProcess() throws InterruptedException, IOException
	{

	Thread.sleep(5000);
	searchPage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	log.debug("Login Process");
	
	}

	@AfterMethod
	public void tearDown()
	{
		
	driver.quit();
	
	}


}

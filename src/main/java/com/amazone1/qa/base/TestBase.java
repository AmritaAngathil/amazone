package com.amazone1.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.amazone1.qa.util.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public static Logger log;

	public TestBase()
	{
	 prop = new Properties();
	 try {
	FileInputStream ip = new FileInputStream("C:\\Users\\BestInd\\eclipse-workspace\\AmazoneTest1\\src\\main\\java\\com\\amazone1\\qa\\config\\config.properties");
	prop.load(ip);

	} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}

	}
	public static void initialization() throws InterruptedException
	{
	String browserName = prop.getProperty("Browser");
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	driver = new ChromeDriver();
	log = Logger.getLogger("Amazon logger");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITWAIT,TimeUnit.SECONDS);
	Thread.sleep(5000);
	driver.get(prop.getProperty("URL"));

	}
	public WebDriver getDriver() {
	// TODO Auto-generated method stub
	return driver;
	}
}


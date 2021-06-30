package com.amazone1.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazone1.qa.base.TestBase;

public class ProductPage extends TestBase{
	
	@FindBy(xpath="//*[contains(text(),'Hello, Amrita')]")
	WebElement userName;

	@FindBy(xpath="//*[@id='productTitle']")
	WebElement selectProductName;

    @FindBy(xpath="//input[@name='submit.buy-now']")
	WebElement buyNow;


	public ProductPage()
	{
		
	PageFactory.initElements(driver, this);
	}
	
	public boolean verefyCorrectUserName()
	{
		
	return userName.isDisplayed();

	}

	public boolean verefyProductName()
	{
		
	return selectProductName.isDisplayed();

	}

	public String verefyProductPrice(String string)
	{
		
	// TODO Auto-generated method stub
	return string;
	}

	public PaymentPage productBuyNow() throws InterruptedException
	{
		
	Thread.sleep(5000);
	buyNow.click();
    return new PaymentPage();

	}

}

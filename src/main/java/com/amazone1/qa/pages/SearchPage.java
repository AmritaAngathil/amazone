package com.amazone1.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazone1.qa.base.TestBase;

public class SearchPage extends TestBase{
	
	@FindBy(xpath="//*[contains(text(),'Hello, Amrita')]")
	WebElement userName;

	@FindBy(xpath="//title[contains(text(), 'Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in')]")
	WebElement pageTitle;

	@FindBy(xpath="//input[starts-with(@aria-label,'Search')]")
	WebElement searchField;

	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement submitSearch;

	@FindBy(xpath="//*[contains(text(),'Lloyd 272 L 2 Star Inverter Frost Free Double Door Refrigerator (GLFF282EDST1PB, Dark Steel)')]")
	WebElement selectProduct;



	public SearchPage()
	{
		
	PageFactory.initElements(driver, this);
	
	}

	public boolean verefypageTitle()
	{
		
	return pageTitle.isDisplayed();
	
	}

	public boolean verefyCorrectUserName()
	{
		
	return userName.isDisplayed();

	}

	public ProductPage searchProduct(String sr) throws InterruptedException
	{
		
		Thread.sleep(5000);
	searchField.click();
	Thread.sleep(5000);
	searchField.sendKeys(sr);
	Thread.sleep(5000);
	submitSearch.click();
	selectProduct.click();
	return new ProductPage();

	}
}

package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class HomePage extends TestBase {
	
	//use properties file for username later
	@FindBy(xpath="//span[contains(text(),'Hello, Jaimin')]")
	WebElement userNameLabel;
	
	@FindBy(xpath="//a[contains(text(),'Home')]")
	WebElement homeLink;
	
	@FindBy(xpath="//a[contains(text(),'Deals Store')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//a[contains(text(),'Best Sellers')]")
	WebElement bestsellersLink;
	
	@FindBy(xpath="//a[contains(text(),'New Releases')]")
	WebElement newreleasesLink;
	
	//watch this later
	@FindBy(xpath="//a[contains(text(),'Electronics')]")
	WebElement electronicsLink;
	
	@FindBy(xpath="//a[contains(text(),'Cart')]")
	WebElement cartLink;
	
	@FindBy(xpath="//a[contains(text(),'Returns')]")
	WebElement returnsLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName() {
		return userNameLabel.isDisplayed();
	}
		//watch this later
		public HomePage clickOnHomeLink() {
			homeLink.click();
			return new HomePage();
	}
		
		public DealsPage clickOnDealsLink() {
			dealsLink.click();
			return new DealsPage();
	}
		
		public BestSellersPage clickOnBestSellersLink() {
			bestsellersLink.click();
			return new BestSellersPage();
	}
		
		public NewReleasesPage clickOnNewReleasesLink() {
			newreleasesLink.click();
			return new NewReleasesPage();
	}
		
		public ElectronicsPage clickOnElectronicsLink() {
			electronicsLink.click();
			return new ElectronicsPage();
	}
		
		public CartPage clickOnCartLink() {
			cartLink.click();
			return new CartPage();
	}
	
		public ReturnsPage clickOnReturnsLink() {
			returnsLink.click();
			return new ReturnsPage();
	}
	
	
}

package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page Factory/Page Object - OR:
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	WebElement hellohover;
	
	@FindBy(linkText="Sign in")
	WebElement signintext;
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement continuebtn;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement signinbtn;
	
	@FindBy(xpath="//div[@id='nav-logo']")
	WebElement amzlogo;
	
	//Initializing the page Objects:(create a constuctor of LoginPage)
	//(this means it init above all page object.)
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
		
	//Actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateAMZLogo() {
		return amzlogo.isDisplayed();
	}

	public HomePage login(String un, String pwd) {
		Actions builder = new Actions(driver);
		builder.moveToElement(hellohover).build().perform();
		signintext.click();
		username.sendKeys(un);
		continuebtn.click();
		password.sendKeys(pwd);
		signinbtn.click();
		
		return new HomePage();
	}
	
}

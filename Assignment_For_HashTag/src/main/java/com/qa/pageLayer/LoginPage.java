package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class LoginPage extends TestBase{

	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//input[@name='name']")
	private WebElement username;
	
	public void enterName(String NAME)
	{
		username.sendKeys(NAME);
	}
	
	@FindBy(xpath= "//input[@name='email']")
	private WebElement email;
	
	public void enterEmail(String EMAIL)
	{
		email.sendKeys(EMAIL);
	}
	
	@FindBy(xpath= "//input[@name='phone']")
	private WebElement phone;
	
	public void enterPhone(String PHONE)
	{
		phone.sendKeys(PHONE);
	}
	
	@FindBy(xpath= "//textarea[@name='description']")
	private WebElement description;
	
	public void enterDescription(String Description)
	{
		description.sendKeys(Description);
	}
	
	@FindBy(xpath= "//button[@class='btn form-button font-12 font-bold']")
	private WebElement applyNow;
	
	public void cliclOnApplyNow()
	{
		applyNow.click();
	}
		
}

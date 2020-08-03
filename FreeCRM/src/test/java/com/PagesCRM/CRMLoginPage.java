package com.PagesCRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRMLoginPage {
	
	
	
	WebDriver driver;
	@FindBy(name="email") WebElement emailElement;
	@FindBy(name="password") WebElement passwordElement;
	@FindBy(xpath="//*[@id='ui']/div/div/form/div/div[3]") WebElement Loginbutton;
	
	public CRMLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void login(String username,String password) {
		
		emailElement.sendKeys(username);
		passwordElement.sendKeys(password);
		
	}
	
	public void clickSubmit() {
		
	Loginbutton.click();

}

}
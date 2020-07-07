package com.PagesCRM;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRMCasesPage {

	
	WebDriver Driver;
	@FindBy(name="view")
	WebElement ViewElement;
	@FindBy(xpath="//*[@id='dashboard-toolbar']/div[2]/div/button[1]")
	WebElement ShowFiltersElement;
	@FindBy(xpath="//*[@id='dashboard-toolbar']/div[2]/div/button[2]")
	WebElement ExportElement;
	@FindBy(xpath="//*[@id='dashboard-toolbar']/div[2]/div/a/button/i")
	WebElement NewbuttonElement;
	

	public CRMCasesPage (WebDriver driver) {
		this.Driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void View() {
		
		ViewElement.click();
	}
	
	public void Showfilters() {
		ShowFiltersElement.click();
		assertEquals(ShowFiltersElement.getText(), "Hide Filters");
	}
	
	public void Export() {
		
		ExportElement.click();
	}
	
	public void New() {
		
	}
}


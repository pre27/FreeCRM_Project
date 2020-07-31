package com.PagesCRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class CRMDealsPage  {
	
	WebDriver Ddriver;
	
	@FindBy(xpath="//span[contains(text(),'Deals')]") WebElement Deals;

	@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[1]") WebElement Pipeline;		
	@FindBy(xpath="//button[@class='ui negative button']") 	WebElement Pipelinecancel;

	@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]") WebElement ShowFilters;

	@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/a[1]/button") 	WebElement Board;

	@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/a[2]/button") WebElement ManageTargets;
	@FindBy(xpath="//button[contains(text(),'Back')]") WebElement MgeTgtback;

	@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/a[2]/button") 	WebElement Exports;
	@FindBy(xpath="//button[@class='ui button']") WebElement Expcancel;
    @FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[9]/div[1]/div/div/input") WebElement Toggleuncheck;


	@FindBy(xpath="//button[contains(text(),'New')]") 	WebElement New;
	@FindBy(xpath="//input[@name='title']") WebElement Title;
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div/div/input") 	WebElement Cname;
	
	@FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[4]/div[1]/div/div/div/input") WebElement Cdate;
	
	@FindBy(xpath="//div[@name='stage']") WebElement Stage;
	@FindBy(xpath="//span[contains(text(),'Prospect')]") WebElement StageSel;
	@FindBy(xpath="//button[@class='ui linkedin button']") WebElement Save;
	
	public  CRMDealsPage (WebDriver driver ) {
		this.Ddriver = driver;
		PageFactory.initElements(driver, this);
				
	}
	
	public void Dealbtn() {
		Deals.click();
		
	}


	public void pline() {		
		Pipeline.click();
		Pipelinecancel.click();
	}
	public void Navtab() {
		ShowFilters.click();
		Board.click();	
//		ManageTargets.click();
//		MgeTgtback.click();
//	Exports.click();
//		Expcancel.click();
				
	}
	
	public void newbtn() throws InterruptedException {
		
		New.click();
	}
	
	public void NewEntry(String Tle, String compname ) {
			
		Title.sendKeys(Tle);
		Cname.sendKeys(compname);		
		
	}

    public void closedate(String Datetime) {
    	Cdate.click();
    	Cdate.sendKeys(Datetime);
     }


    
    public void save() {
    	
    	int width = Toggleuncheck.getSize().getWidth();
    	Actions move = new Actions(Ddriver);
    	move.moveToElement(Toggleuncheck, ((width*10)/100), 0).click();
    	move.build().perform();
    	System.out.println("slider moved"); 	
   
        Save.click();
    }

  //div[@class='ui checked toggle checkbox']//label[contains(text(),'Closed')]
  //div[@class='ui toggle checkbox']//label[contains(text(),'Closed')]









}

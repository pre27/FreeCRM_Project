package com.PagesCRM;

import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Base.LibraryCRM;

import SeleniumReusables.SeleniumReusablesCRM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.it.Date;


public class NewCases extends LibraryCRM {
	
	
	@FindBy(name="title") WebElement TitleElement;
	@FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[3]/div[1]/div/div/input") WebElement companyElement;
	@FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div/div/input") WebElement contactElement;
	@FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[3]/div[2]/div/div/input") WebElement dealElement;
	
	@FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[5]/div[2]/div/label[2]/div") WebElement tagsElement;
    @FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[5]/div[2]/div/label[2]/div/input") WebElement TagsElementinput;
    @FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[5]/div[2]/div/label[2]/div/div[2]/div/span") WebElement TagsElementAddText;
    
    //driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[5]/div[2]/div/label[2]/div/input")).sendKeys("TestTag");
    //driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[5]/div[2]/div/label[2]/div/div[2]/div/span")).click();
	@FindBy(name="description") WebElement descriptionElement;
	@FindBy(name="identifier") WebElement IdentifierElement;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[4]/div[1]/div/div") WebElement TypeDDElement;
	//@FindBy(xpath="//div[@name='type']/div/div[2]/span[@class='text']")- custom xpath for type dropdown
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[1]/div/div")  WebElement AssignedtoDDElement; 
    @FindBy(name="priority") WebElement PriorityDDElement; 
	@FindBy(name="status") WebElement StatusDDElement;
	@FindBy(xpath="//*[@id='dashboard-toolbar']/div[2]/div/button[2]") WebElement SaveButtonElement;
	  
	/*
	 * @FindBy(xpath=
	 * "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[4]/div[1]/div/div")
	 * WebElement TypeDDElement; Select TypeDDSelect;
	 */
	  
	 
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[5]/div[1]/div/div[1]/div/input") WebElement CloseDateElement;
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[4]/div[2]/div/div[1]/div/input") WebElement DeadlineElement;
	
	
	
	public NewCases () {
		PageFactory.initElements(LibDriver, this);
							
	}
	
	@Then("^New page opens$")
    public void new_page_opens()
	{
		/*
		 * LibDriver.navigate().refresh(); LibDriver.navigate().refresh();
		 * this.enter_titlecompanydescriptioncontactdealidentifier("Mr", "TestCompany",
		 * "TestDescription", 07724232323,"TestDeal", "TestIdentifier", "TestTags");
		 * this.select_assigned_to_type_priority_status(
		 * "AssignedtoElement","Joshi Franklin","TypeElement", "General Support",
		 * "PriorityElement","Normal","StatusElement", "Reviewing");
		 */	
			 
    }

    @Then("^Enter Title,Company,Description,Contact,Deal,Identifier$")
    public void enter_titlecompanydescriptioncontactdealidentifier(String Title,String Company,String Description,int Contact,String Deal,String Identifier,String Tags) throws InterruptedException
    {
    	String date = Long.toString(Calendar.getInstance().getTimeInMillis());
    	TitleElement.sendKeys(Title);
		companyElement.sendKeys(Company + date );
    	contactElement.sendKeys(Integer.toString(Contact));
    	System.out.println(Contact);
    	dealElement.sendKeys(Deal + date);
    	System.out.println(Deal);
    	JavascriptExecutor js = (JavascriptExecutor) LibDriver;
	    js.executeScript("window.scrollBy(0,4000)");
	    tagsElement.click();
	    TagsElementinput.sendKeys(Tags);
	    TagsElementAddText.click();
	    Thread.sleep(5000);
	    TagsElementinput.click();
	    TagsElementinput.sendKeys(Keys.TAB);
    	System.out.println(Tags);
    	//descriptionElement.click();
    	descriptionElement.sendKeys(Description + date);
    	System.out.println(Description);
    	IdentifierElement.sendKeys(Identifier + date);
    	System.out.println(Identifier);
    }

    @And("^select Assigned To, Type, Priority, Status$")
    public void select_assigned_to_type_priority_status(String Assignedto,String Type,String Priority,String Status) throws InterruptedException
        
    {
		
    	PriorityDDElement.click();
    	Thread.sleep(5000);
 	    Actions action2= new Actions(LibDriver);
 	    action2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).click().perform();
 	    
 	    StatusDDElement.click();
 	   Thread.sleep(5000);
	    Actions action3= new Actions(LibDriver);
	    action3.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).click().perform();
	    
    	TypeDDElement.click();
    	Thread.sleep(5000);
 	    Actions action= new Actions(LibDriver);
 	    action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).click().perform();
 	    
 	    JavascriptExecutor js = (JavascriptExecutor) LibDriver;
	    js.executeScript("window.scrollBy(0,-250)");
	    Thread.sleep(5000);
 	    AssignedtoDDElement.click();
	    Actions action1= new Actions(LibDriver);
	    action1.sendKeys(Keys.ARROW_DOWN).click().perform();
	    
	    SaveButtonElement.click();
		
    	
    }
	

}

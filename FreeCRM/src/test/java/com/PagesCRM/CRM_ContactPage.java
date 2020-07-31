package com.PagesCRM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.LibraryCRM;

public class CRM_ContactPage  extends LibraryCRM{
	
WebDriver driver;
	
    @FindBy(xpath="//div[@id='main-nav']/a[3]/span[@class='item-text']")
    WebElement contacts;
    @FindBy(xpath="//*[@id='dashboard-toolbar']/div[2]/div/a/button")
    WebElement New;
    @FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/div/input")
    WebElement Firstname;
    
    @FindBy(name="last_name")
    WebElement Lastname;
    @FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[4]/div[1]/div/div/div/div[1]/input")
    WebElement  Email;
    @FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[4]/div[2]/div/div")
    WebElement category;
    @FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[7]/div[1]/div/div/div/div[1]")
    WebElement status;
    @FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[7]/div[2]/div/div/input")
    WebElement zone;
    @FindBy(name="day")
    WebElement date;
    @FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[15]/div[1]/div/div/div[2]")
    WebElement month;
    @FindBy(name="year")
    WebElement annual;
    @FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[16]/div/div/div/div/input")
    WebElement image;
    @FindBy(xpath="/html/body/div/div/div[2]/div[2]/div/div[1]/div[2]/div/button[2]")
    WebElement submit;
    
    
public CRM_ContactPage(WebDriver driver) {
		
   this.driver = driver;
		
		PageFactory.initElements(LibDriver, this);
		
	}

public void contact() throws InterruptedException {
	
//	FluentWait.until(ExpectedConditions.presenceOfElement(By.xpath("//div[@id='main-nav']/a[3]/span[@class='item-text']")));

	Thread.sleep(5000);
	
	contacts.click();
}

public void newcontact() throws InterruptedException {
	
	Thread.sleep(6000);
	
	New.click();
	
}


public void entername(String fname,String lname,String mail ) {
	Firstname.sendKeys(fname);
	Lastname.sendKeys(lname);
	Email.sendKeys(mail);
	
}

public void ctg() {
	category.click();
	Actions category= new Actions(LibDriver);
	category.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN).build().perform();
	category.sendKeys(Keys.ESCAPE);
}
public void sts() {
	status.click();
	Actions status = new Actions(LibDriver);
	status.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN).build().perform();
	status.sendKeys(Keys.ESCAPE);
}
public void tzone() {
	
	zone.click();	
	Actions zone = new Actions(LibDriver);
	zone.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN).build().perform();
	zone.sendKeys(Keys.ESCAPE);
	
}

public void day() {
	
	date.sendKeys("19");
	
}
 public void month() {
	 
	month.click();
	Actions month = new Actions(LibDriver);
	month.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN).build().perform();
	
 }
 
 public void year() {
	 
	 annual.sendKeys("1992");
 }

 
 public void upload() {
	 image.sendKeys("E:\\Professor_(Money_Heist)");
 }
public void save() {
	
	submit.click();
}

}

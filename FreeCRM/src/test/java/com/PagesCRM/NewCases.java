package com.PagesCRM;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Base.LibraryCRM;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class NewCases extends LibraryCRM {

	@FindBy(name = "title")
	WebElement TitleElement;
	@FindBy(xpath = "//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[3]/div[1]/div/div/input")
	WebElement companyElement;
	@FindBy(xpath = "//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div/div/input")
	WebElement contactElement;
	@FindBy(xpath = "//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[3]/div[2]/div/div/input")
	WebElement dealElement;

	@FindBy(xpath = "//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[5]/div[2]/div/label[2]/div")
	WebElement tagsElement;
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[5]/div[2]/div/label[2]/div/input")
	WebElement TagsElementinput;
	@FindBy(xpath = "//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[5]/div[2]/div/label[2]/div/div[2]/div/span")
	WebElement TagsElementAddText;
	@FindBy(xpath= "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[5]/div[2]/div/label[2]/div/div[2]/div/span")
	WebElement TagAdd;
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[5]/div[1]/div/div[1]/div/input")
	WebElement ChooseDateElement;
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[4]/div[2]/div/div[1]/div/input")
	WebElement DeadlineWebElement;

	// driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[5]/div[2]/div/label[2]/div/input")).sendKeys("TestTag");
	// driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[5]/div[2]/div/label[2]/div/div[2]/div/span")).click();
	@FindBy(name = "description")
	WebElement descriptionElement;
	@FindBy(name = "identifier")
	WebElement IdentifierElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[4]/div[1]/div/div")
	WebElement TypeDDElement;
	// @FindBy(xpath="//div[@name='type']/div/div[2]/span[@class='text']")- custom
	// xpath for type dropdown
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[1]/div/div")
	WebElement AssignedtoDDElement;
	@FindBy(name = "priority")
	WebElement PriorityDDElement;
	@FindBy(name = "status")
	WebElement StatusDDElement;
	@FindBy(xpath = "//*[@id='dashboard-toolbar']/div[2]/div/button[2]")
	WebElement SaveButtonElement;

	public NewCases() {
		PageFactory.initElements(LibDriver, this);

	}

	@Then("^Enter Title,Company,Description,Contact,Deal,Identifier,Tags")
	public void enter_Title_Company_Description_Contact_Deal_Identifier_Tags(String Title, String Company, String Description,
			int Contact, String Deal, String Identifier, String Tags) throws InterruptedException
	{
		
		 String date = Long.toString(Calendar.getInstance().getTimeInMillis());
		 TitleElement.sendKeys(Title); companyElement.sendKeys(Company + date);
		 contactElement.sendKeys(Integer.toString(Contact));
		 System.out.println(Contact);
				 
		 dealElement.sendKeys(Deal + date); System.out.println(Deal);
				 
		 JavascriptExecutor js = (JavascriptExecutor) LibDriver;
		 js.executeScript("window.scrollBy(0,4000)");
				
		 tagsElement.click(); TagsElementinput.sendKeys(Tags);
		 TagsElementAddText.click();
		 Thread.sleep(5000); 
		 //TagsElementinput.click();
		 TagsElementinput.sendKeys(Keys.SPACE); TagAdd.click();
		 //TagsElementinput.sendKeys(Keys.ESCAPE);
		 TagsElementinput.sendKeys(Keys.TAB); System.out.println(Tags);
				 
		// descriptionElement.click(); 
		 descriptionElement.sendKeys(Description +  date); 
		 System.out.println(Description);
				
		IdentifierElement.sendKeys(Identifier + date);
		 System.out.println(Identifier); 
	   
	}

	
		/*
		 * @Then("^Enter Title,Company,Description,Contact,Deal,Identifier,Tags$")
		 * public void
		 * enter_Title_Company_Description_Contact_Deal_Identifier_Tags(String Title,
		 * String Company, String Description, int Contact, String Deal, String
		 * Identifier, String Tags) throws InterruptedException { String date =
		 * Long.toString(Calendar.getInstance().getTimeInMillis());
		 * TitleElement.sendKeys(Title); companyElement.sendKeys(Company + date);
		 * contactElement.sendKeys(Integer.toString(Contact));
		 * System.out.println(Contact);
		 * 
		 * dealElement.sendKeys(Deal + date); System.out.println(Deal);
		 * 
		 * JavascriptExecutor js = (JavascriptExecutor) LibDriver;
		 * js.executeScript("window.scrollBy(0,4000)");
		 * 
		 * tagsElement.click(); TagsElementinput.sendKeys(Tags);
		 * TagsElementAddText.click(); Thread.sleep(5000); //TagsElementinput.click();
		 * TagsElementinput.sendKeys(Keys.SPACE); TagAdd.click();
		 * //TagsElementinput.sendKeys(Keys.ESCAPE);
		 * TagsElementinput.sendKeys(Keys.TAB); System.out.println(Tags);
		 * 
		 * // descriptionElement.click(); descriptionElement.sendKeys(Description +
		 * date); System.out.println(Description);
		 * 
		 * IdentifierElement.sendKeys(Identifier + date);
		 * System.out.println(Identifier); }
		 */
	 

	@And("^select Assigned To, Type, Priority, Status$")
	public void select_Assigned_To_Type_Priority_Status(String Assignedto, String Type, String Priority, String Status)
			throws InterruptedException

	{

		PriorityDDElement.click();
		Thread.sleep(5000);
		Actions action2 = new Actions(LibDriver);
		action2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).click().perform();

		StatusDDElement.click();
		Thread.sleep(5000);
		Actions action3 = new Actions(LibDriver);
		action3.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).click().perform();

		TypeDDElement.click();
		Thread.sleep(5000);
		Actions action = new Actions(LibDriver);
		action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).click().perform();

		JavascriptExecutor js = (JavascriptExecutor) LibDriver;
		js.executeScript("window.scrollBy(0,-250)");
		Thread.sleep(5000);
		AssignedtoDDElement.click();
		Actions action1 = new Actions(LibDriver);
		action1.sendKeys(Keys.ARROW_DOWN).click().perform();

	}

	@Then("^Input Deadline Date and Close Date$")
	public void input_Deadline_Date_and_Close_Date() {
		this.inputDate(ChooseDateElement, 5);
		this.inputDate(DeadlineWebElement, 10);
	}

	private void inputDate(WebElement dateControl, int noOfDaysOffset) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, noOfDaysOffset);
		String dateAsString = df.format(cal.getTime());

		dateControl.click();
		dateControl.sendKeys(dateAsString);
		dateControl.sendKeys(Keys.ESCAPE);
	}

	public void click_Save() {
		SaveButtonElement.click();
	}
}

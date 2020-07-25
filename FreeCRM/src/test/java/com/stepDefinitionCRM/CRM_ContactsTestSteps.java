package com.stepDefinitionCRM;

import java.io.IOException;

import com.Base.LibraryCRM;
import com.PagesCRM.CRM_ContactPage;

import SeleniumReusables.SeleniumReusablesCRM;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CRM_ContactsTestSteps extends LibraryCRM {
	CRM_ContactPage cp;
	SeleniumReusablesCRM ser;

@When("^to select contact in dashboard$")
public void to_select_contact_in_dashboard() throws InterruptedException {
	

    cp = new CRM_ContactPage(LibDriver);
	
	Thread.sleep(5000);
	
	cp.contact();
	
	LibDriver.navigate().refresh();
	
	LibDriver.navigate().refresh();
	
	
}

@Then("^select new$")
public void select_new() throws InterruptedException {
	
	cp = new CRM_ContactPage(LibDriver);
	cp.newcontact();
			
			Thread.sleep(5000);
			
}

@Then("^enter firstname,lastname,email$")
public void enter_firstname_lastname_email() { 
	
	cp = new CRM_ContactPage(LibDriver);
	
	cp.entername("nilofer", "rehman", "niloreh@gmail.com");
    
}

@Then("^select category$")
public void select_category() { 
	

	cp = new CRM_ContactPage(LibDriver);
	
	cp.ctg();
   
}

@Then("^select status$")
public void select_status() { 
	

	cp = new CRM_ContactPage(LibDriver);
	
	cp.sts();
}

@Then("^select zone$")
public void select_zone() {
	
	
	cp = new CRM_ContactPage(LibDriver);
	
	cp.tzone();
}

@Then("^select date$")
public void select_date()  {
	cp = new CRM_ContactPage(LibDriver);
	cp.day();
	
}

@Then("^select month$")
public void select_month() {
	
	cp = new CRM_ContactPage(LibDriver);
	
	cp.month();
}

@Then("^select year$")
public void select_year() {
	
	cp = new CRM_ContactPage(LibDriver);
	cp.year();
}

@Then("^upload image$")
public void upload_image() {
	
	cp = new CRM_ContactPage(LibDriver);
	cp.upload();
}



@Then("^save the page$")
public void save_the_page() throws InterruptedException {
	
	cp.save();
	
	Thread.sleep(5000);
}

@Then("^take screenshot$")
public void take_screenshot() throws IOException {
	

	ser = new SeleniumReusablesCRM(LibDriver);
	ser.screenshot("src/test/resources/Screenshot/CRM1.png");
	
	
}



}

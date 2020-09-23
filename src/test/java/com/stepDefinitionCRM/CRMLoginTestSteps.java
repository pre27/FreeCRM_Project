package com.stepDefinitionCRM;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Base.LibraryCRM;
import com.PagesCRM.CRMLoginPage;

import SeleniumReusables.SeleniumReusablesCRM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class CRMLoginTestSteps extends LibraryCRM {
	
	CRMLoginPage LP;
	
	@Given("launch browser and get url")
	public void launch_browser_and_get_url() throws IOException
	{
		launchApplication();
	}

	@When("to get title")
	public void to_get_title()
	{
		SeleniumReusablesCRM SR= new SeleniumReusablesCRM(LibDriver);
		SR.getTitle();
	}
	
	@Then("enter username and password")
	public void enter_username_and_password() {
		LP = new CRMLoginPage(LibDriver);
	  	LP.login("deepikavillavankothai@gmail.com", "Automation");  
	}

	@Then("clcik login")
	public void clcik_login() {
		LP.clickSubmit();  
	}
}

package com.stepDefinitionCRM;

import java.io.IOException;
import org.openqa.selenium.By;
import com.Base.LibraryCRM;

import SeleniumReusables.SeleniumReusablesCRM;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class NewCampaignLoginSteps extends LibraryCRM{
	 SeleniumReusablesCRM SU;
	
		
	@When("^Logged in$")
	public void logged_in() throws IOException{
		launchApplication();
	    // Write code here that turns the phrase above into concrete actions
		LibDriver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[1]/div/input")).sendKeys("deepikavillavankothai@gmail.com");
		LibDriver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[2]/div/input")).sendKeys("Automation");
		LibDriver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
    
	}

	@When("^Clicking on Campagign menu$")
	public void clicking_on_Campagign_menu() throws  InterruptedException   {
		Thread.sleep(2000);
	    // Write code here that turns the phrase above into concrete actions
		LibDriver.findElement(By.xpath("//*[@id='main-nav']/a[11]/span")).click();
		     
	}

	@Then("^Click New Campaign$")
	public void click_New_Campaign() throws  InterruptedException  {
		Thread.sleep(1000);
	    // Write code here that turns the phrase above into concrete actions		
		LibDriver.findElement(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/a[1]/button/i")).click();
	     
	}

	@Then("^Enter details$")
	public void enter_details() throws  InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		
		LibDriver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/input")).sendKeys("Sam");
		LibDriver.findElement(By.   xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[2]/div")).click();
		Thread.sleep(3000);
		LibDriver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[2]/div/div[2]/div[2]/span")).click();		
		LibDriver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[2]/div/div[2]/div[2]"));
		LibDriver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div")).click();
		
	}

	@Then("^Click Save$")
	public void click_Save() throws  IOException {
	    // Write code here that turns the phrase above into concrete actions

		LibDriver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")).click();
		
	
		
		
	}



}

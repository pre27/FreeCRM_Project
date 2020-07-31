package com.stepDefinitionCRM;

import com.Base.LibraryCRM;
import com.PagesCRM.CRMCasesPage;
import com.PagesCRM.NewCases;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class CasesPageStepDefinition extends LibraryCRM {
	
	CRMCasesPage CP;
	NewCases newCases = new NewCases();
	
	@When("Clicking on navigation menu")
	public void clicking_on_navigation_menu() {

		CP= new CRMCasesPage(LibDriver);	
		CP.Menu();
	}

	
	  @Then("Click View drop down")
	  public void click_view_drop_down()
	  { 
		  CP.View();
	  }
	 
	
	  @Then("Show Filters") public void show_filters()
	  {
		  CP.Showfilters();
	  
	  }
	 

	
	  @Then("Click New") public void click_new() throws InterruptedException {
		  
		  CP.New();
		  
		  LibDriver.navigate().refresh();
		  LibDriver.navigate().refresh();
	  }
	  
	  @Then("Enter Title,Company,Description,Contact,Deal,Identifier,Tags") 
	  public void enter_Title_Company_Description_Contact_Deal_Identifier_Tags() throws InterruptedException
	  
	  {
		  
		  newCases.enter_Title_Company_Description_Contact_Deal_Identifier_Tags("Mr", "TestCompany", "TestDescription", 07724232323,"TestDeal", "TestIdentifier", "Test Test");
		 
		  
	     }
	  
	/* @Then("Export") public void export() { CP.Export(); } */
	 
	  @Then("select Assigned To, Type, Priority, Status")
	  public void select_Assigned_To_Type_Priority_Status() throws InterruptedException {
		  newCases.select_Assigned_To_Type_Priority_Status("Joshi Franklin","General Support","Normal","Reviewing"); 
	  }

	  @Then("Input Deadline Date and Close Date")
	  public void input_Deadline_Date_and_Close_Date() {
		  
		  newCases.input_Deadline_Date_and_Close_Date();
		  newCases.click_Save();
	      
	  }


	   
	}




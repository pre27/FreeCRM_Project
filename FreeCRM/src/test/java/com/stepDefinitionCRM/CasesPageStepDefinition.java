package com.stepDefinitionCRM;

import com.Base.LibraryCRM;
import com.PagesCRM.CRMCasesPage;
import com.PagesCRM.NewCases;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CasesPageStepDefinition extends LibraryCRM {
	
	CRMCasesPage CP;
	
	@When("Clicking on navigation menu")
	public void clicking_on_navigation_menu() {
		CP= new CRMCasesPage(LibDriver);	
		CP.Menu();
	}

	
	  @Then("Click View drop down") public void click_view_drop_down() { CP.View();
	  }
	 
	
	  @Then("Show Filters") public void show_filters()
	  {
		  CP.Showfilters();
	  
	  }
	 

	
	  @Then("Click New") public void click_new() throws InterruptedException {
		  
		  CP.New();
		  
		  LibDriver.navigate().refresh();
		  LibDriver.navigate().refresh();

		  NewCases newCases = new NewCases();
		  newCases.enter_titlecompanydescriptioncontactdealidentifier("Mr", "TestCompany", "TestDescription", 07724232323,"TestDeal", "TestIdentifier", "TestTags");
		  newCases.select_assigned_to_type_priority_status("Joshi Franklin","General Support","Normal","Reviewing");
		  
	      }
	  
			/* @Then("Export") public void export() { CP.Export(); } */
	 
	 
}

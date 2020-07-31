package com.stepDefinitionCRM;

import com.Base.LibraryCRM;
import com.PagesCRM.CRMDealsPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DealsTest_steps extends LibraryCRM {
	
	CRMDealsPage dpage;

	 @When("^Click on Deal Menu")
	    public void click_on_deal_menu(){	
		 
		dpage = new CRMDealsPage(LibDriver);
		dpage.Dealbtn();
		     
	    }

	    @Then("^Click on pipeline")
	    public void click_on_pipeline(){
	    	dpage.pline();
	        
	    }

	    @Then("^Click on Navbuttons")
	    public void click_on_navbuttons(){
	    	dpage.Navtab();
	       
	    }

	    @Then("^Click on New")
	    public void click_on_new() throws InterruptedException{
	    	
	    	dpage.newbtn();
	    	
	        
	    }

	    @Then("^Enter Title and company name")
	    public void enter_title_and_company_name(){
	    	
	    	dpage.NewEntry("mrs", "abc");
	        
	    }

	    @Then("^Choose closedate")
	    public void choose_closedate() {
	    	dpage.closedate("09/10/2020 08:45");
	   
	    }

	    @Then("^save")
	    public void save() {
	    	dpage.save();
	       
	    }
	    
	  //div[@class='ui fitted toggle checkbox']//label
	  //div[@class='ui checked fitted toggle checkbox']//label


}

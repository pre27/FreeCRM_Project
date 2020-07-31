package com.TestRunnerCRM;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions
	(
	features = "src/test/resources/Features/FeatureCRM.feature",
	plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport",
	"com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html"},
			
	glue = {"com.stepDefinitionCRM"}
	)
	
	public class TestRunnerCRM   {
		 @AfterClass
	     public void extendReport()
	   {
	       Reporter.loadXMLConfig("src/test/resources/Extent-config.xml");
	       Reporter.setSystemInfo("user", System.getProperty("user.name"));
	       Reporter.setSystemInfo("os", "Windows");
	       Reporter.setTestRunnerOutput("Sample test runner output message");
	   }

	}

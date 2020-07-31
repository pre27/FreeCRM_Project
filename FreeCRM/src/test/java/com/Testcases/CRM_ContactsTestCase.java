package com.Testcases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Base.LibraryCRM;
import com.PagesCRM.CRMLoginPage;
import com.PagesCRM.CRM_ContactPage;

import SeleniumReusables.SeleniumReusablesCRM;

public class CRM_ContactsTestCase {

	public class CRM_ContactTestCase extends LibraryCRM{
		CRMLoginPage  lp;
		CRM_ContactPage cp;
		SeleniumReusablesCRM ser;
		
		
		@BeforeClass
		
		public void openapp() throws IOException {
			
			launchApplication();
		}
		
		
		@Test(priority=1)
			public void signup() {
				CRMLoginPage  lp = new CRMLoginPage(LibDriver);
				lp.login("deepikavillavankothai@gmail.com", "Automation");
				lp.clickSubmit();
				
			
		}
			
			@Test(priority=2)
			
		public void addcontact() throws InterruptedException {
				
				
				
				CRM_ContactPage cp = new CRM_ContactPage(LibDriver);
			
			Thread.sleep(5000);
			
			cp.contact();
			LibDriver.navigate().refresh();
			LibDriver.navigate().refresh();
			
			cp.newcontact();
			
			LibDriver.navigate().refresh();
			Thread.sleep(5000);
			
			cp.entername("sadhana", "prakash", "sadhan@gmail.com");
		} 
			
			@Test(priority=3)
		public void category() {

				CRM_ContactPage cp = new CRM_ContactPage(LibDriver);
				
				cp.ctg();
			
			}
			
			@Test(priority=4)
			public void status() {
				CRM_ContactPage cp = new CRM_ContactPage(LibDriver);
				
				cp.sts();
				
			} 
			
			@Test(priority=5)
			public void zone() {
				CRM_ContactPage cp = new CRM_ContactPage(LibDriver);
				cp.tzone();
				
			}
			
			
			@Test(priority=6)
			public void date() {
				
				CRM_ContactPage cp = new CRM_ContactPage(LibDriver);
				cp.day();
				
				
				
			}
			

			@Test(priority=7)
			public void month() {
				
				CRM_ContactPage cp = new CRM_ContactPage(LibDriver);
				cp.month();
			}
			

			@Test(priority=8)
			public void year() {
				
				CRM_ContactPage cp = new CRM_ContactPage(LibDriver);
				
				cp.year();
			}
			@Test(priority=9)
			public void image() {
				
				CRM_ContactPage cp = new CRM_ContactPage(LibDriver);
				cp.upload();
			}
			
			
			@Test(priority=10)
			public void scrsht() throws IOException {
				ser = new SeleniumReusablesCRM(LibDriver);
				ser.screenshot("src/test/resources/Screenshot/Screenshot.png");
						
			}
			@Test(priority=11)
			
		public void save(){
				CRM_ContactPage cp = new CRM_ContactPage(LibDriver);
			
			cp.save();
			
	}
	}
}

package com.Pages;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class CampaignPage {

	WebDriver pgDriver;
	
	
	public CampaignPage(WebDriver argDriver)
	{
		this.pgDriver = argDriver;
	}

	
	public void CampaignPageLogin()  {
		
		pgDriver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[1]/div/input")).sendKeys("deepikavillavankothai@gmail.com");
		pgDriver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[2]/div/input")).sendKeys("Automation");
		pgDriver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
	
	}
	
		public void CreateNewCamapaignFromHomePage () throws InterruptedException{
		pgDriver.findElement(By.xpath("//*[@id='main-nav']/a[11]/span")).click();
		Thread.sleep(5000);
		pgDriver.findElement(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/a[1]/button/i")).click();
	
		
		}
	
	 	
		
		
				
		
				
				
			

			
		}	
	

		

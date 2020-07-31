package com.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Library {

	WebDriver driver;

	public void launchapplication(String browser, String url) {

		try {
			if (browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","src/test/resources/Driver/chromedriver.exe"); 
				driver =new ChromeDriver();


			}
			else if (browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "src/test/resources/Driver/geckodriver.exe"); 
				driver = new FirefoxDriver();
			}

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);

		}


		catch(WebDriverException e) {

			System.out.println("Browser is not found");

		}

	}


	public void close() {

		driver.quit();
	}

	public void title() {
		System.out.println(driver.getTitle());

	}



}



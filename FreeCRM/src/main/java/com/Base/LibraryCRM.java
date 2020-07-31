package com.Base;

	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebDriverException;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;


	public class LibraryCRM {

		public static WebDriver LibDriver;
		public static Properties prop;
		//static java.util.logging.Logger logger1 = java.util.logging.Logger.getLogger(Library.class.getName());
		//public static Logger logger = LogManager.getLogger(Library.class.getName());
		public void launchApplication() throws IOException {
			FileInputStream file=new FileInputStream("src/test/resources/Properties/Config.Properties");
			prop=new Properties();
			prop.load(file);
			//logger.info("Property file is loaded");
			try {
				this.GetDriver();
					
				LibDriver.manage().window().maximize();
				LibDriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				LibDriver.get(prop.getProperty("url"));
				//logger.info("url is entered in the browser");
			} catch(WebDriverException e) {
				System.out.println("browser could not be launched");
			}
		}
		
			public WebDriver GetDriver()
			{
				if (this.LibDriver != null) {
					return this.LibDriver;
				}
				
				String browser=prop.getProperty("browser");
				try {
					if (browser.equalsIgnoreCase("firefox")) {
						System.setProperty("webdriver.gecko.driver","C:/Data/Selenium/Library/geckodriver-v0.26.0-win64/geckodriver.exe");
						LibDriver=new FirefoxDriver();
						//logger.info("Firefox Browser is launched ");
						
					} else if(browser.equalsIgnoreCase("chrome")){
						System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver.exe");
						 LibDriver=new ChromeDriver();
						 //logger.info("Chrome Browser is launched ");
						  
					} else if(browser.equalsIgnoreCase(("IE"))){
						System.setProperty("webdriver.ie.driver","C:/Data/Selenium/Library/IEDriverServer_x64_3.150.1/IEDriverServer.exe");
						 LibDriver=new InternetExplorerDriver();
					}
				} catch(WebDriverException e) {
					System.out.println("browser could not be launched");
				}

				return LibDriver;
			}
			
			public void quit() {
				LibDriver.close();
				//logger.info("Window is closed");
			}
	}

	
	

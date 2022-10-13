package com.Efficiently.qa.base;


	

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;
	//import java.util.concurrent.TimeUnit;
	//import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Efficiently.qa.testdata.Testutil;

	

	//import org.openqa.selenium.remote;
	
	public class TestBase {
		
			
		   public static WebDriver driver;
		   public static Properties prop;
			
			public TestBase() throws java.io.IOException  {
				try {
					prop = new Properties();
					String ProjectPath = System.getProperty("user.dir");
					
					FileInputStream ip = new FileInputStream(ProjectPath+"\\Files\\config.properties");
				prop.load(ip);
				
				} catch(FileNotFoundException e) {
					e.printStackTrace();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
			
			
			@SuppressWarnings("deprecation")
			public static void initialization() {
			String browserName = prop.getProperty("browser");
			if(browserName.equals("Chrome")) {
				String ProjectPath = System.getProperty("user.dir");
				System.setProperty("webdriver.chrome.driver",ProjectPath+"\\Files\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			
			
				driver.manage().window().maximize();
			    driver.manage().deleteAllCookies();
				driver.get(prop.getProperty("url"));
				driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT,TimeUnit.SECONDS);
			
				
		}}






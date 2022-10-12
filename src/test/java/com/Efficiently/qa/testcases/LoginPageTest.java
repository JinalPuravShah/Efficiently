package com.Efficiently.qa.testcases;


	import java.io.IOException;

	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

import com.Efficiently.qa.base.TestBase;
import com.Efficiently.qa.pages.HomePage;
import com.Efficiently.qa.pages.LoginPage;

	
	
		public class LoginPageTest extends TestBase{
		 LoginPage loginPage;
		HomePage homePage;
		
		public LoginPageTest() throws IOException {
			super();
			// TODO Auto-generated constructor stub
		}
		@BeforeMethod
		public void SetUp() throws NullPointerException, IOException {
			initialization();
			loginPage =new LoginPage();
		}
		
		@Test(priority=1)
		public void loginTest() throws IOException, InterruptedException {
			
				homePage = loginPage.Login(prop.getProperty("Email"),prop.getProperty("Password"));
				homePage = loginPage.Scenario2();
				homePage =loginPage.Scenario3();
				// TODO Auto-generated catch block
				
			}
		
		
		//
	//@AfterMethod
		//public void tearDown() {
		//driver.quit();
		
		}



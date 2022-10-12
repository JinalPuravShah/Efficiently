package com.Efficiently.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Efficiently.qa.base.TestBase;
import com.Efficiently.qa.pages.HomePage;
import com.Efficiently.qa.pages.LoginPage;
import com.Efficiently.qa.pages.RoomsPage;

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	RoomsPage roomsPage;
	public HomePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	@BeforeMethod
	public void SetUp() throws NullPointerException, IOException, InterruptedException {
		initialization();
		loginPage = new LoginPage();
		homePage=loginPage.Login(prop.getProperty("Email"),prop.getProperty("Password"));
		}
	
	
	
	@Test(priority=1)
	public void HomeTest() throws IOException, InterruptedException {
		
			//HomePage homePage ;
		//	 homePage.home();
		
			// TODO Auto-generated catch block
			
		}
	
	
	
	@AfterMethod
	public void tearDown() {
	driver.quit();
	}
}

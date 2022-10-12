package com.Efficiently.qa.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Efficiently.qa.base.TestBase;
import com.Efficiently.qa.testdata.Testutil;


public class LoginPage extends TestBase {
	
	//WebDriverWait wait = new WebDriverWait(driver,30);
	
	@FindBy(xpath="//input[@type=\"email\"]")
	WebElement Email;
	
	@FindBy(xpath="//input[@type=\"password\"]")
	WebElement Password;
	
	@FindBy(xpath="//button[@class=\"h-flex-grow mat-raised-button mat-primary\"]")
	WebElement LogIn;
	
	@FindBy(xpath=" //*[text()=' Create new project ']")
	WebElement Createnewproject;
	
	@FindBy(xpath="//*[@id='mat-input-1']")
	WebElement Projectname;
	
	@FindBy(xpath="//*[@id='mat-input-2']")
	WebElement Streetaddress;
	
	@FindBy(xpath="//*[@id='mat-input-3']")
	WebElement City;
	
	
	@FindBy(xpath="//*[@id='mat-input-4']")
	WebElement State;
	
	
	@FindBy(xpath="//*[@id='mat-option-7']")
	WebElement AR;
	
	@FindBy(xpath="//*[@id='mat-input-5']")
	WebElement ZIPCode;
	
	
	@FindBy(xpath="//*[@id='mat-input-6']")
	WebElement ProjectType ;
	
	@FindBy(xpath="//*[@id='mat-option-57']")
	WebElement Commercial ;
	
	
	@FindBy(xpath="//*[@id='mat-radio-8']")
	WebElement Remodel ;
	
	@FindBy(xpath="//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']")
	WebElement Save ;
	
	
	@FindBy(xpath="//button[@class='mat-focus-indicator slds-m-top--x-small mat-button mat-button-base']")
	WebElement  Skipthisstep ;
	
	
	@FindBy(xpath="//a[@id='mat-tab-link-1']")
	WebElement Plans;
	
	@FindBy(xpath="//input[@class='ds-file-uploader__file-input' and @type='file']")
	WebElement Upload;
	
	
	
	
	@FindBy(xpath="//button[@class='mat-focus-indicator slds-m-left--x-large slds-shrink-none ds-page-detector__skip-auto-naming-action mat-stroked-button mat-button-base mat-white']")
	WebElement SkipAutoNaming;
	
	@FindBy(xpath="//a[@id='mat-tab-link-2']")
	WebElement Schedules;
	
	@FindBy(xpath="//a[@id='mat-tab-link-0']")
	WebElement Rooms;
	
	
	@FindBy(xpath="//*[@id=\"app-root\"]/ds-pages/mat-sidenav-container/mat-sidenav-content/div/main/ds-project-main/ds-project-detail/mat-drawer-container/mat-drawer-content/div/ds-schedules/div/ds-schedule-rooms/div/div[2]/button")
	WebElement CreateNewRooms;
	
	
	@FindBy(xpath="//*[@id=\"mat-menu-panel-7\"]/div/div/button[4]")
	WebElement Kitchen;
	
	
	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@SuppressWarnings("deprecation")
	public HomePage Login(String mail,String pwd) throws IOException, InterruptedException {
		
		 Email.sendKeys(mail);
         Password.sendKeys(pwd);
		 LogIn.click();
		 Thread.sleep(2000);
		 Createnewproject.click();
		
		 //Projectname.click();
		 Projectname.sendKeys("Amazon");
		 Streetaddress.sendKeys("XYZ");
		 City.sendKeys("Mumbai");
		 State.click();
		 AR.click();
		 ZIPCode.sendKeys("421301");
		 ProjectType.click();
		 Commercial.click();
		 Remodel.click();
		 Save.click();
		 Skipthisstep.click();
		 return new HomePage();
	}
		 
		
		 public HomePage Scenario2()throws IOException, InterruptedException{
			 Thread.sleep(2000);
		 Plans.click();
		 String ProjectPath = System.getProperty("user.dir");
		 Upload.sendKeys(ProjectPath+"\\Files\\Payslip Sept 2022.pdf");
		 Thread.sleep(3000);
		 SkipAutoNaming.click();
		 Thread.sleep(3000);
		 Schedules.click();
		 return new HomePage();
	 }
		 
		 public HomePage Scenario3()throws IOException, InterruptedException{
	     Rooms.click();
	    // CreateNewRooms.click();
	   //  Kitchen.click();
	     return new HomePage();
		 }
}



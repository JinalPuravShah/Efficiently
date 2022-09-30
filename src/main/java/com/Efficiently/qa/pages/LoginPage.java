package com.Efficiently.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Efficiently.qa.base.TestBase;


public class LoginPage extends TestBase {
	
	
	
	@FindBy(xpath="//input[@type=\"email\"]")
	WebElement Email;
	
	@FindBy(xpath="//input[@type=\"password\"]")
	WebElement Password;
	
	@FindBy(xpath="//button[@class=\"h-flex-grow mat-raised-button mat-primary\"]")
	WebElement LogIn;
	
	@FindBy(xpath=" //*[text()=' Create new project ']")
	WebElement Createnewproject;
	
	//@FindBy(xpath="//*[@id=\"mat-form-field-label-3\"]/mat-label")
	//WebElement Projectname;
	
	
	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	public HomePage Login(String mail,String pwd) throws IOException, InterruptedException {
		
		 Email.sendKeys(mail);
         Password.sendKeys(pwd);
		 LogIn.click();
		 Thread.sleep(29000);
		 Createnewproject.click();
		// Thread.sleep(29000);
		// Projectname.sendKeys("Amazon");
		return new HomePage();
	 }
}



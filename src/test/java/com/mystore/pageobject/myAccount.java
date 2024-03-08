package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myAccount {
	//1. create object of webdriver
		WebDriver ldriver;
		
		public myAccount(WebDriver rdriver) {
			 ldriver = rdriver;
			 PageFactory.initElements(rdriver, this);
		}
		//Identify WebElements
		@FindBy(xpath="//input[@id='email_create']")
		WebElement createEmailId;
		
		@FindBy(xpath = "//button[@id='SubmitCreate']")
		WebElement Submitbutton;
		//Identify action on web-element
		public void enterCreateEmailAddress(String emailadd){
		       createEmailId.sendKeys(emailadd); 	
		}
		public void clickSubmitCreate() {
			Submitbutton.click();
		}
		
		//Already registered users
		@FindBy(id="email")
		WebElement registeredUsersEmail;
		
		@FindBy(id="passwd")
		WebElement registeredUsersPwd;
		
		@FindBy(id="SubmitLogin")
		WebElement submitlogin;
		
		//Actions methods for already registerd users
		public void enterEmailAddress(String emailadd){
		       registeredUsersEmail.sendKeys(emailadd); 	
		}
		public void enterPassword(String pwd) {
			registeredUsersPwd.sendKeys(pwd);
		}
		public void ClickSubmit() {
			submitlogin.click();
		}
		

}

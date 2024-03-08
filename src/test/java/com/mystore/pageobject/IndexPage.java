package com.mystore.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IndexPage {
//1. create object of webdriver
	WebDriver ldriver;
	
	public IndexPage(WebDriver rdriver) {
		ldriver = rdriver;
		 PageFactory.initElements(rdriver, this);
	}
	//Identify WebElements
	@FindBy(linkText = "Sign in")
	WebElement signIn;
	
	//Identify action on webelement
	public void clickOnSignIn(){
		signIn.click();
		
		
	}
	
}

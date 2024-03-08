package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class accountCreationDetails {


	
	 public accountCreationDetails(WebDriver rdriver){
		 WebDriver ldriver;
		 ldriver = rdriver;
		 PageFactory.initElements(rdriver, this);
	}
	 
	 //identify the account creation elements
	 @FindBy(id="id_gender1")//title Mr.
	 WebElement titleMr;
	 
	 @FindBy(id="customer_firstname")//first_name
	 WebElement firstName;
	 
	 @FindBy(id="customer_lastname")//last_name
	 WebElement lastName;
	 
	 @FindBy(id="passwd")//password
	 WebElement password;
	 
	 @FindBy(id="submitAccount")
	 WebElement register;
	 
	 //identify actions to be performed on web elements
	 public void selectTitleMr() {
		 titleMr.click();
	 }
	 
	 public void enterCustomerFirstName(String fname) {
		 firstName.sendKeys(fname);
	 }
	 public void enterCustomerLastName(String lname) {
		 lastName.sendKeys(lname);
	 }
	 public void enterPassword(String pass) {
		 password.sendKeys(pass);
	 }
	 public void clikOnRegister() {
		 register.click();
	 }
}

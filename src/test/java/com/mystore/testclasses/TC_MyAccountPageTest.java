package com.mystore.testclasses;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mystore.pageobject.IndexPage;
import com.mystore.pageobject.accountCreationDetails;
import com.mystore.pageobject.myAccount;
import com.mystore.pageobject.registeredUserAccount;

import junit.framework.Assert;

public class TC_MyAccountPageTest extends BaseClass{
//	@Test(priority=1)
//	public void verifyRegistrationAndLogin() {
//		//launch browser
//		//openUrl
//
//		 
//
//		IndexPage pg = new IndexPage(driver);
//		pg.clickOnSignIn();
//
//		logger.info("Clicked on sign in link");
//
//
//		myAccount pg1 = new myAccount(driver);
//		pg1.enterCreateEmailAddress("mayurthakare3@gmail.com");
//		logger.info("Email address entered in create account section");
//		pg1.clickSubmitCreate();  
//		logger.info("Clicked on create an account button");
//
//
//		accountCreationDetails accCreationPg =new accountCreationDetails(driver);
//
//		accCreationPg.selectTitleMr();
//		accCreationPg.enterCustomerFirstName("Mayur");
//		accCreationPg.enterCustomerLastName("Thakare");
//		accCreationPg.enterPassword("Rekha@7080");
//		logger.info("Enterd user details on account creation page");
//
//		accCreationPg.clikOnRegister(); 
//		logger.info("Clicked on register button");
//
//		registeredUserAccount regUser= new registeredUserAccount(driver); String
//		userName = regUser.getUserName();
//
//		Assert.assertEquals("Mayur Thakare", userName);
//	}
	@Test
	public void VerifyLogin() throws IOException {
		
		logger.info(".......VerifyLogin test Execution Started.....");
		
		IndexPage pg = new IndexPage(driver);
		pg.clickOnSignIn();

		logger.info("Clicked on sign in link");


		myAccount pg1 = new myAccount(driver);
		
	    pg1.enterEmailAddress("mayurthakare3@gmail.com");
	    logger.info("Enterd email address");
		pg1.enterPassword("Rekha@7080");
		logger.info("Entered password");
		
		pg1.ClickSubmit();
		logger.info("Clicked on sign in link");
		
		registeredUserAccount regUser= new registeredUserAccount(driver); String
		userName = regUser.getUserName();
		
		if(userName.equals("Mayur Thakare")) {
			logger.info("Verify login - passed");
            	
		    Assert.assertTrue(true);
		}
		else {
			logger.info("Verifylogin - Failed");
			captureScreenShot(driver, "VerifyLogin");	
			Assert.assertTrue(false);
		}
		
	}

}

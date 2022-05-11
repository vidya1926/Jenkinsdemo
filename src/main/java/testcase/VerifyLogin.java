package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class VerifyLogin extends BaseClass{
	
@Test
	public void runLogin() throws InterruptedException {
		
		
		 new LoginPage(driver,prop1)		
		.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.verifyHomePage().clickLead().clickCreateLead().verifyCreateLead();
		

	}

}

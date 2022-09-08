package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class VerifyLogin extends BaseClass{

	
	@Test
	public void runVerifyLogin() {
		 new LoginPage(driver).		
		enterUserName()
		.enterPassword()
		.clickLogin();
		
	}
}

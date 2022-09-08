package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class CreateLead extends BaseClass{
	
	@BeforeTest
	public void setUp() {
		fileName = "CreateLead";
	}

	@Test(dataProvider = "fetchData")
	public void runCreateLead(String cName, String fName, String lName) {
		
		new LoginPage(driver).enterUserName()
		.enterPassword()
		.clickLogin()
		.verifyHomePage()
		.clickCRMSFA()
		.clickLeads();
		
	}
}

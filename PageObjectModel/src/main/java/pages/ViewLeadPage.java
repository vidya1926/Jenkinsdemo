package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import base.BaseClass;

public class ViewLeadPage extends BaseClass {

	
	public ViewLeadPage verifyFirstName(String fName) {
		String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		Assert.assertEquals(firstName, fName);
	//	Assert.assertTrue(driver.findElement(By.id("viewLead_firstName_sp")).isDisplayed());
		return this;
	}
	
	public void clickEditLead() {
		
	}
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class LeadsPage extends BaseClass{

public LeadsPage(RemoteWebDriver driver) {
	this.driver=driver;
	 
		
	}
	
	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);
	}
	
	
	public void clickFindLeads() {
		
	}
}

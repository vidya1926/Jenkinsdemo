package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateLead extends BaseClass{

	
	public CreateLead(ChromeDriver driver,Properties prop1) {
		this.driver = driver;
		this.prop1=prop1;
		
	}
	
	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText(prop1.getProperty("createLeads"))).click();
		return new CreateLeadPage(driver,prop1);
		
	}
	
	
}

package pages;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateLeadPage extends BaseClass {

	public CreateLeadPage(ChromeDriver driver,Properties prop1) {
		this.driver = driver;
		this.prop1=prop1;}
	
   public CreateLeadPage verifyCreateLead() {
	System.out.println(driver.getTitle());
	
	return this;
	
}
}

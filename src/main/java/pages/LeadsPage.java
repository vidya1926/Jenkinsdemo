package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class LeadsPage extends BaseClass {

	public LeadsPage(ChromeDriver driver,Properties prop1) {
		this.driver = driver;
		this.prop1=prop1;
	}
	
	public CreateLead clickLead() {
		driver.findElement(By.linkText(prop1.getProperty("LeadsLink"))).click();
		return new CreateLead(driver,prop1);
		
	}

}

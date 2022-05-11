package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.BaseClass;

public class HomePage extends BaseClass {


	public HomePage(ChromeDriver driver,Properties prop1) {
		this.driver = driver;
		this.prop1=prop1;
	
		
	}
	
//	public MyHomePage clickCrmsfaLink() {
//		driver.findElement(By.linkText("CRM/SFA")).click();
//
//		return new MyHomePage(driver);
//	}
	
	public LoginPage clickLogout() {
		driver.findElement(By.className("decorativeSubmit")).click();
		
		return new LoginPage(driver,prop1);
	}
	
	public LeadsPage verifyHomePage() {
		
		driver.findElement(By.linkText(prop1.getProperty("crmsfalink"))).click();
	
			
		return new LeadsPage(driver,prop1);
		
	}
	
}

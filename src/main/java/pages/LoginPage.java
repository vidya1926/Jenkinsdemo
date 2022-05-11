package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage(ChromeDriver driver,Properties prop1) {
		this.driver = driver;
		this.prop1=prop1;
	}
				//action+ElementName
	public LoginPage enterUsername() throws InterruptedException {
		driver.findElement(By.name("USERNAME")).sendKeys(prop1.getProperty("userName"));
		//		Thread.sleep(10000);
		return this;
	}
	
	public LoginPage enterPassword() {
		
		driver.findElement(By.id("password")).sendKeys(prop1.getProperty("password"));
		
		return this;
	}
	
	public HomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		
		return new HomePage(driver,prop1);
	}
	

}

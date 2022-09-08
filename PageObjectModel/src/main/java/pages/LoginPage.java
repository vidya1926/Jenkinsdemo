package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage(RemoteWebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBys({ @FindBy(how = How.CLASS_NAME, using = "inputLogin"),
			@FindBy(how = How.XPATH, using = "//input[@id='username']") })
	List<WebElement> eleCredential;

	public LoginPage enterUserName() {
		// eleUsername.sendKeys("DemoSalesManager");
		eleCredential.get(0).sendKeys("DemoSalesManager");
		return this;
	}

	public LoginPage enterPassword() {
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		//eleCredential.get(1).sendKeys("crmsfa");
		return this;
	}

	public HomePage clickLogin() {
		// click on Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage(driver);
	}
}

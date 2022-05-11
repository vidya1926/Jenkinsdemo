package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public ChromeDriver driver;
public  Properties prop1;
@Parameters({"language"})
@BeforeMethod
	public void preCondition(String language) throws IOException {
	prop1 = new Properties();
	FileInputStream fis1 = new FileInputStream(new File("./src/test/java/"+language+".properties"));
	prop1.load(fis1);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); // driver is initialized "sdadq442342dfdff"
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
	}
@AfterMethod
public void postCondition() {
	driver.close();
}
	
}

package Base;

import java.io.IOException;
import java.sql.Driver;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Exc;
@Test

public class BaseClass {
	public RemoteWebDriver driver;
	public  String excelFilename;
	@DataProvider
	public String[][] readData() throws IOException {
		String[][] dataexc = Exc.datare(excelFilename);
		return dataexc;

	}
	
	@BeforeMethod
	@Parameters({"Browser"})
	public void precondition(String Browser) {
		if (Browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://leaftaps.com/opentaps");
		}else if (Browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("http://leaftaps.com/opentaps");
			
		}

		
		

	}
	
	  @AfterMethod public void postCondition() { 
		  driver.close();
	  
	  }
	 

}

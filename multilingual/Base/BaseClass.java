package Base;

import java.io.IOException;
import java.sql.Driver;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Exc;
@Test

public class BaseClass {
	public ChromeDriver driver;
	public  String excelFilename;
	public static Properties prop=new Properties();
	@DataProvider(indices= {0,1})
	public String[][] readData() throws IOException {
		String[][] dataexc = Exc.datare(excelFilename);
		return dataexc;

	}
	@BeforeMethod
	public void precondition() {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leaftaps.com/opentaps");

	}
	
	  @AfterMethod public void postCondition() { 
		  driver.close();
	  
	  }
	 

}

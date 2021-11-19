package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Base.BaseClass;

public class MyHomePage extends BaseClass {
	public MyHomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	public MyHomePage verifyMyHomepage() {
		boolean displayed = driver.findElement(By.linkText("Leads")).isDisplayed();
		Assert.assertTrue(displayed);
		return this;
		

	}
	public MyLeadsPage clickLeads() {
		driver.findElement(By.linkText(prop.getProperty("MyLeadsPage_clickLeads"))).click();
		return new MyLeadsPage(driver);

	}

}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import Base.BaseClass;

public class MyHomePage extends BaseClass {
	public MyHomePage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	public MyHomePage verifyMyHomepage() {
		boolean displayed = driver.findElement(By.linkText("Leads")).isDisplayed();
		Assert.assertTrue(displayed);
		return this;
		

	}
	public MyLeadsPage clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage(driver);

	}

}

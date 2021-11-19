package Pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import Base.BaseClass;

public class MyLeadsPage extends BaseClass{
	public MyLeadsPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
public MyLeadsPage verifyMyLeadsPage() {
	boolean displayed = driver.findElement(By.linkText("Create Lead")).isDisplayed();
	Assert.assertTrue(displayed);
	return this;
	

}
public CreateLeadsPage clickCreateLead() {
	driver.findElement(By.linkText("Create Lead")).click();
	return new CreateLeadsPage(driver);
}
public FindLeadsPage clickFindLeads() {
	driver.findElement(By.linkText("Find Leads")).click();
	return new FindLeadsPage(driver);

}
}

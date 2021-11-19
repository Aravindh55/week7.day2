package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Base.BaseClass;

public class CreateLeadsPage extends BaseClass {
	public CreateLeadsPage(ChromeDriver driver) {
	this.driver=driver;
	
	}
public CreateLeadsPage verifyCreateLead() {
	boolean displayed = driver.findElement(By.name("submitButton")).isDisplayed();
	Assert.assertTrue(displayed);
	return this;
}
public CreateLeadsPage enterCompanyname() {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	return this;
	
}
public CreateLeadsPage enterFirstname() {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
	return this;
}
public CreateLeadsPage enterSecondname() {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
	return this;
}
public CreateLeadsPage enterPhonenumber() {
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
	return this;
}
public ViewLeadPage clickCreateLeadButton() {
	driver.findElement(By.name("submitButton")).click();
	return new ViewLeadPage(driver);
}
}

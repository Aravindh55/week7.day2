package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import Base.BaseClass;

public class ViewLeadPage extends BaseClass{
	public ViewLeadPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	public ViewLeadPage verifyViewLead() {
		boolean displayed = driver.findElement(By.xpath("//span[text()='First name']")).isDisplayed();
		Assert.assertTrue(displayed);
		return this;
		

	}
	public EditLeadPage clickEditButton() {
		driver.findElement(By.linkText("Edit")).click();
		return new EditLeadPage(driver);
	}
public DuplicateLeadPage clickDuplicateLeadButton() {
	 driver.findElement(By.linkText("Duplicate Lead")).click();
	 return new DuplicateLeadPage(driver);
	

}
}

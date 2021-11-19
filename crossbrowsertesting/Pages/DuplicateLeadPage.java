package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import Base.BaseClass;

public class DuplicateLeadPage extends BaseClass {
	public DuplicateLeadPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	public DuplicateLeadPage verifyDuplicateLead() {
		boolean displayed = driver.findElement(By.xpath("//div[text()='Duplicate Lead']")).isDisplayed();
		Assert.assertTrue(displayed);
		return this;
		

	}
	public ViewLeadPage clickClbutton() {
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		return new ViewLeadPage(driver);

	}

}

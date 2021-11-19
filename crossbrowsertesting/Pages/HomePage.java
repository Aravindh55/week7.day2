package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import Base.BaseClass;

public class HomePage extends BaseClass{
	public HomePage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	public HomePage verifyHomePage() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		Assert.assertTrue(displayed);
		return this;
		
}
	public MyHomePage clickCrmsfalink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
		
}

}

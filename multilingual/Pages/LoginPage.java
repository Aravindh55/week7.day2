package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public LoginPage enterUsername(String user) {
		driver.findElement(By.id("username")).sendKeys(user);
		return this;

	}
	public LoginPage enterPassword(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
		return this;
	}
	public HomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage(driver);

	}

}

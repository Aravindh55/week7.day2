package Testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.LoginPage;

public class TC02EditLead extends BaseClass{
@BeforeTest
	public void setValue() {
		excelFilename="editlead";

	}
	@Test(dataProvider="readData")
	public void runEditLead(String user,String pass) throws InterruptedException{
		LoginPage el=new LoginPage(driver);
		el.enterUsername(user)
		.enterPassword(pass)
		.clickLogin()
		.verifyHomePage()
		.clickCrmsfalink()
		.verifyMyHomepage()
		.clickLeads()
		.verifyMyLeadsPage()
		.clickFindLeads()
		.verifyFindLeads()
		.clickPhone()
		.enterPhone()
		.clickFindLeadsButton()
		.clickOnFirstlead()
		.clickEditButton()
		.clearExistingName()
		.updateCompanyname()
		.clickUpdate()
		.verifyViewLead();
		
		
		
		

	}

}

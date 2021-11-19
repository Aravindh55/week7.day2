package Testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.LoginPage;

public class TC03DuplicateLead extends BaseClass {
	@BeforeTest
	public void setValue() {
		excelFilename="duplicatelead";

	}
	@Test(dataProvider="readData")
	public void runDuplicateLead(String user,String pass) throws InterruptedException {
		LoginPage dl=new LoginPage(driver);
		dl.enterUsername(user)
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
		.verifyViewLead()
		.clickDuplicateLeadButton()
		.verifyDuplicateLead()
		.clickClbutton()
		.verifyViewLead();
				
		

	}
	

}

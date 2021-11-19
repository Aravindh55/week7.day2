package Testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.LoginPage;

public class TC01CreateLead extends BaseClass {
	
	@BeforeTest	
	public void setValue() {
		excelFilename="createlead";

	}
	@Test(dataProvider="readData")
	public void runCreateLead(String user,String pass) {
	LoginPage cl=new LoginPage(driver);
	cl.enterUsername(user)
	.enterPassword(pass)
	.clickLogin()
	.verifyHomePage()
	.clickCrmsfalink()
	.verifyMyHomepage()
	.clickLeads()
	.verifyMyLeadsPage()
	.clickCreateLead()
	.verifyCreateLead()
	.enterCompanyname()
	.enterFirstname()
	.enterSecondname()
	.enterPhonenumber()
	.clickCreateLeadButton()
	.verifyViewLead();

	}

}

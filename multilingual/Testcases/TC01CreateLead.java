package Testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

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
	public void runCreateLead(String lang,String user,String pass) throws IOException {
		File file = null;
		if (lang.equalsIgnoreCase("EN")) {
			file=new File("src/main/resources/en.properties");
		}else if (lang.equalsIgnoreCase("FN")) {
		   file=new File("src/main/resources/fn.properties");
			
			
			
		}
		FileInputStream fs=new FileInputStream(file);
		prop.load(fs);
		
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

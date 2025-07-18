package testCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjectModel.HomePageObject;
import pageObjectModel.RegistrationPageObject;
import resources.BaseClass;
import resources.Data;

public class RegistrationTestCases extends BaseClass {
	
	@Test
	public void verifyRegistrationWithValidData() throws InterruptedException
	{   //homepage creation
		HomePageObject hpo=new HomePageObject(driver);
		Thread.sleep(2000);
		hpo.methodMyAccount().click();
		hpo.methodRegister().click();
		
		RegistrationPageObject rpo=new RegistrationPageObject(driver);
		rpo.methodFirstName().sendKeys(Data.FirstName);
		rpo.methodLastName().sendKeys(Data.LastName);
		rpo.methodEmailId().sendKeys(emailaddress);
		rpo.methodTelephone().sendKeys(Data.mobileNumber);
		rpo.methodPassword().sendKeys();
		rpo.methodConfirmPassword().sendKeys(Data.password);
		rpo.methodPrivatepolicy().click();
		rpo.methodContinue().click();
		
		
		SoftAssert sa= new SoftAssert();
		String actualtext=rpo.methosRegistrationSuccessfull().getText();
		String expectedText=Data.expectedtesxtlogin;
		sa.assertEquals("actualtext", "expectedText");
		
		
	}
	
	@Test(enabled=false)
	public void verifyRegistrationwithBlankData() throws InterruptedException
	{
		HomePageObject hpo=new HomePageObject(driver);
		Thread.sleep(2000);
		hpo.methodMyAccount().click();
		hpo.methodRegister().click();
		
		RegistrationPageObject rpo=new RegistrationPageObject(driver);
		rpo.methodContinue().click();
		
		SoftAssert sa= new SoftAssert();
		//Thread.sleep(3000);
		String actualFirstnametext=rpo.methodactualFirstnametext().getText();
		String expectedFirstnameText=Data.expectedFirstName;
		sa.assertEquals("actualFirstnametext", "expectedFirstnameText");
		
		String actuallastnametext=rpo.methodactualFirstnametext().getText();
		String expectedlastnameText=Data.expectedLastName;
		sa.assertEquals("actuallastnametext", "expectedlastnameText");
		
		String actualemailId=rpo.methodactualemilid().getText();
		String expectedemailid=Data.expectedEmail;
		sa.assertEquals("actualemailId", "expectedemailid");
		
		String actualtelephone=rpo.methodactuatelephone().getText();
		String expetedtelephone=Data.expectedTelephoneText;
		sa.assertEquals("actualtelephone", "expetedtelephone");
		
		String actualpassword=rpo.methodactualpassword().getText();
		String expectedpassword=Data.expectedPasswordText;
		sa.assertEquals("actualpassword", "expectedpassword");
		
	}
	
	

}

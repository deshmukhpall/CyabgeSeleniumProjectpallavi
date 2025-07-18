package testCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjectModel.HomePageObject;
import pageObjectModel.LoginPageObject;
import resources.BaseClass;
import resources.Data;

public class LoginTestCases extends BaseClass{
	
	@Test
	public void loginWithValidData() throws InterruptedException
	{
		HomePageObject hpo=new HomePageObject(driver);
		Thread.sleep(2000);
		hpo.methodMyAccount().click();
		hpo.clickLoginButton().click();
		
		LoginPageObject lpo=new LoginPageObject(driver);
		lpo.enterEmailId().sendKeys(emailaddress);
		lpo.enterPassword().sendKeys(Data.password);
		lpo.enterSubmitButton().click();
		
		SoftAssert sa1=new SoftAssert();
		String expectedLogin=Data.expectedLoginUrl;
		String actualLogin=driver.getCurrentUrl();
		sa1.assertEquals("actualLogin", "expectedLogin");
		
		
	
	
	}

}

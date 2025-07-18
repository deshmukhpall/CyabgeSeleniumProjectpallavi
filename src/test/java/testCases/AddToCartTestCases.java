package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjectModel.AddtoCartPageObject;
import resources.BaseClass;

public class AddToCartTestCases extends BaseClass {
	
	
	
	@Test
	public void addToCart()
	{   
		
		//Alternate Way
		//WebElement addToCart = driver.findElement(By.xpath("//h4/a[contains(text(),'Samsung Galaxy')]/ancestor::div[contains(@class,'product-thumb')]//i[contains(@class,'shopping-cart')]"));
		//addToCart.click();
		AddtoCartPageObject acp=new AddtoCartPageObject(driver);
		acp.methodSearchField().sendKeys("Samsung");
		acp.methodClickOnSearchFeild().click();
		
		List<WebElement> titles=driver.findElements(By.xpath("//h4//a"));
		
		for(WebElement title :titles )
		{
			if(title.getText().equalsIgnoreCase("Samsung Galaxy Tab 10.1"))
			{
				title.findElement(By.xpath("./ancestor::div[contains(@class,'product-thumb')]//i[contains(@class,'fa-shopping-cart')]")).click();
				break;
			}
		}
		
	}

}

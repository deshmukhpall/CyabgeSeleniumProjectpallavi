package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddtoCartPageObject {
	
	
	public WebDriver driver;
	private By SearchField=By.xpath("//input[@name='search']");
	private By ClickOnSearchFeild=By.xpath("(//button[@type='button'])[4]");
	
	
	
	public AddtoCartPageObject(WebDriver driver) {
		this.driver=driver;
	}


	public WebElement methodSearchField()
	{
		return driver.findElement(SearchField);
		
	}
	
	
	public WebElement methodClickOnSearchFeild()
	{
		return driver.findElement(ClickOnSearchFeild);
		
	}
	

}

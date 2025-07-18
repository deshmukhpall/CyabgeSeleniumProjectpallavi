package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.BaseClass;

public class HomePageObject extends BaseClass {
	public WebDriver driver;
	private By MyAccount=By.xpath("//span[text()='My Account']");
	private By Register=By.xpath("//a[text()='Register']");
	private By LoginButton = By.xpath("//a[contains(text(),'Login')]");
	
	public HomePageObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	

	public WebElement methodMyAccount() 
	{
		return driver.findElement(MyAccount);
	}
	
	public WebElement methodRegister() 
	{
		return driver.findElement(Register);
	}
	
	public WebElement clickLoginButton() {
		return driver.findElement(LoginButton);
	}
	
	
	
	


}

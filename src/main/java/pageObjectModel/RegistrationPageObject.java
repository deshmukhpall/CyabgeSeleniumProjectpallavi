package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPageObject {
	
	public WebDriver driver;
	private By FirstName=By.xpath("//input[@id='input-firstname']");
	private By LastName=By.xpath("//input[@id='input-lastname']");
    private By EmailId=By.xpath("//input[@id='input-email']");
    private By Telephone= By.xpath("//input[@id='input-telephone']");
    private By Password=By.xpath("//input[@id='input-password']");
    private By ConfirmPassword=By.xpath("//input[@id='input-confirm']");
    private By PrivatePolicy=By.xpath("//input[@name='agree']");
    private By Continue=By.xpath("//input[@type='submit']");
    private By RegistrationSuccessfull=By.xpath("//div[@id='content']/h1");
    private By actualFirstnametext=By.xpath("//div[text()='First Name must be between 1 and 32 characters!']");
    private By actuallastname=By.xpath("//div[text()='Last Name must be between 1 and 32 characters!']");
    private By actualemilid=By.xpath("//div[text()='E-Mail Address does not appear to be valid!']");
    private By actuatelephone=By.xpath("//div[text()='Telephone must be between 3 and 32 characters!']");
    private By actualpassword=By.xpath("//div[text()='Password must be between 4 and 20 characters!']");
    
    public RegistrationPageObject(WebDriver driver) {
    	this.driver=driver;
    	
		}
	public WebElement methodFirstName()
    {
    	return driver.findElement(FirstName);
    			
    }
    public WebElement methodLastName()
    {
    	return driver.findElement(LastName);
    			
    }
    
    public WebElement methodEmailId()
    {
    	return driver.findElement(EmailId);
    			
    }
    
    public WebElement methodTelephone()
    {
    	return driver.findElement(Telephone);
    			
    }
    
    public WebElement methodPassword()
    {
    	return driver.findElement(Password);
    			
    }
    
    public WebElement methodConfirmPassword()
    {
    	return driver.findElement(ConfirmPassword);
    			
    }
    
    public WebElement methodPrivatepolicy()
    {
    	return driver.findElement(PrivatePolicy);
    			
    }
    
    public WebElement methodContinue()
    {
    	return driver.findElement(Continue);
    			
    }
    
    public WebElement methosRegistrationSuccessfull()
    {
    	return driver.findElement(RegistrationSuccessfull);
    			
    }
    
    public WebElement methodactualFirstnametext()
    {
    	return driver.findElement(actualFirstnametext);
    			
    }
    
    public WebElement mthodactuallastname()
    {
    	return driver.findElement(actuallastname);
    			
    }
    
    public WebElement methodactualemilid()
    {
    	return driver.findElement(actualemilid);
    			
    }
    
    public WebElement methodactuatelephone()
    {
    	return driver.findElement(actuatelephone);
    			
    }
    
    public WebElement methodactualpassword()
    {
    	return driver.findElement(actualpassword);
    			
    }

}

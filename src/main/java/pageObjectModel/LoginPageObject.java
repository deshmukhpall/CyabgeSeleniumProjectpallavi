package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {

	public WebDriver driver;

	
	private By emailid = By.xpath("//input[@id='input-email']");
	private By password = By.xpath("//input[@id='input-password']");
	private By SubmitButton = By.xpath("//input[@type='submit']");

	

	public LoginPageObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement enterEmailId() {
		return driver.findElement(emailid);
	}

	public WebElement enterPassword() {
		return driver.findElement(password);
	}

	public WebElement enterSubmitButton() {
		return driver.findElement(SubmitButton);
	}

}

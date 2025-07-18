package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public WebDriver driver;
	public static String emailaddress=generateEmailAddress();
	
	public void initializeBrowser() throws IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\pdeshmukh\\eclipse-workspace\\PallaviSeleniumFramework\\src\\main\\java\\resources\\data.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			 driver=new ChromeDriver();
		}
		
		else if(browserName.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		else if(browserName.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		
	}
	
	
	@BeforeMethod
	public void browserLaunch() throws IOException
	{   
		initializeBrowser();
		driver.get("https://naveenautomationlabs.com/opencart/");
		 driver.manage().window().maximize();	
		 }
	
	public static String generateEmailAddress() {
		return System.currentTimeMillis()+"@gmail.com";
	}

}

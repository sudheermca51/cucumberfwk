package mmp.helper;

import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import mmp.pages.LoginPage;

public class BaseClass {
	protected  WebDriver driver;
	protected Properties pro;
	LoginPage login;

	public void instantiateDriver() throws IOException
	{
		ProjectConfiguration pConfig = new ProjectConfiguration();
		pro = pConfig.loadProperties();
		String browser = pro.getProperty("browserType");
	 
		if(browser.equals("chrome"))
		{
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			 
		}
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		String applicationURL = "http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php";
		 
		driver.get(applicationURL);
		 
		 
	}
}

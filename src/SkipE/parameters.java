package SkipE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import org.testng.annotations.Parameters;


public class parameters 
{

	WebDriver driver;
	@Parameters({"browser","url","chrome"})
	@Test
	public void PBlogin(String browser,String url,String emailid,String pass)
	{
		if(browser.equals("chrome"))
		{
		System.setProperty("Webdriver.chrome.driver","C:\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		}
		driver.get(url);
		
        driver.findElement(By.name("email")).sendKeys(emailid);
		
		driver.findElement(By.id("pass")).sendKeys(pass);
		
	}
}

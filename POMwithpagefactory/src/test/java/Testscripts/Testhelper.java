package Testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver; 

public class Testhelper  {
	WebDriver driver;
	
	public void browsers(String b)
	{
		if (b.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		}
		else  if (b.equalsIgnoreCase("Mozila"))
		{
			System.setProperty("webdriver.gecko.driver","tware\\geckodriver-v0.21.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		
		
	}
	
	//@BeforeTest
	@BeforeMethod
	@Parameters({"browsers"})

	void openbrowers(String brow)
	{
	browsers(brow);
	
	System.out.println("Browser name is "+brow);
		//driver.get("http://demo.guru99.com/test/delete_customer.php");
	driver.get("http://newtours.demoaut.com/");
}
	
   //@AfterTest
	//@AfterMethod
    
    
    void browserclose()
    {
    	driver.close();
    }
	

}





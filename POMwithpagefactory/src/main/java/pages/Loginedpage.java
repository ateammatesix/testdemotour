package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Testscripts.Testhelper;

public class Loginedpage extends Testhelper {
	
	WebDriver driver;
	
	@FindBy(name="tripType")
	List <WebElement> r;
	
	@FindBy(how = How.CSS, using = "[type='radio'][value='roundtrip']")
	public WebElement roundTrip;

	@FindBy(how = How.CSS, using = "[type='radio'][value='oneway']")
	public WebElement oneWay;
	
	@FindBy(name="findFlights")
	WebElement finalclick;
	
	@FindBy(className="footer")
	WebElement foot;
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")
	WebElement signout;
	
	@FindBy(name="passCount")
	WebElement  Passengers;
	
	@FindBy(name="fromPort")
	WebElement  port;
	
	@FindBy(name="fromMonth")
	WebElement  Month;
	
	@FindBy(name="fromDay")
	WebElement  day;
	
	@FindBy(name="toMonth")
	WebElement  toMonth;
	
	@FindBy(name="findFlights")
	WebElement  Flights;
	
	
	
	public Loginedpage(WebDriver driver) {
		this.driver = driver;

	    //This initElements method will create all WebElements

	    PageFactory.initElements(driver, this);
		
		
	}




	
	public void VerifyLogin() throws InterruptedException {
		
		String URL =driver.getCurrentUrl();
		System.out.println("Demotours url is"+URL);
		foot.getText().trim();
		Assert.assertEquals(foot.getText().trim(),"© 2005, Mercury Interactive (v. 011003-1.01-058)");
        System.out.println("hello world footer is "+foot.getText().trim());
        Thread.sleep(3000);
	}
	
	
public void Radiooperation() throws InterruptedException

{

	System.out.println("Radio button text");
	Thread.sleep(3000);
   //r.get(1).click();
   
 // String s=r.get(0).getText();
	oneWay.click();
	Thread.sleep(3000);
	r.get(0).click();
	Thread.sleep(3000);
	//System.out.println("radio button text is"+s);
	//return s;
	
	}

public void passangersoperation() throws InterruptedException {
	
	Passengers.click();
	Select passobj = new Select(Passengers);
	passobj.selectByIndex(2);
	Thread.sleep(2000);
	
	
	
	
}

public void Departingoperation() throws InterruptedException {
	Select portobj = new Select(port);
	portobj.selectByVisibleText("London");
	Thread.sleep(2000);
}

public void date() throws InterruptedException {
	Select monthobj = new Select(Month);
	monthobj.selectByValue("11");
	Select dayobj = new Select(day);
	dayobj.selectByVisibleText("10");
	Thread.sleep(2000);
	Select tomoth = new Select(toMonth);
	tomoth.selectByVisibleText("December");
	
}

public void findflightsclick() {
	Flights.click();

}



	public String webtitle() {
		String actualtitle=driver.getTitle();
	    return actualtitle;
	}
	
	public void signoutmethod()
	{
		signout.click();
		
	}
	
	public void radio2test() {
		Boolean roundTrip1 = roundTrip.isSelected();
		Boolean oneWay1 = oneWay.isSelected();
		
		if (roundTrip1 == true) {
			oneWay.click();
			System.out.println("oneWay111");
			} else {
			System.out.println("roundTrip222");
			}

		
	}
}



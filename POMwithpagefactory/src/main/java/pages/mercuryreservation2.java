package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class mercuryreservation2 {
	 
	WebDriver driver;
	
	@FindBy(name="outFlight")
	//@FindBy(name="radio")
    List <WebElement> r;
	
	@FindBy(how = How.CSS, using = "[type='radio'][value='Pangea Airlines$362$274$9:17']")
	public WebElement r3;

	@FindBy(how = How.CSS, using = "[type='radio'][value='Blue Skies Airlines$360$270$5:03")
	public WebElement r1;
	
	@FindBy(how = How.CSS, using = "[type='radio'][value='Blue Skies Airlines$361$271$7:10")
	public WebElement r2;
	
	@FindBy(how = How.CSS, using = "[type='radio'][value='Unified Airlines$633$303$18:44")
	public WebElement r8;
	
	@FindBy(name="reserveFlights")
	public WebElement continuesecond;
	
	

	public mercuryreservation2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	public String webturl() {
		String actualurl=driver.getCurrentUrl();
		System.out.println("Demotours url of mercuryreservation2 "+actualurl);
	    return actualurl;
	}
	
public void mercuryradio1() throws InterruptedException
{
r.get(2);
r3.click();
Thread.sleep(3000);
r8.click();
}

public void secondcontinue()

{
	continuesecond.click();
	
}
}
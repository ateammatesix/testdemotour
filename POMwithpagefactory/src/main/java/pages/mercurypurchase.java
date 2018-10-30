package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class mercurypurchase {
	
	
	@FindBy(name="passFirst0")
	public WebElement fname;
	
	@FindBy(name="passLast0")
	public WebElement lname;
	
	@FindBy(name="pass.0.meal")
	WebElement  meal;
	
	
	
	@FindBy(name="creditCard")
	WebElement Card;
	
	
	@FindBy(name="creditnumber")
	WebElement Cardno;
	
	@FindBy(name="cc_exp_dt_mn")
	WebElement  Expmn;
	
	@FindBy(name="cc_exp_dt_yr")
	WebElement  Expyr;
	
	@FindBy(name="cc_frst_name")
	WebElement  cardfname;
	
	@FindBy(name="cc_mid_name")
	WebElement  cardmname;
	
	@FindBy(name="cc_last_name")
	WebElement  cardlname;
	
	@FindBy(name="ticketLess")
	WebElement  ticketLess;
	
	
	@FindBy(name="buyFlights")
	WebElement  securepurchase;
	
	
	WebDriver driver;
	public mercurypurchase(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	

	public String mercurypurchaseurl() {
		String actualurl=driver.getCurrentUrl();
		System.out.println("Demotours url of mercurypurchase "+actualurl);
	    return actualurl;
	}
	
	public void firstlastname(){
		fname.sendKeys("Rahul");
		lname.sendKeys("dravid");
	}
	
	public void meals() {
		Select mealsobj = new Select(meal);
		mealsobj.selectByVisibleText("Vegetarian");	
	}
	
	public void selectcard() {
		Select cardobj= new Select(Card);
		cardobj.selectByValue("DS");
		
	}
	
	public void creditnumber() {
		Cardno.sendKeys("112233445566");
	}

	public void expirationmn() {
		Expmn.click();
		Select Expyrobj= new Select(Expmn);
		//Expyrobj.selectByValue("04");	
		Expyrobj.selectByIndex(5);
	}
	
	
	public void expirationyr() {
		Expyr.click();
		Select Expmnrobj= new Select(Expyr);
		Expmnrobj.selectByValue("2010");
	}
	
	public void cardname() {
		cardfname.sendKeys("Sachin");
		cardmname.sendKeys("Ramesh");
		cardlname.sendKeys("Tendulkar");
		
		
	}
	
	public void checkbox() {
		ticketLess.click();
			
	}
	
	public void securepyrchase() {
		securepurchase.click();
			
	}
	
	
}

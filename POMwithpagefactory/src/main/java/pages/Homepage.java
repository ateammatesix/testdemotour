package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class Homepage {
	


	WebDriver driver;

	
@FindBy(name="userName")
WebElement username;

@FindBy(name="password")
WebElement password;

@FindBy(name="login")
WebElement signin;

@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[4]/a")
WebElement Contact;

@FindBy(xpath="/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")
WebElement signonpage;


public Homepage(WebDriver driver){

    this.driver = driver;

    //This initElements method will create all WebElements

    PageFactory.initElements(driver, this);
}


//public void uname(String u) {
//	username.sendKeys(u);
//	}
//public void pass(String p)
//{
//password.sendKeys(p);
//
//}
//
//public void signinclick() {
//	signin.click();
//	
//}

public Loginedpage logintodemo(String u,String p){

	//Loginedpage login = null;

    //this.uname(u);
	//uname(u);
	username.sendKeys(u);


   // this.pass(p);
	password.sendKeys(p);


    //this.signinclick();
	signin.click();
	return new Loginedpage(driver);

}         

public Contactpage Contact() {
	
	Contact.click();
	
	return new Contactpage(driver);
	
	
	
}


public Mercurysignon signon() {
	
	signonpage.click();
	
	return new Mercurysignon(driver);
	
	
	
}
/*public void anytimelogin() {
	
	driver.get("http://newtours.demoaut.com/");
	driver.manage().window().maximize();
	
WebElement a=driver.findElement(By.xpath("//input[@name=\"userName\"]"));
			a.sendKeys("nino070");
			WebElement b=driver.findElement(By.xpath("//*[contains(@name,'password')]"));
	b.sendKeys("parayil007");
	WebElement c=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input"));
	c.click();
	*/
}



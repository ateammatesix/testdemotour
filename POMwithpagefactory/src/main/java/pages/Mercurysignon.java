package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mercurysignon {
	WebDriver driver;
	
	@FindBy(name="login")
	WebElement submitclick;
	
	@FindBy(name="userName")
	WebElement userNameclick;
	
	@FindBy(xpath="/html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/a")
	WebElement homehover;
	
	public void submitclick() {
		
		Actions action = new Actions(driver);
		//action.moveToElement(submitclick).doubleClick().build().perform();
		action.moveToElement(homehover).build().perform();
		driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a")).click();
		 
    }
		//action.moveToElement(submitclick).dragAndDrop(submitclick, userNameclick).build().perform(); 
		//doubleClick().build().perform();

		
	
	
	public Mercurysignon(WebDriver driver) {
		this.driver = driver;

	    //This initElements method will create all WebElements

	    PageFactory.initElements(driver, this);
		
		
	}

	

}

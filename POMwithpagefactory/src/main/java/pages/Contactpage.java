package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactpage {
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td")
	WebElement contactcolor;
	
	
	public Contactpage(WebDriver driver) {
		this.driver = driver;

	    //This initElements method will create all WebElements

	    PageFactory.initElements(driver, this);
		
		
	}
	
	public String colortest() {
		 String color =contactcolor.getCssValue("background-color").trim();    
		 System.out.println("RGB_Color: " + color);
		 
		 return color;
	}
	
}

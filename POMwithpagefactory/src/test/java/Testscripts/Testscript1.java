package Testscripts;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.Contactpage;
import pages.Homepage;
import pages.Loginedpage;
import pages.Mercurysignon;
import pages.mercurypurchase;
import pages.mercurypurchase2;
import pages.mercuryreservation2;

public class Testscript1 extends Testhelper {
	
	//Homepage objLogin;
	//WebDriver driver;
	
	//@Test(priority=1)
	@Parameters({"username","password"})
	public void Parameterized(String u,String p) throws InterruptedException{
		
		//browsers("Chrome");
		

	//driver.get("http://newtours.demoaut.com/");
		
		
		Homepage objLogin = new Homepage(driver);	
	    Loginedpage log=objLogin.logintodemo(u,p);
	    log.VerifyLogin();
	    //log.Radiooperation();
	    //Loginedpage login= new Loginedpage();
        Thread.sleep(3000);

        //log.signoutmethod();
	
	    		}
	
	//@Test(priority=2)
	@Parameters({"username","password"})
	public void signoff_click(String u,String p) {
		Homepage objLogin = new Homepage(driver);	
	    Loginedpage log=objLogin.logintodemo(u,p);
	    
		//Loginedpage l=new Loginedpage(driver);
		log.signoutmethod();
		
	}
	  
	//@Test(priority=3)
	@Parameters({"username","password"})
	public void datafill(String u,String p) throws InterruptedException {
		Homepage objLogin = new Homepage(driver);	
	    Loginedpage log=objLogin.logintodemo(u,p);	
		//Loginedpage l=new Loginedpage(driver);
	log.Radiooperation();
	Thread.sleep(3000);	
	log.passangersoperation();
	log.Departingoperation();
	log.date();
	log.findflightsclick();
	String expectedturl="http://newtours.demoaut.com/mercuryreservation2.php";
	mercuryreservation2 mercury = new mercuryreservation2(driver);
	//mercury.webturl();
	String actualurl=mercury.webturl();
    Assert.assertEquals(actualurl,expectedturl);
    {
    
    	System.out.println("logintest of nithin b john case passed"+expectedturl);
    }
    mercury.mercuryradio1();
    Thread.sleep(1000);	
    mercury.secondcontinue();
	}
	
	
	//@Test(priority=4)
	@Parameters({"username","password"})
	public void bookaflight(String u,String p) throws InterruptedException {
		Homepage objLogin = new Homepage(driver);	
	    Loginedpage log=objLogin.logintodemo(u,p);	
	    log.findflightsclick();
	    mercuryreservation2 mercury = new mercuryreservation2(driver);
	    mercury.secondcontinue();
	    String  expectedturl="http://newtours.demoaut.com/mercurypurchase.php";
	   mercurypurchase purchase= new mercurypurchase(driver);
	    String actualurl=purchase.mercurypurchaseurl();
	    purchase.firstlastname();
	    purchase.meals();
	    purchase.selectcard();
	    purchase.creditnumber();
        purchase.expirationmn();
        Thread.sleep(2000);
        purchase.expirationyr();
	    purchase.cardname();
	    Thread.sleep(2000);
	    purchase.checkbox();
	    Thread.sleep(2000);
	    purchase.securepyrchase();
	    Thread.sleep(2000);
	    Assert.assertEquals(actualurl,expectedturl);
	    {
	    
	    	System.out.println("logintest o fmercurypurchase passed"+expectedturl);
	    	}
	    
	    
	    
	
	
	}
	
	//@Test(priority=5)
	@Parameters({"username","password"})
	public void totalcount(String u,String p) throws InterruptedException {
		Homepage objLogin = new Homepage(driver);	
	    Loginedpage log=objLogin.logintodemo(u,p);	
	    log.findflightsclick();
	    mercuryreservation2 mercury = new mercuryreservation2(driver);
	    mercury.secondcontinue();
	    String  expectedturl="http://newtours.demoaut.com/mercurypurchase.php";
	   mercurypurchase purchase= new mercurypurchase(driver);
	    String actualurl=purchase.mercurypurchaseurl();
	    purchase.firstlastname();
	    purchase.meals();
	    purchase.selectcard();
	    purchase.creditnumber();
        purchase.expirationmn();
        Thread.sleep(2000);
        purchase.expirationyr();
	    purchase.cardname();
	    Thread.sleep(2000);
	    purchase.checkbox();
	    Thread.sleep(2000);
	    purchase.securepyrchase();
	    Thread.sleep(2000);
	    String Expectedtotal="$584 USD";
	    mercurypurchase2 total= new mercurypurchase2(driver);
	    String actualtotal=total.gettotal();	    
	    Assert.assertEquals(actualtotal,Expectedtotal);
	    {
	    
	    	System.out.println("total rupees required is "+Expectedtotal);
	    	}
	    
	    
	    total.logoutaction();	
	
	}
	
	  /* @Test
	    public void readtext(String u, String p) throws IOException, InterruptedException {
	    	
	    		FileReader fr=new FileReader("C:\\Users\\Rahul BR\\Desktop\\Homepage.txt");
	    		BufferedReader br= new BufferedReader(fr);
	    		String x="";
	    		while ((x=br.readLine()) != null)
	    		{
	    		System.out.println(x);
	    		}
	    		br.close();
	    		}*/

	    
	    
  	//@Test(dataProvider="getData")
	    	public void setData(String username, String password) throws InterruptedException
	    	{
	    	String expectedtille="Find a Flight: Mercury Tours:";	
	    	Homepage objLogin = new Homepage(driver);
	    	Loginedpage log=objLogin.logintodemo(username,password);
		    log.VerifyLogin();	
		    String actualtitle=log.webtitle();
		    Assert.assertEquals(actualtitle,expectedtille);
		    
		    
	    	System.out.println("logintest case passed"+expectedtille);
		    
		    {
			    
   		System.out.println("you have provided username as::"+username);
   		System.out.println("you have provided password as::"+password);
	    	}
		    Thread.sleep(5000);
		    log.radio2test();
		    Thread.sleep(5000);
			//log.Radiooperation();
			
	    	}
  	
	    	
	    	//@Test
	    	public void Colorchecker() throws InterruptedException {
	    		Homepage objLogin = new Homepage(driver);
	    		
	    		objLogin.Contact();
	    		Thread.sleep(5000);
	    		Contactpage objcontact = new Contactpage(driver);
	           
	    		String actaulcolor= objcontact.colortest();
	    		String expectedcolor = "rgba(255, 153, 0, 1)";
	    		 Assert.assertEquals(actaulcolor,expectedcolor);
	    		 {
	    			    
	    		    	System.out.println("Color test  passed"+expectedcolor);
	    		    	}
	    		    
	    		 
	    		 

	    	}
	    	
	    	
	    	
	    	@Test
	    	public void signdoubleclick() {
	    		Homepage objLogin = new Homepage(driver);
	    		objLogin.signon();
	    		Mercurysignon objsignon = new Mercurysignon(driver);
               objsignon.submitclick();
	    		
	    	}
	    	
  	
	    	//radiobutton test
	/*@Parameters({"username","password"})
	    @Test(priority=2)
	    	
	    	public void radiobutton(String u,String p) throws InterruptedException
	    	{
	    		Homepage objLogin = new Homepage(driver);	
	    	    Loginedpage log=objLogin.logintodemo(u,p);
	       	    //log.VerifyLogin();
	              Thread.sleep(5000);
	    		//String l=log.Radiooperation();
	              log.Radiooperation();
	    		//System.out.println("hello radio"+l);
	    		Thread.sleep(5000);
	    		
	    		Testscript1 obj=new Testscript1();
	    		obj.Parameterized(u, p);
	  
	    		
	    		
	    	}*/
	
	/*@Test
	 * 
	public void radiochecker() throws InterruptedException {
		Homepage obj=new Homepage(driver);
		//obj.anytimelogin();
		Loginedpage log=new Loginedpage(driver);
		log.Radiooperation();
	}
	
	        */
	
	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	



			@DataProvider
	    	public Object[][] getData()
	    	{
	    	//Rows - Number of times your test has to be repeated.
	    	//Columns - Number of parameters in test data.
	    	Object[][] data = new Object[3][2];

	    	// 1st row
	    	data[0][0] ="nino070";
	    	data[0][1] = "parayil007";

	    	// 2nd row
	    	data[1][0] ="test5user2";
	    	data[1][1] = "zxcvb";
	    	
	    	// 3rd row
	    	data[2][0] ="nino070q";
	    	data[2][1] = "parayil007q";

	    	return data;
	    	}
	    	
	   
			
}
		





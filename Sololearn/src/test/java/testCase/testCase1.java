package testCase;

import pages.LoginPage;
import pages.MyAccountPage;
import testBase.WebTestBase;

import java.util.Set;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.Test;
public class testCase1 extends WebTestBase {
	LoginPage loginPage;
	MyAccountPage myaccountpage;
	
	public testCase1()
	{
        super();
    }
	@BeforeMethod
	public void BeforeMethod()
	{
		//Loading the driver file and establishing the connection ,loading the url
	     initialization();
		
	 
     loginPage = new LoginPage(); 
     myaccountpage = new MyAccountPage();
 }
	
    @Test (priority = 1)
	
	public  void logintest()
	{
		SoftAssert softAssert = new SoftAssert();
		
		loginPage.login(prop.getProperty("mobile"),prop.getProperty("password"));
	    loginPage.signIn();
	    softAssert.assertAll();
	}
	@Test (priority = 2)
	public void scrollDown() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,5000)");
	}
	@Test (priority = 3)
public void scrollUp() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4000)");
		js.executeScript("window.scrollBy(0,-800)");
		
	}
	@Test(priority = 4)
	public void checkScrolling() throws InterruptedException {
		SoftAssert softAssert = new SoftAssert();
		myaccountpage.scrollUpDown();
		  softAssert.assertAll();
	}
	@Test(priority = 5)
	public static void getCookies(){
      Set<Cookie> cookies = driver.manage().getCookies();
      for (Cookie c : cookies){
          System.out.println(c);
      }
      
  }
	@Test(priority = 6)
	public void verifyGetWindowhandle() throws InterruptedException {
		SoftAssert softAssert = new SoftAssert();
	     myaccountpage.verifyGetWindowhandle();
	     softAssert.assertAll();
	}

  @AfterMethod
public void afterMethod(){
    driver.close();
  }
  
}

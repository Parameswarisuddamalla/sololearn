package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;

public class LoginPage extends WebTestBase {
	
	@FindBy(id ="email")
	WebElement username;
	
	@FindBy(id ="password")
	WebElement passwords;
	 
	@FindBy(xpath ="//*[text()='Sign in']")
	WebElement signIn;
	
	public LoginPage(){
        PageFactory.initElements(driver, this);
    }
	
	public void login(String mobile, String password){
        username.sendKeys(mobile);
        passwords.sendKeys(password);	        
        signIn.click();
      
	}

	public void signIn() {
		// TODO Auto-generated method stub
		
	}

	

     
		
	}
                
    
	
	
	
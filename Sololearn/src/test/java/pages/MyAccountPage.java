package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;
import utils.Utility;

public class MyAccountPage extends WebTestBase {
	 
	
	@FindBy(xpath = "//a[text()='Introduction to JavaScript']")
	WebElement create; 
	//@FindBy(xpath = "//*[@id=\"main\"]/div/footer/div[2]/div/div[1]/a[5]")
@FindBy(linkText ="Watch our youtube")
	WebElement youtubeOption;
	public MyAccountPage(){
        PageFactory.initElements(driver, this);
    }
	
	public void verifyGetWindowhandle() throws InterruptedException {
		
		Utility.scrollDownByElement(driver,youtubeOption);
		youtubeOption.click();
		Utility.switchToWindows(driver);
}

	
	public void createaccount() {
		create.click();
	}

	public void scrollUpDown() throws InterruptedException {
		
		Utility.scrollPage(driver);
	}
	
}

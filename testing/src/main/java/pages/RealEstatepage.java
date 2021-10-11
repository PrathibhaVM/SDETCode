package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RealEstatepage {

	public WebDriver wd;
	public RealEstatepage(WebDriver wd) {
		this.wd = wd;
		PageFactory.initElements(this.wd, this);
	}

	@FindBy (className ="sign-in")
	WebElement registerorLogin ;
	
	public void clickonRegisterButton() throws InterruptedException
	{
		registerorLogin.click();
		    Thread.sleep(2000);
	}

}

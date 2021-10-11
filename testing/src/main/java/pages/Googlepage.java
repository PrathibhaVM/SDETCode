package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Googlepage {
	
	public WebDriver wd;
	public Googlepage(WebDriver wd) {
	this.wd = wd;
	PageFactory.initElements(this.wd, this);
	}
	
	@FindBy (xpath="")
	WebElement googlesearchbox ;
	
	public void enterGoogleSeacrh() throws InterruptedException
	{
		 //wd.findElement(By.name(googleseacrhbox)).sendKeys("SELEnium");
		//wd.findElement(bygooglesearchbox).sendKeys("SELEnium");
		googlesearchbox.sendKeys("text");
		    Thread.sleep(2000);
	}

}

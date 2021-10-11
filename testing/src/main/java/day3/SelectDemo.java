package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.out.println("Hello selenium");
		    //1.specify your webdriver path
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\PrathibhaMahadevappa\\Downloads\\Workspace_08-10\\EShopTests\\target\\test-classes\\browsers\\chromedriver.exe");
		 WebDriver wd=new ChromeDriver();
		 wd.manage().window().maximize();
		 Thread.sleep(2000);
		 //Navigating to URL
    wd.get("https://artoftesting.com/samplesiteforselenium");
    Thread.sleep(2000);
    WebElement selectDD = wd.findElement(By.id("testingDropdown"));
    Select sel=new Select(selectDD);
   // sel.selectByIndex(1); // Selects performance testing
    sel.selectByValue("Manual");
    sel.selectByVisibleText("Database Testing");
    List<WebElement> ddlist = sel.getOptions();
    for(WebElement we: ddlist) {
    	System.out.println("text = "+we.getText());
    	System.out.println("value = "+we.getAttribute("value"));
    }
    System.out.println("test pass");
    wd.close();
}}

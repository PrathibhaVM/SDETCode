package selenium.testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionDemo {
	public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PrathibhaMahadevappa\\Downloads\\Workspace_08-10\\EShopTests\\target\\test-classes\\browsers\\chromedriver.exe");
	 WebDriver wd=new ChromeDriver();
	 wd.manage().window().maximize();
	 Thread.sleep(2000);
wd.get("https://www.google.com/");
Thread.sleep(2000);
WebElement inputSerachBox = wd.findElement(By.name("q"));
    Actions action=new Actions(wd);
    action.keyDown(inputSerachBox,Keys.SHIFT);
    action.sendKeys(inputSerachBox, "selenium");
    Thread.sleep(1000);
    action.keyUp(inputSerachBox,Keys.SHIFT);
    action.build().perform();
    System.out.println("End");
    Thread.sleep(1000);
    Robot rbt = new Robot();
    rbt.keyPress(KeyEvent.VK_BACK_SPACE);
    Thread.sleep(1000);
wd.quit();
System.out.println("selenium Closed");
} }

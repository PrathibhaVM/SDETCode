package jenkinProject;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationLogger {

	public static void main(String[] args) throws InterruptedException {
		PropertyConfigurator.configure("C:\\Users\\PrathibhaMahadevappa\\Desktop\\SDET\\SDETCode\\testing\\src\\log4j.properties");
		Logger log = Logger.getLogger("devpinoyLogger");
		log.info("Hello Selenium");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PrathibhaMahadevappa\\Downloads\\Workspace_08-10\\EShopTests\\target\\test-classes\\browsers\\chromedriver.exe");
		 WebDriver wd=new ChromeDriver();
		 wd.manage().window().maximize();
		 Thread.sleep(2000);
    wd.get("https://www.google.com/");
    Thread.sleep(2000);
    WebElement inputSerachBox = wd.findElement(By.name("q"));
	inputSerachBox.sendKeys("SELEnium");
      wd.quit();
      log.debug("Hello selenium Closed");
}}

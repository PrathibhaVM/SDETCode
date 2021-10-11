package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Googlepage;
import steps.GoogleSteps;

public class StepDefGoogle extends GoogleSteps {
	
	
	public StepDefGoogle(WebDriver wd) {
		super(wd);
		// TODO Auto-generated constructor stub
	}

	@Given("^Navigate to Google Search Application$")
	public void navigate_to_Google_Search_Application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Navigate to Google Search Application");
				 System.setProperty("webdriver.chrome.driver", "C:\\Users\\PrathibhaMahadevappa\\Downloads\\Workspace_08-10\\EShopTests\\target\\test-classes\\browsers\\chromedriver.exe");
				 WebDriver wd=new ChromeDriver();
				 Googlepage googlepage= new Googlepage(wd);
				 wd.manage().window().maximize();
				 Thread.sleep(2000);
				 wd.get("https://www.google.com/");
				    Thread.sleep(2000);
				    googlepage.enterGoogleSeacrh();
				 //   wd.findElement(By.name("q")).sendKeys("SELEnium");
				  //  Thread.sleep(2000);
				    wd.findElement(By.name("btnK")).click(); // click the result
				    Thread.sleep(2000); 
				    wd.close();
	}

	@When("^I enter the search keyword$")
	public void i_enter_the_search_keyword() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("I enter the search keyword");
	}

	@Then("^Click on First Search Result$")
	public void click_on_First_Search_Result() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on First Search Result");
	}

	@Then("^Close Browser$")
	public void close_Browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Close Browser");
	}


}

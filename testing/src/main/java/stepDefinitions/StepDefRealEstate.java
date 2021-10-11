package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.RealEstatepage;

public class StepDefRealEstate  {

	//public StepDefRealEstate(WebDriver wd) {
	//	super(wd);}
	
	RealEstatepage  realEstatepage;
	
	@Given("^Navigate to the Real Estate Application1$")
	public void navigate_to_the_Real_Estate_Application() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\PrathibhaMahadevappa\\Downloads\\Workspace_08-10\\EShopTests\\target\\test-classes\\browsers\\chromedriver.exe");
		 WebDriver wd=new ChromeDriver();
		//RealEstatepage re = new RealEstatepage(wd);
		 wd.manage().window().maximize();
		 //Thread.sleep(1000);
		 wd.get("http://realty-real-estatem1.upskills.in/");
		 Thread.sleep(2000);
	}

	@Given("^I click on Register/LOGIN button1$")
	public void i_click_on_Register_LOGIN_button() throws Throwable {
	 //  wd.findElement(By.className("sign-in")).click();
		realEstatepage.clickonRegisterButton();
	   Thread.sleep(1000);
	}

	@Given("^I click on Register button1$")
	public void i_click_on_Register_button() throws Throwable {
		// wd.findElement(By.xpath("//a[text()='Register']")).click();
		   Thread.sleep(1000);
	    
	}

	/*
	 * @When("^I enter \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" on Register page$")
	 * public void i_enter_and_on_Register_page(String emailID, String firstName,
	 * String lastName) throws Throwable {
	 * wd.findElement(By.id("email")).sendKeys(emailID);
	 * wd.findElement(By.id("first-name")).sendKeys(firstName);
	 * wd.findElement(By.id("last-name")).sendKeys(lastName); }
	 */

	@Then("^I validate confirmation message1$")
	public void i_valdidate_confirmation_message() throws Throwable {
	    
	}

	@When("^I enter manzoor@gmail\\.com manzoor on Register page1$")
	public void i_enter_manzoor_gmail_com_manzoor() throws Throwable {
	    
	}

	@When("^I click on Sign In button1$")
	public void i_click_on_Sign_In_button() throws Throwable {
	    
	}

	@Then("^I valdidate displayed Profile Page1$")
	public void i_valdidate_displayed_Profile_Page() throws Throwable {
	    
	}

	@When("^I click on Lost Your Password link1$")
	public void i_click_on_Lost_Your_Password_link() throws Throwable {
	    
	}

	@Then("^I enter manzoor@gmail\\.com on Register page1$")
	public void i_enter_manzoor_gmail_com() throws Throwable {
	    
	}

	@Then("^I click on Reset Password button1$")
	public void i_click_on_Reset_Password_button() throws Throwable {
	    
	}


}


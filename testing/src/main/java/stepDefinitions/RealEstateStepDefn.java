package stepDefinitions;

//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.RealEstatepage;

public class RealEstateStepDefn {

	 public static WebDriver driver ;
	
	
	@Given("^Navigate to the Real Estate Application$")
	public void navigate_to_the_Real_Estate_Application() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\PrathibhaMahadevappa\\Downloads\\Workspace_08-10\\EShopTests\\target\\test-classes\\browsers\\chromedriver.exe");
	     driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://realty-real-estatem1.upskills.in/");
		 Thread.sleep(2000);
	}

	@Given("^I click on Register/LOGIN button$")
	public void i_click_on_Register_LOGIN_button() throws Throwable {
	   driver.findElement(By.className("sign-in")).click();
	   Thread.sleep(1000);
	}

	@Given("^I click on Register button$")
	public void i_click_on_Register_button() throws Throwable {
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		   Thread.sleep(1000);
	    
	}

	
	  @When("^I enter \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\" on Register page$"
	  ) public void i_enter_and_on_Register_page(String emailID, String firstName,String lastName) throws Throwable {
	  driver.findElement(By.id("email")).sendKeys(emailID);
	  driver.findElement(By.id("first-name")).sendKeys(firstName);
	  driver.findElement(By.id("last-name")).sendKeys(lastName); }
	 
	@Then("^I validate confirmation message$")
	public void i_valdidate_confirmation_message() throws Throwable {
	boolean b = driver.findElement(By.xpath(" //p[contains(text (), 'Note: Your password will be generated automatically and sent to your email address.')]")).isDisplayed();
	if(b)
	{
		System.out.println("Account Registered succesfully");
	}
	else
	{System.out.println("Registration fails");}
	}
	
	@Then("^I close the browser$")
	public void i_close_the_browser() throws Throwable {
	    driver.close();
		System.out.println("Closed Browser");
	}

	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\" on Register page$")
	public void i_enter_and_on_register_page(String userName, String password) throws Throwable {
		driver.findElement(By.id("user_login")).sendKeys(userName);
		  driver.findElement(By.id("user_pass")).sendKeys(password);
	}

	@When("^I click on Sign In button$")
	public void i_click_on_Sign_In_button() throws Throwable {
	    driver.findElement(By.name("login")).click();
	    Thread.sleep(5000);
	}

	@Then("^I valdidate displayed Profile Page$")
	public void i_valdidate_displayed_Profile_Page() throws Throwable {
		boolean b = driver.findElement(By.xpath(" //span[text()='Bhavana samudrala']")).isDisplayed();
		if(b)
		{
			System.out.println("Validated profile");
		}
		else
		{System.out.println("Profile validation fails");}
		
	}

	@When("^I click on Lost Your Password link$")
	public void i_click_on_Lost_Your_Password_link() throws Throwable {
		Thread.sleep(500);
	    driver.findElement(By.xpath("//a[text()=' Lost Your Password?']")).click();
	}

	@Then("^I enter \"([^\"]*)\" on Register page$")
	public void i_enter_manzoor_gmail_com(String emailID) throws Throwable {
	    driver.findElement(By.id("user_login")).sendKeys(emailID);
	}

	@Then("^I click on Reset Password button$")
	public void i_click_on_Reset_Password_button() throws Throwable {
	    driver.findElement(By.className("lostpassword-button")).click();
	}

	@Then("^I valdidate confirmation message$")
	public void i_validate_confirmation_message()throws Throwable {
		boolean b = driver.findElement(By.xpath("//p[text()='The email could not be sent.']")).isDisplayed();
		if(b)
		{
			System.out.println("Validated confirmation message");
		}
		else
		{System.out.println(" validation fails");}
	}
}

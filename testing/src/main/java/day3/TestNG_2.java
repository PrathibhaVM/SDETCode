package day3;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_2 {
   @Test(priority=2)
	public void testMethod1(){
		System.out.println("Inside my testNG method 1");}
   
	 @Test 
	 public void testMethod2() {
	  System.out.println("Inside my testNG method 2"); }
	  
	  @Test (priority=-2)
	  public void testMethod3() {
	  System.out.println("Inside my testNG method 3"); }
	  @Test
	  public void m2() {
		  System.out.println("Inside my testNG method m2"); }
	  @Test
	  public void m11() {
		  System.out.println("Inside my testNG method m11"); }
}

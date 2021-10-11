package day3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_1 {
   @Test
	public void testMethod1()
	{
		System.out.println("Inside my testNG method 1");
	}
	 @Test 
	 public void testMethod2() {
	  System.out.println("Inside my testNG method 2"); }
	  
	  @Test 
	  public void testMethod3() {
	  System.out.println("Inside my testNG method 3"); }
	 
	 
   @BeforeSuite
   public void beforesuite()
   { System.out.println(" Inside before suite");}
   @AfterSuite
   public void aftersuite()
   { System.out.println(" Inside after suite");}
   @BeforeClass
   public void beforeclass()
   {System.out.println("before class");}
   @AfterClass
   public void afterclass()
   {System.out.println("after class");}
   @AfterTest
   public void aftertest()
   {System.out.println("after test");}
   @AfterMethod
   public void aftermethod()
   {System.out.println("after method");}
   @BeforeMethod
   public void beforemethod()
   {System.out.println("before method");}
   @BeforeTest
   public void beforetest()
   {System.out.println("before test");}
   @BeforeSuite
   public void beforesuite1()
   { System.out.println(" Inside before suite 1");}
}

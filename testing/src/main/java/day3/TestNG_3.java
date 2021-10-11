package day3;

import org.testng.annotations.Test;

import generic.Generic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_3 extends Generic {
   @Test(dependsOnMethods="testMethod3")
	public void testMethod1(){
		System.out.println("Inside my testNG method 1");}
   
	 @Test(priority=2) 
	 public void testMethod2() {
	  System.out.println("Inside my testNG method 2"); }
	 
	  @Parameters({"browser","URL"})
	  @Test
	  public void testMethod3(String br, String url) {
	  System.out.println("Inside my testNG method 3"); 
	  System.out.println("Browser is = " +br);
	  System.out.println("URl is = "+url);}
	  
}

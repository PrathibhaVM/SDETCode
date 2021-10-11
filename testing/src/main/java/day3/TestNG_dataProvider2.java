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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_dataProvider2 extends Generic {
   @Test()
	public void testMethod1(){
		System.out.println("Inside my testNG method 1");}
   
	 @Test() 
	 public void testMethod2() {
	  System.out.println("Inside my testNG method 2"); }
	  
	  @Test(dataProvider="ABC")
	  public void testMethod3(String sValue, int sNum) {
	  System.out.println("parameter value is " +sValue +" parameter number is " +sNum); }
	  
	  @DataProvider(name="ABC")
	  public Object[][] dpmethod(){
		  return new Object[][] {{"First-Value", 1},{"Second-Value", 2}};
	  }
	  
}

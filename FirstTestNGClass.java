package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class FirstTestNGClass {
  @Test
  public void f() 
  {
	 System.out.println("I an in Test Cases");
  }
  
  @Test
  public void Login() 
  {
	 System.out.println("I an in Test Cases");
  }
  
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("I an in beforeMethod Cases");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("I an in afterMethod Cases");
  }

  @BeforeClass
  public void beforeClass()
  {
	  System.out.println("I an in beforeClass Cases");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("I an in afterClass Cases");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("I an in beforeTest Cases");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("I an in afterTest Cases");
  }

  @BeforeSuite
  public void beforeSuite()
  {
	  System.out.println("I an in beforeSuite Cases");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("I an in afterSuite Cases");
  }

}

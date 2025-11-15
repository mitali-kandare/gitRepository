package com.TestNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class PriorityTestNG 
{
  @Test(priority='A')
  public void Login()
  {
	  System.out.println("I am in Login test case");
  }
  
  @Test(priority=1)
  public void Reg()
  {
	  System.out.println("I am in Reg test case");
  }
  
  @Test(priority=3)
  public void Home()
  {
	  System.out.println("I am in Home test case");
  }
  
  @Test(priority=4)
  public void Logout()
  {
	  throw new SkipException("we are working");
	  //System.out.println("I am in Logout test case");
  }
  
}

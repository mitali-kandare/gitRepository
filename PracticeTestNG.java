package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PracticeTestNG {
  WebDriver d=new ChromeDriver();
 
  @Test
  @Parameters({"username","password"})
  public void f(String username,String password) throws InterruptedException 
  {
	  JavascriptExecutor js=(JavascriptExecutor) d;
	  js.executeScript("window.scrollBy(0,560)");
	  
	  Thread.sleep(2000);  
	  WebElement we=d.findElement(By.xpath("//input[@name='username']"));
	  we.click();
	  we.sendKeys(username);
	  
	  WebElement we2=d.findElement(By.xpath("//input[@name='password']"));
	  Thread.sleep(2000);
	  we2.click();
	  we2.sendKeys(password);
	  
	  Thread.sleep(2000);
	  WebElement we3=d.findElement(By.xpath("//button[@type='submit']"));
	  we3.click();
	  
  }
  
  @BeforeMethod
  public void beforeMethod()
  {
	  d.get("https://practice.expandtesting.com/login");
  }
  
  @AfterMethod
  public void afterMethod() throws InterruptedException
  {
	  Thread.sleep(4000);
	  WebElement we4=d.findElement(By.xpath("//a[@href='/logout']"));
	  Thread.sleep(2000);
	  we4.click();
  }
}

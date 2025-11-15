package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest 
{
  WebDriver b=new ChromeDriver();
  
  @Test
  public void f() throws InterruptedException
  {
	  Thread.sleep(1000);
	  WebElement we= b.findElement(By.xpath("//input[@name='username']"));
	  WebElement we1=b.findElement(By.xpath("//input[@name='password']"));
	  WebElement we2=b.findElement(By.xpath("//button[@type='submit']"));
	  we.click();
	  we.sendKeys("Admin");
	  we1.click();
	  we1.sendKeys("admin123");	  
	  we2.click();
  }
  
  @BeforeTest
  public void beforeTest() 
  {
	  b.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }

  @AfterTest
  public void afterTest() throws InterruptedException
  {
	  Thread.sleep(5000);
	  b.close();
  }

}

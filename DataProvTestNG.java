package com.TestNG;

import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataProvTestNG
{
  @Test(dataProvider = "dp")
  public void f(String n, String s)
  {
	  WebDriver d=new ChromeDriver();
	  d.get("https://practicetestautomation.com/practice-test-login/");
	  d.manage().window().maximize();
	  
	  d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  List<WebElement> e1=d.findElements(By.tagName("a"));
	  d.findElement(By.id("username")).sendKeys(n);
	  d.findElement(By.id("password")).sendKeys(s);
	  d.findElement(By.id("submit")).click();
	  System.out.println("the numebr of the textBox : "+e1.size());
	  for(WebElement e:e1)
	  {
		  System.out.println(e.getText());
	  }
  }

  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] 
    {
      new Object[] { "student", "xyz" },
      new Object[] { "student", "Password123" },
    };
  }
}

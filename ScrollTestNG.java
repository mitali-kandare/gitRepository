package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollTestNG {
  @Test
  public void f() throws InterruptedException 
  {
	  WebDriver d=new ChromeDriver();
	  d.get("https://practicetestautomation.com/practice-test-login");
	  JavascriptExecutor js=(JavascriptExecutor) d;
	  Thread.sleep(3000);
	  js.executeScript("window.scrollBy(0,560)");
	  Thread.sleep(3000);
	  js.executeScript("window.scrollBy(0,-380)");
	  
	  
	  Thread.sleep(2000);
	  WebElement we=d.findElement(By.xpath("//a[@href='https://practicetestautomation.com/privacy-policy/']"));
//	  js.executeScript("arguments[0].scrollIntoView(true);",we);
	  we.click();
	  Thread.sleep(3000);
	  
  }
}

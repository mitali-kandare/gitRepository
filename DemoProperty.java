package com.TestNG;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoProperty {
  @Test
  public void f() throws IOException
  {
	  WebDriver d=new ChromeDriver();
	  d.manage().window().maximize();
	  Properties p=new Properties();
	  FileReader fr=new FileReader("C:\\Users\\CDAC\\Downloads\\SDM_TestNG\\TestNGProject\\src\\input.properties");
	  p.load(fr);
	  d.get(p.getProperty("url"));
  }
}

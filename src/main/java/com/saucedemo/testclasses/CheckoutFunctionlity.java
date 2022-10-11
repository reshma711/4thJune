package com.saucedemo.testclasses;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.saucedemo.pomclasses.HomePomClass;
import com.saucedemo.pomclasses.LoginPomClass;

public class CheckoutFunctionlity extends TESTBASEClASS{
	
			
		@Test
		public void CheckoutFunctionality() throws IOException {
	
		HomePomClass y=new HomePomClass(driver);
         y.method7();
		
	
   String expecturl="https://www.saucedemo.com/cart.html";
   String actualurl=driver.getCurrentUrl();
   System.out.println(actualurl);
  Assert.assertEquals(actualurl, expecturl);
		   
   
   
		}

















	}


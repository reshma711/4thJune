package com.saucedemo.testclasses;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

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

public class AddToCart extends TESTBASEClASS {
	

	@Test(priority=1)
	public void AddToCart() throws IOException {
	HomePomClass x=new HomePomClass(driver);
    x.method4();
	x.method5();
	x.method6();
	x.basket();
	log.info("click on addtocart");
	
	 String expecturl="https://www.saucedemo.com/inventory-item.html?id=0";
     String actual=driver.getCurrentUrl();
     System.out.println(actual);
     
   Assert.assertEquals(actual, expecturl);
    


 String actual2=x.basket();
   System.out.println(actual2);
   String expectproduct="2";
   Assert.assertEquals(actual2, expectproduct);

   
 
   







}







}

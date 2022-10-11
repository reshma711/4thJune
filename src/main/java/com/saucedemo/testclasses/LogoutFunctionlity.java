package com.saucedemo.testclasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.saucedemo.pomclasses.LOGOUTpomclass;
import com.saucedemo.pomclasses.LoginPomClass;

public class LogoutFunctionlity extends TESTBASEClASS {

	
	@Test(priority=1)
	public void LogoutFunctionlity() {	
		LOGOUTpomclass y=new LOGOUTpomclass(driver);
		y.method1();
		y.method2();
		  log.info("logout is successful");
	

	  String expecturl="https://www.saucedemo.com/";
	String actualurl=driver.getCurrentUrl();
	  System.out.println(actualurl);
	  
	 Assert.assertEquals(actualurl, expecturl);
	}
	
	










}








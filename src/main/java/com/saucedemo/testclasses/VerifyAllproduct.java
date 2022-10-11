package com.saucedemo.testclasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.saucedemo.pomclasses.HomePomClass;
import com.saucedemo.pomclasses.LoginPomClass;

public class VerifyAllproduct extends TESTBASEClASS{
	
		
		@Test(priority=2)
		public void VerifyAllproduct() {
			HomePomClass x=new HomePomClass(driver);
			 x.allproduct();
			 log.info("click on all product");
			 
        String actual= x.basket();
       String expect="6";
      Assert.assertEquals(expect, actual);

	}
		
	
}

package com.saucedemo.testclasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.saucedemo.pomclasses.HomePomClass;
import com.saucedemo.pomclasses.LoginPomClass;

public class VerifyFilter extends TESTBASEClASS {
	

	@Test
	public void VerifyFilter()
	{
	HomePomClass x=new HomePomClass(driver);
    x.method8();
   
    WebElement drop=driver.findElement(By.xpath("//option[text()='Price (high to low)']"));
    
   String expect="Price (high to low)";
String actual=drop.getText();
    Assert.assertEquals(actual, expect);
    
    log.info("verification of filter");
    
//   x.Tshirt();

//
//    String Expect="https://www.saucedemo.com/inventory-item.html?id=3";
//    String Actual=driver.getCurrentUrl();
//    System.out.println(actual);
//    Assert.assertEquals(actual, expect);










}




}

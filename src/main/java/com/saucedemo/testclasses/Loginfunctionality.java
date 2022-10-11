package com.saucedemo.testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.pomclasses.LOGOUTpomclass;

public class Loginfunctionality extends TESTBASEClASS {



	@Test(priority=1)
	public void LoginFunctionality()
	{
	   String expecttitle="Swag Labs";
	   
	   String actualtitle= driver.getTitle();
	   System.out.println(actualtitle);
	   Assert.assertEquals(expecttitle,actualtitle);
	   log.info("apply validation");
	   
	   
	}



	@Test(priority=0)
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

package com.saucedemo.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPomClass {

	WebDriver driver;
	
	@FindBy(xpath="//input[@id='user-name']")
	  WebElement username;
	public  void method1()
	{
		username.sendKeys("standard_user");
	}
	
	@FindBy(xpath="//input[@id='password']")
	 WebElement password;
	 public  void method2()
	{
		password.sendKeys("secret_sauce");
	}
	
	@FindBy(xpath="//input[@type='submit']")
	 WebElement login;
	  public void method3()
	{
		login.click();
	}
	public LoginPomClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
















}

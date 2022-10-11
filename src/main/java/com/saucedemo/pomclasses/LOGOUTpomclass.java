	package com.saucedemo.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LOGOUTpomclass {
   WebDriver driver;
   @FindBy(xpath="//button[@id='react-burger-menu-btn']")
   WebElement menu;
   public void method1()
   {
	   menu.click();
   }
   
   @FindBy(xpath="//a[@id='logout_sidebar_link']")
   WebElement logout;
   public void method2()
   {
	   logout.click();
   }
   public LOGOUTpomclass(WebDriver driver)
   {
	   this.driver=driver;
	   PageFactory.initElements(driver,this);
   }











}

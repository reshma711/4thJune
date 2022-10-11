package com.saucedemo.pomclasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePomClass {
private	WebDriver driver;
   private	Actions act;
	private Select s;
	

  @FindBy(xpath="(//button[text()='Add to cart'])[1]")
  WebElement addcart1;

   public void method4()
  {
	addcart1.click();
  }
   

   @FindBy(xpath="(//button[text()='Add to cart'])[2]")
   WebElement addcart2;

    public void method5()
   {
 	addcart2.click();
   }
    @FindBy(xpath="//img[@alt='Sauce Labs Bike Light']")
    WebElement product;
    
   public void method6()
   {
	   product.click();
   }
  @FindBy(xpath= "//a[@class='shopping_cart_link']")
   WebElement check;
  public void method7()
  {
	  check.click();
  }
  
  @FindBy(xpath="//select[@class='product_sort_container']")
  WebElement dropdown;
  public void method8()
  {
	  dropdown.click();
	  s.selectByValue("hilo");
	 
	 
	 }
  
  @FindBy(xpath="//img[@alt='Test.allTheThings() T-Shirt (Red)']")
  WebElement Tshirt;
  public void Tshirt()
  {
	 act.click(Tshirt).perform(); 
  }
  
  @FindBy(xpath="//span[@class='shopping_cart_badge']")
  WebElement basket;
  public String basket()
  {
	String a= basket.getText();
	 return a;
  }
  
  
  @FindBy(xpath="//button[text()='Add to cart']")
  private List<WebElement>allproduct;
  public void allproduct()
  {
	 for(WebElement i:allproduct) 
	 {
		i.click(); 
	 }
  }
	 
 
  
  
  
public HomePomClass(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	s=new Select(dropdown);
    act=new Actions(driver);
}






}

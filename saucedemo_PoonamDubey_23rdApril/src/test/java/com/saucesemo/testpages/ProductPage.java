package com.saucesemo.testpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.saucedemo.testcases.BaseClass;

public class ProductPage extends BaseClass{

	public ProductPage(WebDriver driver) {
		
		this.driver= driver;
	}
	
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-backpack\"]") WebElement addtocart;
	
	
	
	public void addtocart()  {
		
		driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
		
		addtocart.click();
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
		System.out.println("wait for 3 seconds" +e.getMessage());
		}
		
		
	}
	
	@FindBy(className="shopping_cart_badge") WebElement shoppingcart;
	
	public void addeditem() {
		
		
		shoppingcart.click();
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {

System.out.println("Wait for 3 seconds:" +e.getMessage());

		}
		
	}
}

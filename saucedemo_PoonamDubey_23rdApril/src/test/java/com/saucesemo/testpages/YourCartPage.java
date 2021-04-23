package com.saucesemo.testpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.saucedemo.testcases.BaseClass;

public class YourCartPage extends BaseClass{
	
	public YourCartPage(WebDriver driver) {
		this.driver= driver;
	}
	
	@FindBy(id="checkout") WebElement checkoutButton;
	
	public void checkout() {
		checkoutButton.click();
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			
			System.out.println("wait for 5 second" +e.getMessage());
		}
				}
	

}


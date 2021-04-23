package com.saucesemo.testpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginHomePage {

	WebDriver driver;
	
	public LoginHomePage(WebDriver driver) {
		
		this.driver= driver;
		
	}
	@FindBy(id="user-name") WebElement username;
			
	@FindBy(id="password") WebElement password;
	
	@FindBy(id="login-button") WebElement loginButton;
	
	public void loginToAccount(String applicationusername, String applicationpassword) {
		
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			
			System.out.println("waiting for 2 seconds"+e.getMessage());
			}
		username.sendKeys(applicationusername);
		password.sendKeys(applicationpassword);
		loginButton.click();
		
	}
}

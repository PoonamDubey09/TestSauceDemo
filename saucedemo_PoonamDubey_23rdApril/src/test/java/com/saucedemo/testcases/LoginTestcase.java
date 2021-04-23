package com.saucedemo.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.saucedemo.utility.BrowserSetup;
import com.saucedemo.utility.ExcelDataProvider;
import com.saucesemo.testpages.LoginHomePage;
import com.saucesemo.testpages.ProductPage;
import com.saucesemo.testpages.YourCartPage;

public class LoginTestcase extends BaseClass{

	
	
	@Test(priority=1)
	
	public void validcredentials() {
		logger= report.createTest("User login to the website");
		
		ExcelDataProvider excel= new ExcelDataProvider();
		
		LoginHomePage loginhomepage= PageFactory.initElements(driver, LoginHomePage.class);
		
		logger.info("Application started");
		
		loginhomepage.loginToAccount(excel.getUserName("Sheet1", 0, 0), excel.getUserPassword("Sheet1", 0, 1));
		
		logger.pass("Login done successfuly");
		
	}
	
	
	@Test(priority=2)
	
	public void addcart() {
		
		logger= report.createTest("user add a Fleece Jacket to kart");
		
		ProductPage productpage= PageFactory.initElements(driver,ProductPage.class );
		
		productpage.addtocart();
		
		logger.info("item adding into kart");

		productpage.addeditem();

		logger.pass("Item added successfuly");
	
	}
	
	@Test(priority=3)
		
		public void checkoutFromAccount() {
		
		logger = report.createTest("user checkout the item");
		
		YourCartPage yourCartPage= PageFactory.initElements(driver, YourCartPage.class);
		
		logger.info("Checking out from account");
		
		yourCartPage.checkout();
		
		logger.pass("User check out successfuly");
	}
	
	}
	
	


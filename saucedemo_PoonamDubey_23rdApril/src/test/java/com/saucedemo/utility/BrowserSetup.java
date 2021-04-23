package com.saucedemo.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BrowserSetup {

	@BeforeTest
	
	public static WebDriver startup(WebDriver driver, String browser, String url) {
		
		if(browser.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			driver= new ChromeDriver();
			
		}
		
		else if(browser.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			
			driver= new FirefoxDriver();
		
		}
		
		else {
			System.out.println("browser not found");
		}
		
		driver.manage().timeouts().pageLoadTimeout(30l, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
		
		return driver;
		
	}

	
	public static WebDriver closeWindow(WebDriver driver) {
		
		driver.close();
		
		System.out.println("close window");
		
		return driver;
	}
	
	
}

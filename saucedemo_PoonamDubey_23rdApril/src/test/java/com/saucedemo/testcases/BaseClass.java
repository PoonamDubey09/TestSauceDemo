package com.saucedemo.testcases;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.saucedemo.utility.BrowserSetup;
import com.saucedemo.utility.ConfigDataProvider;

public class BaseClass {

 public WebDriver driver;
	
 public ConfigDataProvider config;
 
 public ExtentReports report;
 
 public ExtentTest logger;
 
 @BeforeSuite
 
 public void setupBrowser() {
 
 config= new ConfigDataProvider();
 
 ExtentHtmlReporter extent= new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/reports/SauceApp.html"));
 
 report= new ExtentReports();
 report.attachReporter(extent);
 
 }
	@BeforeClass
	
	public void setup() {
	driver= BrowserSetup.startup(driver, config.getBrowser(), config.getURL());
	
	System.out.println(driver.getTitle());
	
	}
	
	@AfterClass
	
	
	public void closewindow() {
		
		BrowserSetup.closeWindow(driver);
		
	}
	
	@AfterMethod
	
	public void tearDownMethod() {
		
		report.flush();
	}
}

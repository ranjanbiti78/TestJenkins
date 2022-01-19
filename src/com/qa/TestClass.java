package com.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestClass {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void initBrowser() {
		System.setProperty("webdriver.chrome.driver", "E://Automation//Test//Driver//chromedriver.exe");
		driver=new ChromeDriver();	
	}
	
	@Test
	public void launchUrl() {
		driver.get("https://www.google.com/");
	}

}

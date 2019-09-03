package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Handle_Broswer_Notification {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.gecko.driver", "E:\\\\Shilpa\\\\Selenium\\\\Selenium Driver\\\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "E:\\\\Shilpa\\\\Selenium\\\\Selenium Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		/*  FirefoxProfile ffprofile = new FirefoxProfile();
		  ffprofile.setPreference("dom.webnotifications.enabled", false); 
		  WebDriver  driver = new FirefoxDriver(ffprofile);   */
		 
		
	/*	ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);      */
		
		driver.get("https://www.jabong.com/");
		
		Thread.sleep(3000);
		
		
		

	}

}

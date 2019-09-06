package com.Selenium;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class IRCTC_Ex {

	public static void main(String[] args) throws Exception {
		
		//handle browser notification alert
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(new FirefoxProfile());
		options.addPreference("dom.webnotifications.enabled", false);
		
		FileReader reader=new FileReader("C:\\Users\\admin\\git\\MyClass\\MyClass\\IRCTC.properties");  
	      
	    Properties p=new Properties();  
	    p.load(reader);
		
		System.setProperty("webdriver.gecko.driver", "E:\\\\Shilpa\\\\Selenium\\\\Selenium Driver\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Enter from location
		WebElement from = driver.findElement(By.xpath("//input[@placeholder='From*']"));
		from.sendKeys(p.getProperty("source"));
		
		//Enter destinametion location
		WebElement to = driver.findElement(By.xpath("//input[@placeholder='To*']"));
		to.sendKeys(p.getProperty("destination"));
		
		//Select jounry date
		WebElement date = driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger ui-calendar-button ng-tns-c14-6 ui-button ui-widget ui-state-default ui-corner-all ui-button-icon-only ng-star-inserted']"));
		date.click();
		
		driver.findElement(By.xpath("//a[contains(text(),'30')]")).click();
		
		//Click on the Find Train button
		WebElement findtrain = driver.findElement(By.xpath("//button[contains(text(),'Find trains')]"));
		findtrain.click();
		
		//Scroll page
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0, 1000)");
		
		//click on the Check availability & fare button
		driver.findElement(By.xpath("//div[@class='container-fluid']//div[5]//div[1]//app-train-avl-enq[1]//div[2]//div[1]//div[3]//div[2]//div[1]//div[1]//button[1]")).click();
		
		//click on Book now button
		driver.findElement(By.xpath("//td[1]//div[1]//div[3]//button[1]")).click();
		
		//Login 
		driver.findElement(By.id("userId")).sendKeys(p.getProperty("username"));
		driver.findElement(By.id("pwd")).sendKeys(p.getProperty("password"));
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[contains(text(),'SIGN IN')]")).click();
		System.out.println("Login!");

	}

}

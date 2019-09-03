package com.Selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon_Ex {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\\\Shilpa\\\\Selenium\\\\Selenium Driver\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//Opened amazon website
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		//Enter search keyword
		WebElement searchKey = driver.findElement(By.name("field-keywords"));
		searchKey.sendKeys("mobile");
		
		//Click on the Search icon
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		
		Thread.sleep(1500);
		
		System.out.println("Search result screen opened");
		
		/*
		  //scroll down the page by  1000 pixel vertical
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,1000)");
		  
        */
		
		//Click on the first search product
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[1]/div/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a")).click();
		
		Thread.sleep(1500);
		
		//Switch to another tab
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		System.out.println("Move to another tab");
		
		Thread.sleep(2000);
		//Click on Add to cart button
		driver.findElement(By.name("submit.add-to-cart")).click();
		
		Thread.sleep(2000);
		
		//Open cart screen
		driver.findElement(By.xpath("//*[@id=\"nav-cart\"]")).click();
		
		System.out.println("Cart screen opened");
		
		Thread.sleep(1500);
		
		//Click on the Proceed to buy button
		driver.findElement(By.xpath("//input[@name='proceedToCheckout']")).click();
		
		Thread.sleep(1000);
		
		//if user is not login then loged In otherwise proceed to next screen
		WebElement email = driver.findElement(By.xpath("//input[@id='ap_email']"));
		email.sendKeys("8619592802");
		
		driver.findElement(By.xpath("//input[@id='continue']")).click(); // click on the Continue button
		
		WebElement password = driver.findElement(By.xpath("//input[@id='ap_password']"));
		password.sendKeys("shilpa@123");
		
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click(); // click on the Login button
		
		System.out.println("Login Successfull!");
		
		Thread.sleep(1500);
		
		//Select delivery address
		driver.findElement(By.xpath("//a[contains(text(),'Deliver to this address')]")).click();
		
		Thread.sleep(1500);
		//Click on the Continue button
		driver.findElement(By.xpath("//div[contains(@class,'a-row a-spacing-medium')]//input[@class='a-button-text']")).click();
		System.out.println("Opened Payment screen");
		
		Thread.sleep(1500);
		
		//choose radio button for payment info
		WebElement radiobutton = driver.findElement(By.linkText("Add Debit/Credit/ATM Card"));
		radiobutton.click();
		//System.out.println(radiobutton.size());
		
		
		
		Thread.sleep(1500);
		
		
		
		//driver.quit();
	}

}

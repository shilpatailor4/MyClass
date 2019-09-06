package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon_Copy {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\\\Shilpa\\\\Selenium\\\\Selenium Driver\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//Opened amazon website
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[3]/div[2]/div[1]/a[2]/span[2]")).click();
		
		WebElement email = driver.findElement(By.xpath("//input[@id='ap_email']"));
		email.sendKeys("8619592802");
		
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click(); // click on the Continue button
		
		WebElement password = driver.findElement(By.xpath("//input[@id='ap_password']"));
		password.sendKeys("shilpa@123");
		
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click(); // click on the Login button
		
		System.out.println("Login Successfull!");
		
		driver.findElement(By.xpath("//span[contains(text(),'Cart')]")).click();
		
		driver.findElement(By.name("proceedToCheckout")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Deliver to this address')]")).click();
		
		driver.findElement(By.xpath("//div[contains(@class,'a-row a-spacing-medium')]//input[@class='a-button-text']")).click();

	}

}

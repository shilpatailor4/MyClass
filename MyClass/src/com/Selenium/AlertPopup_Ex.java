package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopup_Ex {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\\\Shilpa\\\\Selenium\\\\Selenium Driver\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//Opened website
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		WebElement proceed = driver.findElement(By.name("proceed"));
		proceed.click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		System.out.println("Popup accepted!");
		
		Thread.sleep(1000);
		driver.close();
		
		

	}

}

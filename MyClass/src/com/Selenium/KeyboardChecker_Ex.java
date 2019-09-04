package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyboardChecker_Ex {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\\\Shilpa\\\\Selenium\\\\Selenium Driver\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//Opened amazon website
		driver.get("http://keyboardchecker.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Actions builder = new Actions(driver);
		
		//driver.findElement(By.xpath("String")).sendKeys(Keys.SHIFT);
		
		//driver.findElement(By.xpath("String")).sendKeys(Keys.TAB);
		
		Action type = builder.sendKeys(Keys.SHIFT).build();
		type.perform();
		
		Action type1 = builder.sendKeys(Keys.TAB).build();
		type1.perform();
		
		Thread.sleep(2000);
		driver.close();

	}

}

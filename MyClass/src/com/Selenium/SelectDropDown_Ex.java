package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown_Ex {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\\\Shilpa\\\\Selenium\\\\Selenium Driver\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//Opened amazon website
		driver.get("http://www.echoecho.com/htmlforms11.htm");
		driver.manage().window().maximize();
		
		Thread.sleep(1500);
		WebElement myselectelement = driver.findElement(By.name("mydropdown")); 
		Select dropdown = new Select(myselectelement);
		dropdown.selectByVisibleText("Hot Bread");
		
		Thread.sleep(1500);
		driver.close();

	}

}

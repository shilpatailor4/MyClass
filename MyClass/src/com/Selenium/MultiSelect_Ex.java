package com.Selenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect_Ex {

	public static void main(String[] args) {/// program not run
		
		
		System.setProperty("webdriver.gecko.driver", "E:\\\\Shilpa\\\\Selenium\\\\Selenium Driver\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//Opened amazon website
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_select_multiple2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		WebElement elements = driver.findElement(By.xpath("//select[@id='mySelect']"));
		//elements.sendKeys(Keys.CONTROL, "Apple");
		//elements.sendKeys(Keys.CONTROL, "Orange");
		
		Select dropdown = new Select(elements);
		dropdown.selectByVisibleText("Apple");
		dropdown.selectByVisibleText("Orange"); 
		
		

	}

}

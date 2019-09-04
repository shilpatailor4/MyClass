package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect_Ex {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\\\Shilpa\\\\Selenium\\\\Selenium Driver\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//Opened amazon website
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_select_multiple2");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement elements = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/select[1]"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Select dropdown = new Select(elements);
		dropdown.selectByVisibleText("Apple");
		dropdown.selectByVisibleText("Orange");

	}

}

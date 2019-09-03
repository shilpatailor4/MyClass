package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectCheckbox_Ex {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\\\Shilpa\\\\Selenium\\\\Selenium Driver\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//Opened  website
		driver.get("http://www.echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		
		WebElement chkbox = driver.findElement(By.name("option1"));  // select by checkbox
		chkbox.click();
		
		WebElement chkbox1 = driver.findElement(By.name("option2"));  //Unselect checkbox
		chkbox1.click();
		
		WebElement chkbox2 = driver.findElement(By.name("option3"));   // select by checkbox
		chkbox2.click();
		
		Thread.sleep(1500);
		driver.close();

	}

}

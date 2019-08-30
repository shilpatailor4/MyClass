package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rediff_Login {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\\\Shilpa\\\\Selenium\\\\Selenium Driver\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		WebElement username = driver.findElement(By.name("login"));
		username.sendKeys("shilpatailor4");
		
		WebElement password = driver.findElement(By.name("passwd"));
		password.sendKeys("pass");
		
		//Remmember uncheck
		driver.findElement(By.name("remember")).click();
		
		//Click on the Go bhutton
		WebElement submit = driver.findElement(By.name("proceed"));
		submit.click();
		
		Thread.sleep(1500);
		
		System.out.println("Login! successfully.");
		
		driver.close();
		
		

	}

}

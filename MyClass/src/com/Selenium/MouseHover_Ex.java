package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_Ex {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\\\Shilpa\\\\Selenium\\\\Selenium Driver\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//Opened website
		driver.get("https://www.americangolf.co.uk/");
		driver.manage().window().maximize();
		
		//Thread.sleep(5000);
		
		Actions action = new Actions(driver);
		WebElement hover = driver.findElement(By.xpath("/html/body/div[1]/div[2]/header/nav/div/div[1]/ul/li[2]/a")); 
		
		//Mouse Hover
		
		action.moveToElement(hover).perform();
		System.out.println("Done mouse hover on Golf Club");
		
		//Thread.sleep(5000);
		
		//click on the "Drivers"
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/header/nav/div/div[1]/ul/li[2]/a")).click();
		System.out.println("Drivers screen opened");
		driver.close();

	}

}

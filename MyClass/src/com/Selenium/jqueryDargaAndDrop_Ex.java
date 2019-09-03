package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class jqueryDargaAndDrop_Ex {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\\\Shilpa\\\\Selenium\\\\Selenium Driver\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//Opened website
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		Thread.sleep(1500);
		driver.switchTo().frame(0);
		WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dest = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		//Drag and drop element
		Actions action = new Actions(driver);
		action.dragAndDrop(src, dest).build().perform();
		
		Thread.sleep(2000);
		driver.close();

	}

}

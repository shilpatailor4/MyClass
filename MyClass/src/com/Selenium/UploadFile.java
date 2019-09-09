package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\\\Shilpa\\\\Selenium\\\\Selenium Driver\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_fileupload_get");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		WebElement uploadfile = driver.findElement(By.xpath("//input[@id='myFile']"));
		uploadfile.sendKeys("E:\\Shilpa\\images\\unnamed.jpg");
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();

		Thread.sleep(1500);
		driver.close();
		
	}

}

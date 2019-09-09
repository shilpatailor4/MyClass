package com.Selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AddFile_Ex {

	public static void main(String[] args) throws Exception {
		
		/* System.setProperty("webdriver.chrome.driver", "E:\\\\Shilpa\\\\Selenium\\\\Selenium Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   */
		
		System.setProperty("webdriver.gecko.driver", "E:\\\\Shilpa\\\\Selenium\\\\Selenium Driver\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//Opened amazon website
		driver.get("https://www.zamzar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		WebElement addFile = driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
		addFile.click();
		Thread.sleep(2000);
		
		//Using Autoit tool and write a script and paste script path (Chrome path scrit is changed, it'll work only firefox)
		Runtime.getRuntime().exec("E:\\Shilpa\\Selenium\\AutoitFiles\\UploadFile.exe");
		
		Thread.sleep(2000);
		WebElement select = driver.findElement(By.id("convert-format"));  ////div[@class='btn-group step-description-action']/select/optgroup[1]/option[15]
		select.click();
		Select dropdwon = new Select(select);
		dropdwon.selectByVisibleText("jpg");
		
		driver.findElement(By.id("convert-button")).click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.linkText("Download")).click();
		Thread.sleep(2000);
		driver.close();

	}

}

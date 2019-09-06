package com.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\\\Shilpa\\\\Selenium\\\\Selenium Driver\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hello");
		
		//Print all suggestions keyword
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='aajZCb']/ul/li"));
		System.out.println("Size of all search suggesstion: "+list.size());
		System.out.println("........................ \n");
		System.out.println("Search keyword suggesstions are: \n");
		
		for(WebElement suggestion : list)
		{
			System.out.println(suggestion.getText());
		}
		
		//Choose specific keyword
		System.out.println("\n");
		
		List<WebElement> list1 = driver.findElements(By.xpath("//div[@class='aajZCb']/ul/li[7]"));

		for(WebElement suggestion : list1)
		{
			System.out.println("Select 7th position keyword: "+suggestion.getText());
		}
		
		Thread.sleep(2000);
		driver.close();

	}

}

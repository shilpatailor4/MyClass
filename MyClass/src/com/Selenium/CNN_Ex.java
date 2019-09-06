package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CNN_Ex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\\\Shilpa\\\\Selenium\\\\Selenium Driver\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//Opened amazon website
		driver.get("https://edition.cnn.com/");
		driver.manage().window().maximize();
		
		List<WebElement> elements = driver.findElements(By.xpath("//section[@id='intl_homepage1-zone-1']"));
		System.out.println(elements.size());
		Thread.sleep(1500);
		for(int i=0; i<elements.size(); i++)
		{
			System.out.println(elements.get(i).getText());
		}
		
		Thread.sleep(1500);
		
		//click by link
		WebElement ele1 = driver.findElement(By.xpath("//h2[@class='banner-text screaming-banner-text banner-text-size--char-47']"));
		ele1.click();
		
		/*String actualTitle = driver.getTitle();
		String expectedTitle = "'Stuck' storm to devastate Bahamas for several more hours";
		assertEquals(expectedTitle,actualTitle);   */
		
		//assertTrue(driver.getTitle().contains("Title of Page"));
		
		Thread.sleep(1000);
		driver.close();

	}

	

}

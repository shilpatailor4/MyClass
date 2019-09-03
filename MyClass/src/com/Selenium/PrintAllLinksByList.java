package com.Selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintAllLinksByList {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\\\Shilpa\\\\Selenium\\\\Selenium Driver\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		String Url = "https://edition.cnn.com/";
		driver.get(Url);
		
		/*//screenshot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("E:\\Shilpa\\Selenium\\Report_screenshot\\error.png"));  */
		
		//Takes Screenshot 
		File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//Copy the screenhot as desired location
		FileUtils.copyFile(src1, new File("/E:\\Shilpa\\Selenium\\workspace\\Screenshots\\error.png"));
				
		
		List<WebElement> elements = driver.findElements(By.xpath("//section[@id='intl_homepage1-zone-1']//div[@class='column zn__column--idx-1']"));
		System.out.println(elements.size());
		
		//Print titles by all links	
		for (WebElement z : elements) 
		{
			System.out.println(z.getText());
		}
			
		//print size by all links
		for(int i=0; i<elements.size(); i++)
		{
			System.out.println(elements.get(i).getSize());
		}
		
		Thread.sleep(2000);
		
		List<WebElement> elemennts2 = driver.findElements(By.xpath("//section[@id='intl_homepage1-zone-1']//div[@class='column zn__column--idx-2']"));
		System.out.println(elemennts2.size());
		
		for(WebElement z1 : elemennts2)
		{
			System.out.println(z1.getText());
		}
		
		Thread.sleep(1500);
		
		driver.close();

	}

}

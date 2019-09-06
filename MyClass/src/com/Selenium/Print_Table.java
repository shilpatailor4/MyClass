package com.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Print_Table {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\\\Shilpa\\\\Selenium\\\\Selenium Driver\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//No. of columns
		List<WebElement> col = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
		System.out.println("No. of columns are: " +col.size());
		
		
		//No. of Rows
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println("No. of rows are: "+rows.size());
		
		//No. of all data size
		List<WebElement> lst = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println("No of data are: "+lst.size()+"\n");
		
		//Print web table rows and columns
	/*	for(WebElement i : lst)
		{
			System.out.println(i.getText());
			System.out.println("...............................");
			
		}
		
     */
		
		System.out.println("====================================");
		
		//Specific rows print
		System.out.println("Table specific Rows Data");
		List<WebElement> lst1 = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[6]/td[1]"));
		System.out.println("6th Row and 1st column of Table data size: "+lst1.size()+"\n");
		
		for(WebElement i : lst1)
		{
			System.out.println("6th Row and 1st column of Table: "+i.getText());
			
		}
		
		List<WebElement> lst2 = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[6                                                              ]/td[4]"));   //WRONG OUTPUT SHOW
		
		for(WebElement i : lst2)
		{
			System.out.println("6th Row and 4th column of Table: "+i.getText());
			
		}
		
		driver.close();

	}

}

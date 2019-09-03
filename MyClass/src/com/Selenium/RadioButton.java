package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\\\Shilpa\\\\Selenium\\\\Selenium Driver\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		String url = "http://www.echoecho.com/htmlforms10.htm";
		driver.get(url);
		
		//driver.switchTo().frame(0);
		
		WebElement radioBtn	= driver.findElement(By.xpath("/html[1]/body[1]/div[2]/table[9]/tbody[1]/tr[1]/td[4]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/span[1]/form[1]/table[3]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]\r\n" + 
				""));
		radioBtn.click();
		
	}

}

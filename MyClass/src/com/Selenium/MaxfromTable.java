package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MaxfromTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\\\Shilpa\\\\Selenium\\\\Selenium Driver\\\\geckodriver.exe");
		WebDriver  driver = new FirefoxDriver();
		
		driver.get("https://money.rediff.com/sectors/bse/bse-hc");

	}

}

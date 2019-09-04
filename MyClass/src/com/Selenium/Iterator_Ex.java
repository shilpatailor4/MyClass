package com.Selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iterator_Ex {

	public static void main(String[] args) {
		
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(10);
		lst.add(20);
		lst.add(30);
		lst.add(40);
		lst.add(50);
		lst.add(60);
		
		Iterator<Integer> itr = lst.iterator();
		
	//	System.out.println(itr.next());
	//	System.out.println(itr.next());
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}

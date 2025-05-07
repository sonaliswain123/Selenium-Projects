package com.org;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class seleniumFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
          WebDriver driver=new ChromeDriver();
          driver.get("https://www.geeksforgeeks.org/explore?page=1&sortBy=submissions");
	}

}

package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	       driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		////a[@value='PNQ']
	       driver.findElement(By.xpath("//a[@value='PNQ']")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
	       
	       
	       driver.close();
	       //(//a[@value='GOI'])[2]
	       
	}

}

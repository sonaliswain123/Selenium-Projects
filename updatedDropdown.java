package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class updatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
       WebDriver driver=new ChromeDriver();
       driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
       driver.findElement(By.id("divpaxinfo")).click();
       
       Thread.sleep(2000);
      System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
       for(int i=0;i<5;i++) {
    	   driver.findElement(By.id("hrefIncAdt")).click();
           
       }
       driver.findElement(By.id("btnclosepaxoption")).click();
       System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
       driver.close();
       
       
       
       
	}

}

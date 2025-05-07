package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class locator3 {

	public static void main(String[] args) throws InterruptedException {
		String name="rahul";
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" , "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys(name);
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("submit")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText() , "Hello"+" "+name+",");
		
	}

}

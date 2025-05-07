package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsUsingFunction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" , "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		String name="rahul";
		String pass=getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys(name);
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(pass);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		
		driver.close();
	}
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		String password=driver.findElement(By.cssSelector("form p")).getText();
		String pass[]=password.split("'");
		String actpass=pass[1].split("'")[0];
		
		return actpass;
		
	}

}

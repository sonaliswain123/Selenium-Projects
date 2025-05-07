package com.org;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import java.time.Duration;


public class locatorsadvance {
	
	public static void main(String args[] ) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("sonaliswain325@gmail.com");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("sonali123");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("Sonali Swain");
		driver.findElement(By.xpath("//input[@placeholder=\"Email\"]")).sendKeys("sonali@123gmail.com");
		driver.findElement(By.xpath("//input[@placeholder=\"Phone Number\"]")).sendKeys("8917542444");
		driver.findElement(By.className("go-to-login-btn")).click();
		
		
		System.out.println("Run Successfullyyyyyyyyyyyyyyyyyy...Good JOb Sonali");
		
		driver.close();
	}

}

package com.org;
import org.openqa.selenium.chrome.ChromeDriver;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class locatorpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
         WebDriver driver=new ChromeDriver();
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
         driver.get("https://rahulshettyacademy.com/locatorspractice/");
         driver.findElement(By.id("inputUsername")).sendKeys("sonali");
         driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("sonali123");
         //driver.findElement(By.linkText("Forgot your password?")).click();
        // driver.findElement(By.className("submit")).click();
       // System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
         System.out.println("run successfully");
         //driver.close();

         }

}

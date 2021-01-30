package com.mns.atl.freecrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FreeCRMLogin {
	
	@Test
	public void logInTest()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\MIsc\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Gopaal");
		driver.findElement(By.cssSelector("input[name=txtUsername]")).sendKeys("Admin");
		
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Universal7");
					
		driver.findElement(By.cssSelector("input[name=txtPassword]")).sendKeys("Admin123");
		
	    driver.findElement(By.cssSelector("input[value=Login][type=submit]")).click();
		
		
	}

}

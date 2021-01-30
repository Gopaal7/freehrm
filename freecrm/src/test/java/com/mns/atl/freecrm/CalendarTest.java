package com.mns.atl.freecrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CalendarTest {

	
	
	public void calTest()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\MIsc\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    System.out.println("started");
	   
		driver.get("https://www.freecrm.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Gopaal");
		driver.findElement(By.cssSelector("input[name=username]")).sendKeys("Gopaal");
		
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Universal7");
				
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("Universal7");
		
	    driver.findElement(By.cssSelector("input[value=Login][type=submit]")).click();
	    
	    String date1 = "12/25/2017";
	    
	    String date2[] = date1.split("/");
	    
	    
	
	}
}

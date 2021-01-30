package com.mns.atl.freecrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.RenderingHints.Key;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GoogleSearchTest {
	
	
	@Test
	public void googleSearch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\MIsc\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   
		driver.get("https://www.Google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@title='Search'][@id='lst-ib']")).sendKeys("Testing");
		
		List<WebElement> resultList =	driver.findElements(By.xpath("//ul[@role='listbox']//li"));
	
		for(int i=0;i<resultList.size();i++)
		{
			

			WebElement ele = resultList.get(i);
			
			
			if(ele.getText().equals("testing center"))
			{
				System.out.println(ele.getText());
				
				resultList.get(i).click();
				break;
				
				/*Actions act = new Actions(driver);
				act.moveToElement(ele);
				
				
				act.sendKeys(Keys.ENTER);
				act.build().perform();
				break;
				*/
				//ele.sendKeys(Keys.ENTER);
			}
			
		}
		
		
	}

}

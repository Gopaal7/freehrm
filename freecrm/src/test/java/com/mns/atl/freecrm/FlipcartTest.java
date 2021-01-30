package com.mns.atl.freecrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FlipcartTest {
  @Test
  public void flipCartPopUp() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Softwares\\MIsc\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    System.out.println("started");
	   
//		driver.get("https://www.flipkart.com/");
	
	    driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//*[@id='mCSB_8_container']/p[10]
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//*[@id='mCSB_8_container']/p[10]"));
		
		je.executeScript("arguments[0].scrollIntoView(true);",element);
		Thread.sleep(5000);
		je.executeScript("arguments[0].setAttribute('style','border:solid 2px red');",element);

		System.out.println(element.getText());
		
		/*Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE);
		action.build().perform();
	*/
		
		//driver.switchTo().alert().dismiss();
		
  }
}

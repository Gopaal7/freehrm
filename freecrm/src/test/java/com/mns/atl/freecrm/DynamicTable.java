package com.mns.atl.freecrm;
 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class DynamicTable {
   @Test
   
  public void TestRandomContact() throws InterruptedException {
	   
	    System.setProperty("webdriver.chrome.driver","C:\\Softwares\\MIsc\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   
		driver.get("https://www.freecrm.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Gopaal");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Universal7");
		
		driver.findElement(By.xpath("//*[@value='Login']")).submit();
	
		driver.switchTo().frame("mainpanel");
		
		 
	 	
		driver.findElement(By.xpath("//*[@id='navmenu']//a[text()='Contacts']")).click();
		
	
		//2nd method using dynamic xpath
		//driver.findElement(By.id("//*[@id='vContactsForm']//a[contains(text(),'Raj']"));
		
		driver.findElement(By.xpath("//*[@id='vContactsForm']//a[contains(text(),'Raj')]/Parent::td/preceding-sibling::td/input[@name='contact_id']")).click();
		
		//driver.findElement(By.xpath("//*[@id='vContactsForm']//a[contains(text(),'Raj')]/parent::td/preceding-sibling::td/input[@name='contact_id']")).click();
		
		
		
		//1st method using for loop
	/*	String beforeXpath =	"//*[@id='vContactsForm']/table/tbody/tr[";
		String afterXPath =	"]/td[2]/a";
		
		
		//*[@id='vContactsForm']/table/tbody/tr[7]/td[2]/a[contains(text(),'Raj')]
		for(int i=5;i<=7;i++)
		{
			//*[@id='vContactsForm']/table/tbody/tr[7]/td[2]/a[text()='Raj Kumar']
		 String str=	driver.findElement(By.xpath(beforeXpath+i+afterXPath)).getText();
		 if(str.equalsIgnoreCase("Raj Kumar"))
		 {
			 System.out.println("text ==" + str);
			 driver.findElement(By.xpath(beforeXpath+i+afterXPath)).click();
			 break;
		 }
		 
		}
		*/
		
			
		//WebElement ele= driver.findElement(By.xpath(".//*[@id='navmenu']/ul/li[4]/a"));
		  // ele.click();
  }
}

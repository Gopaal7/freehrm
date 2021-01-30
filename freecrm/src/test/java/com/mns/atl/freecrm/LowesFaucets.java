package com.mns.atl.freecrm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LowesFaucets {
  @Test
  public void faucetsCount() throws Exception {
	  
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Softwares\\MIsc\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://www.lowes.com/pl/Bathroom-sink-faucets-Bathroom-faucets-shower-heads-Bathroom/1879636657");
	  
	    // Click on the filter
	    driver.findElement(By.xpath("//*[@id='label4294390910']")).click();
	    
	    driver.findElement(By.xpath("//*[@id='label4294388288']")).click();
	    
	    // get the count of the filters
	    WebElement firstFilterElement= driver.findElement(By.xpath("//*[@id=\"label4294390910\"]/parent::label"));
	    
	    String firstFilterCount = firstFilterElement.getAttribute("data-count");
	    
	    WebElement secondFilterElement= driver.findElement(By.xpath("//*[@id=\"label4294388288\"]/parent::label"));
	    
	    String secondFilterCount = secondFilterElement.getAttribute("data-count");
	    
	    int totalFiltersCount = Integer.parseInt(firstFilterCount) + Integer.parseInt(secondFilterCount);
	    
	    System.out.println("First Filter Count is :::" + firstFilterCount + "Second Filter Count is :::" + secondFilterCount);
	    
	    System.out.println("totalFiltersCount :::::" + totalFiltersCount);
	    ;
	    //----- end of filter count
	    
	    
	    
	    WebElement totalCount1 = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div[3]/div[1]/ul"));
	    
	  //*[@id="mainContent"]/div[4]/div[3]/div[1]/ul/li[@class="product-wrapper grid-25 tablet-grid-33 v-spacing-large"]
	    
	  //ul[@class="pagination js-pagination"][@role="navigation"]
	    Thread.sleep(10000);
	    // get the total pages count -- navigate to the last pages -- get the count ...
	    // total pages-1 multiply by total count in each page + count of the last page
	    WebElement totalPagesElement = driver.findElement(By.xpath("//ul[@class=\"pagination js-pagination\"][@role=\"navigation\"]"));
	    
	    String totalPages = totalPagesElement.getAttribute("data-pages");
	    
	    System.out.println("Total no of pages ::::" + totalPages);
	    
	    // navigate to the last page
	    driver.findElement(By.xpath("//ul[@class='pagination js-pagination']/li[contains(.,'8')]/a")).click();
	    
	    // Get the count in the last page 
	    List<WebElement> lastPageCount = driver.findElements(By.xpath("//*[@id='mainContent']/div[4]/div[3]/div[1]/ul/li[@class='product-wrapper grid-25 tablet-grid-33 v-spacing-large']"));
	    
	    System.out.println("Last page count :::" + lastPageCount.size());
	    
	    int totalCount = ((Integer.parseInt(totalPages)-1)*36) + lastPageCount.size();
	    
	    System.out.println("Total count from the pages" + totalCount);
	    
	    
  }
}

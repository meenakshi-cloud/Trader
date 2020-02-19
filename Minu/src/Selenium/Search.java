package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DD.Test;

public class Search {

	private static final String Title = null;
	private static final String Assert = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@Test (Priority=2)
		public void kk(){
		
			driver.quit();

	}
		@Test (Priority=1)
		public void CC() {
		//Launch Chrome Browser
				WebDriver driver = new ChromeDriver();
		}	
				
				//Launch Website
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\katpa\\OneDrive\\Desktop\\chromedriver.exe");
		//Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
		//Launch Website
		driver.get("www.autotrader.com");
		//Click Advance Search
		driver.findElement(By.css("div['class=col-xs-12']")).click();
		//Enter zipcode
		driver.findElement(By.css("input['class=form-control']")).sendKeys("30040");
		//Select Certified check box
		driver.findElement(By.css("div.input-label")).get(2);
		//Select Convertible checkbox
		driver.findElement(By.css("input['class=input-label']")).get(0);
		//Select from Year Drodown
		driver.findElements(By.cssContainingText("#\\34 101482096","2017"));
		//Select To Year Dropdown
		driver.findElements(By.cssContainingText("#\\32 58002540","2020"));
		//Select BMW
		driver.findElements(By.cssContainingText("div.form-control","BMW"));
		//Select Search at the bottom of page
		driver.findElement(By.css("div['class=\btn btn-primary btn-block ae-button\']")).submit();
		//Check if BMW results are here in Print
		System.out.println("Assertion starts here...");
		 Assert.assertEquals(Title, GetTitle);
		 System.out.println("Certified BMW");
		 
		 List<WebElement> allElements = driver.findElements(By.xpath("//*"));      //Identify all the elements on web page
         
         int elementsCount = allElements.size();     //Count the total all element on web page
         
         System.out.println("Total Number of All Element on webpage = "  + elementsCount);         //Print the total count of all element on webpage
		
		
		//driver.findElement(arg0)
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		driver.quit();
		

	}

}





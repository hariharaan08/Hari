package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleXpath {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium9.30Am\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		 search.sendKeys("iphone");
	    WebElement btnSubmit = driver.findElement(By.id("nav-search-submit-button"));
	    btnSubmit.click();
	   
	    
		
	}

}

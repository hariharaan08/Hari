package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium9.30Am\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement trn = driver.findElement(By.xpath("//span[@class='text']"));
		trn.click();
		WebElement vel = driver.findElement(By.xpath("//div[@class='col-lg-7']"));
		String text = vel.getText();
		System.out.println(text);
		
		
		
		
		
		
		
		
			
		
		
		
	    
	    
		
		
	}

}

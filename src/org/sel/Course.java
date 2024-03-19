package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Course {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium9.30Am\\Drivers\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		WebElement btnModelresume = driver.findElement(By.id("heading201"));
		btnModelresume.click();
		WebElement btnModel = driver.findElement(By.xpath("(//a[@title='Model Resume training in chennai']"));
		btnModel.click();
		
	}
}
	

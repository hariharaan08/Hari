package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleD1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium9.30Am\\Drivers\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		
		WebElement textUser = driver.findElement(By.id("DUMMY1"));
		
		textUser.sendKeys("hariharan");
		WebElement textPwd = driver.findElement(By.name("AuthenticationFG.ACCESS_CODE"));
		textPwd.sendKeys("12345");
		
		
		
		
		
		
		
	}
	}
		
	
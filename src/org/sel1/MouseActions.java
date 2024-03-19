package org.sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseActions {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium9.30Am\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver); 
		WebElement sign = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		sign.click();
		driver.findElement(By.id("createAccountSubmit")).click();
		WebElement name = driver.findElement(By.id("ap_customer_name"));
		name.sendKeys("Hariharan");
		WebElement ph = driver.findElement(By.id("ap_phone_number"));
		ph.sendKeys("1234567898");
		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys("hariharan@gmail.com");
		WebElement pass = driver.findElement(By.id("ap_password"));
		pass.sendKeys("hariharan12345");
		
		
		
		
		
		
		
		
		
	}

}

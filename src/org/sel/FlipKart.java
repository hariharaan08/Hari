package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium9.30Am\\Drivers\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
		 
		 WebElement btnLogin = driver.findElement(By.className("_1_3w1N"));
		btnLogin.click();
		WebElement Phno = driver.findElement(By.xpath("(//input[@autocomplete='off']"));
		Phno.sendKeys("9597844092");
		 
		
	}

}

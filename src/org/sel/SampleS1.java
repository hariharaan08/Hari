package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleS1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium9.30Am\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
	    WebElement BtnAcc = driver.findElement(By.className("name_rb_secondary_item"));
	    BtnAcc.click();
	    WebElement BtnUser = driver.findElement(By.className("user_sign_in_sign_up"));
	    BtnUser.click();
	    WebElement BtnPh = driver.findElement(By.id("mobileNoInp"));
	    BtnPh.sendKeys("9597844092");
	    WebElement BtnRecaptcha = driver.findElement(By.id("recaptcha-anchor-label"));
	    BtnRecaptcha.click();
	    WebElement BtnOtp = driver.findElement(By.id("otp-container"));
	    BtnOtp.click();
	    
		
		
		
	}

}

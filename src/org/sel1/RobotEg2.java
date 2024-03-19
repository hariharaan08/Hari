package org.sel1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotEg2 {
	public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium9.30Am\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in/webhp");
	driver.manage().window().maximize();
	Actions ac = new Actions(driver);
	Robot r = new Robot();
	WebElement name = driver.findElement(By.id("APjFqb"));
	name.sendKeys("Vel Murugan");
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_A);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_A);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_X);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_X);
	
	
	
	
	
	
	
	
	
	
	
	
	}

}




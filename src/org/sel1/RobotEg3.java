package org.sel1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotEg3 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium9.30Am\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		Robot r = new Robot();
		WebElement sign = driver.findElement(By.id("nav-link-accountList"));
		ac.moveToElement(sign).perform();
		WebElement clk = driver.findElement(By.xpath("//span[text()='Sign in']"));
		clk.click();
		WebElement nxt = driver.findElement(By.id("ap_email"));
		nxt.sendKeys("email");
		ac.doubleClick(nxt).perform();
		ac.contextClick().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
}
}

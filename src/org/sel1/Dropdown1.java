package org.sel1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium9.30Am\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/python-training.html");
		driver.manage().window().maximize();
		Thread.sleep(9000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Alert a = driver.switchTo().alert();
		driver.findElement(By.className("popup-container"));
		a.dismiss();
		WebElement scroll = driver.findElement(By.xpath("(//h3[text()='Selenium Test Papers'])[2]"));
		js.executeAsyncScript("arguments[0].scrollIntoView(true)", scroll);
		scroll.click();
		
		
			
		}
		
		
			}
		
	
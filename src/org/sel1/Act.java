package org.sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Act {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium9.30Am\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html ");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		WebElement drv = driver.findElement(By.xpath("(//li[@id='fourth'])[2]"));
		WebElement acc = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		a.dragAndDrop(drv, acc).perform();
		WebElement drv1 = driver.findElement(By.xpath("//li[@id='credit2']"));
		WebElement acc1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(drv1, acc1).perform();
		WebElement acc2 = driver.findElement(By.xpath("//li[@id='credit1']"));
		WebElement drv2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(acc2, drv2).perform();
		WebElement acc3 = driver.findElement(By.xpath("(//li[@id='fourth'])[2]"));
		WebElement drv3 = driver.findElement(By.xpath("//li[@class='placeholder']"));
		a.dragAndDrop(acc3, drv3).perform();
		
		
		
		
		
	}
	}



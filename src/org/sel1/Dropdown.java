package org.sel1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium9.30Am\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement id = driver.findElement(By.id("username"));
		id.sendKeys("arunking99");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("arunking99");
		driver.findElement(By.id("login")).click();
		WebElement loc = driver.findElement(By.id("location"));
		Select s = new Select(loc);
		s.selectByVisibleText("Sydney");
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotel);
		s1.selectByVisibleText("Hotel Creek");
		WebElement room = driver.findElement(By.id("room_type"));
		Select s3 = new Select(room);
		s3.selectByVisibleText("Double");
		WebElement nr = driver.findElement(By.id("room_nos"));
		Select s4 = new Select(nr);
		s4.selectByVisibleText("1 - One");
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		WebElement fn = driver.findElement(By.id("first_name"));
		fn.sendKeys("arun");
		WebElement ln = driver.findElement(By.id("last_name"));
		ln.sendKeys("king");
		WebElement add = driver.findElement(By.id("address"));
		add.sendKeys("india");
		WebElement credit = driver.findElement(By.id("cc_num"));
		credit.sendKeys("1234567891234567");
		WebElement ct = driver.findElement(By.id("cc_type"));
		Select s5 = new Select(ct);
		s5.selectByVisibleText("American Express");
		WebElement expmonth = driver.findElement(By.id("cc_exp_month"));
		Select s6 = new Select(expmonth);
		s6.selectByValue("1");
		WebElement expyear = driver.findElement(By.id("cc_exp_year"));
		Select s7 = new Select(expyear);
		s7.selectByValue("2012");
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("456");
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(8000);
		WebElement no = driver.findElement(By.id("order_no"));
		String txt = no.getAttribute("value");
		System.out.println(txt);
			
		}
		}
			
		
		
			
		
		
		
			
		
			
	



package org.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleDay4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium9.30Am\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
	}

}

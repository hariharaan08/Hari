package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium9.30Am\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		WebElement From = driver.findElement(By.id("from_station"));
		From.sendKeys("Chennai");
		WebElement To = driver.findElement(By.id("to_station"));
		To.sendKeys("Bangalore");
		WebElement btnSearch = driver.findElement(By.id("trainFormButton"));
		btnSearch.click();
		

}
}
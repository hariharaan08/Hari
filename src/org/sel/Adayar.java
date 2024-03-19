package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adayar {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium9.30Am\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		WebElement add = driver.findElement(By.xpath("(//p[@style='text-align:justify; font-size:18px;'])[1]"));
		String prnt = add.getText();
		System.out.println(prnt);
		WebElement add2 = driver.findElement(By.xpath("(//p[@style='text-align:justify; font-size:18px;'])[2]"));
		String prnt1 = add2.getText();	
		System.out.println(prnt1);
		WebElement add3 = driver.findElement(By.xpath("//font[@face='Arial']"));
		String prnt2 = add3.getText();
		System.out.println(prnt2);
		WebElement add4 = driver.findElement(By.xpath("(//p[@style='text-align:justify; font-size:18px;'])[4]"));
		String prnt3 = add4.getText();
		System.out.println(prnt3);
	}

}

package com.packages.baseclass;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebElement element;
	public static WebDriver driver;
	
	public static void browserlaunch(String url) {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		}
	public static void quit() {
		driver.quit();
	}
	public static void dateAndTime() {
		LocalDateTime dateTime =LocalDateTime.now();
		System.out.println(dateTime);
		}
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	public static WebElement Xpath(String Xpath) {
		return element=driver.findElement(By.xpath(Xpath));
		}
	public static WebElement ID(String ID) {
		return element=driver.findElement(By.id(ID));
		}
	
	
	
	

}

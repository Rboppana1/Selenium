package com.edurekha.controls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop {
	
	public static WebDriver driver=null;
	 public static WebDriverWait wait = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver,10);
		driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
      driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");

	WebElement src = driver.findElement(By.xpath("//h1[text()='Block 1']"));
	WebElement block2 = driver.findElement(By.xpath("//h1[text()='Block 2']"));
	WebElement dest = driver.findElement(By.id("column-3"));
	
	
	Actions action = new Actions(driver);
	action.dragAndDrop(src, dest).perform();
	
	action.dragAndDrop(block2, dest).perform();
	
	}

}

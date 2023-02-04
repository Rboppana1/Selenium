package com.edurekha.controls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingHiddenDivisionPopup {

	public static WebDriver driver=null;
	 public static WebDriverWait wait = null;
	 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver,10);
		driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       driver.get("https://www.cleartrip.com");
       
       
      WebElement departOn = driver.findElement(By.xpath("//strong[text()='Depart on']"));
      departOn.click();
      
      WebElement date = driver.findElement(By.xpath("(//a[text()='14'])[1]"));
      date.click();
      
	}

}

package com.edurekha.controls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingFrames {
	
	public static WebDriver driver=null;
	 public static WebDriverWait wait = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver,10);
		driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("http://demo.automationtesting.in/Frames.html");
        
       
        //driver.switchTo().frame(0);
       //driver.switchTo().frame("SingleFrame");
        WebElement singleFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
        driver.switchTo().frame(singleFrame);
     
       WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
        text.sendKeys("Independent Frames");
        
        driver.switchTo().parentFrame();
        
       WebElement InlineFrameTab =  driver.findElement(By.linkText("Iframe with in an Iframe"));
        InlineFrameTab.click();
        
        WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src='MulipleFrames.html'])"));
        driver.switchTo().frame(outerFrame);
       
        driver.switchTo().frame(0);
        
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Inline Frames");
        
	}

}

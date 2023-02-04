package com.edureka.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class GoogleSearch {

	public static WebDriver driver=null;
	 public static WebDriverWait wait = null;

	
	@Test
	 public void googleSearch()throws InterruptedException
	{
	String clientUrl="http://192.168.1.65:4444/wd/hub";
   
	/*{
	DesiredCapabilities cap = DesireCapabilities.chrome();
	cap.setBrowserName("chrome");
	cap.setPlatform(Platform.WIN10);*/
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver,10);
		driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     driver.get("https://www.google.com");
     WebElement searchbox=driver.findElement(By.xpath("//input[@type='text']"));
     searchbox.sendKeys("selenium");
     searchbox.submit();
     System.out.println(driver.getTitle());
	}
}


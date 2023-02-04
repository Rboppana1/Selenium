package com.practice.controls;
/*package com.edurekha.controls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseOverEvent {
	
	public static WebDriver driver=null;
	 public static WebDriverWait wait = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver,10);
		driver.manage().window().maximize();
     driver.manage().deleteAllCookies();
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     driver.get("https://www.mirraw.com/");

     WebElement sareesLink = driver.findElement(By.xpath("//a[@href='/store/sarees']"));
     Actions action = new Actions(driver);
     action.moveToElement(sareesLink).perform();
     
    WebElement kanchisarees = driver.findElement(By.linkText("Kanchipuram Silk"));
    kanchisarees.click();
    
    System.out.println(driver.getTitle());
    
    WebElement searchBox = driver.findElement(By.name("q"));
    Actions action = new Actions(driver);
    
    Action searchString=action.keyDown(searchBox,Keys.SHIFT).sendKeys("saress").keyUp(searchBox,Keys.Search)
    searchString.perform();
    
	}

}
*/
package com.practice.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo
{
 public static WebDriver driver = null;	

	public static void main(String[] args) 
	{
	  System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com");

	  /*WebElement username = driver.findElement(By.id("email"));
	  username.sendKeys("your_email@something.com");
	  
	  WebElement pwd = driver.findElement(By.name("pass"));
	  pwd.sendKeys("your_password");*/
	  
	  	/*WebElement fname = driver.findElement(By.className("inputtext_58mg_5dba_2ph-"));
	  	fname.sendKeys("Hema"); //Exception
	  */
	  	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	  	/*int size = allLinks.size();
	  	System.out.println(size);*/
	  	
	  	/*System.out.println(allLinks.size());
	  	for(WebElement link:allLinks)
	  	{
	String text = link.getText();
	System.out.println(text);
}*/
	  	/*driver.findElement(By.linkText("Forgot account?")).click();*/
	  	
	  	//driver.findElement(By.partialLinkText("account?")).click();
	  	
	  	//String absXpath = "/html/body/div/div/div/div/div/div/div/form/table/tbody/tr/td[1]/input";
	  	
	  	/*WebElement femaleRadioBtn = driver.findElement(By.xpath("//input[@value='1']"));
	  			femaleRadioBtn.click();
	  			
	  			WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	  			email.sendKeys("your_email@whatever.com");
	  			
	  			WebElement signUp = driver.findElement(By.xpath("//h2[text()='Sign Up']"));
	  			System.out.println(signUp.getText());
	  			
	  			WebElement fname = driver.findElement(By.xpath("//input[@name='firstname' or @aria-label='First name' and @id='u_0_m']"));
	  			fname.sendKeys("Raji");
	  			
	  			WebElement welcomeMsg = driver.findElement(By.xpath("//h2[starts-with(text(),'Connect with')]"));
	  			System.out.println(welcomeMsg.getText());
	  			
	  			WebElement hiMsg = driver.findElement(By.xpath("//h2[contains(text(),'world around you')]"));
	  			System.out.println(hiMsg.getText());*/
	  			
	  			//xpath - //tagname[@attr='value']      cssSelector - tagname[attr='value']
	  			
	  			WebElement email = driver.findElement(By.cssSelector("input[data-testid='royal_email']"));
	  			email.sendKeys("your_email@something.com");
	  			
}
}


 
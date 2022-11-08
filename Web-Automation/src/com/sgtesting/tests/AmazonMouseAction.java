package com.sgtesting.tests;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonMouseAction {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		mousemovement();


	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("https://www.amazon.in/");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
 private static void mousemovement()
 {  
	 try
	 {
		 WebElement a=oBrowser.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"));
		 Actions oMouse=new Actions(oBrowser);
		 oMouse.moveToElement(a).build().perform();
		 Thread.sleep(3000);
		 
	 }catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	
 }

}

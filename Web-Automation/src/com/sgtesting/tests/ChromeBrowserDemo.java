package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {
	public static WebDriver Browser =null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimize();
		 logout();
		 closeApplication();


	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver" ,
					"C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			Browser = new ChromeDriver();
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{ 
		try
		{
			Browser.get("http://localhost/login.do");
			Thread.sleep(5000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	private static void login()
	{
		try
		{
			Browser.findElement(By.id("username")).sendKeys("admin");
			Browser.findElement(By.name("pwd")).sendKeys("manager");
			Browser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	 private static void minimize()
	 {
		 try
		 {
		 Browser.findElement(By.xpath("//*[@id='gettingStartedShortcutsPanelId']/div[1]")).click();
		
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	 
	 private static void logout()
	 {
		 try
		 {
			 Browser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			 
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 
	 }
	 private static void closeApplication()
	 {
		 try
		 {
			Browser.quit(); 
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
  

}





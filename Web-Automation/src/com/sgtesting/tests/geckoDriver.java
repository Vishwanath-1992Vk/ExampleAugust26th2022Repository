package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class geckoDriver {
	public static WebDriver Browser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimize();
		logoutApp();
		closeApp();



	}

	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.gecko.driver","C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\geckodriver.exe");
			Browser = new FirefoxDriver();
		}catch(Exception e)
		{
			e.getStackTrace();
		}
	}
	private static void navigate()
	{ try {
		Browser.get("http://localhost/login.do");
	}catch(Exception e)
	{
		e.getStackTrace();
	}

	}
	private static void login()
	{
		try {
			Browser.findElement(By.id("username")).sendKeys("admin");
			Browser.findElement(By.name("pwd")).sendKeys("manager");
			Browser.findElement(By.xpath("//*[@id=\"loginButton\"]")).click();
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
			Browser.findElement(By.xpath("//*[@id=\"gettingStartedShortcutsPanelId\"]")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void logoutApp()
	{
		try
		{
			Browser.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApp()
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

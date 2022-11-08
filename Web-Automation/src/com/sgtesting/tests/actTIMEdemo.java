package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actTIMEdemo {
	public static WebDriver oBrowser =null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimize();
		creatuser();
		deleteUser();
		logout();
		closeApp();


	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser =new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.getStackTrace();
		}
	}
	private static void login()
	{
		try 
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
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
			oBrowser.findElement(By.xpath("//*[@id=\"gettingStartedShortcutsPanelId\"]/div[1]")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void creatuser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			oBrowser.findElement(By.xpath("//div[text()='Add User'] ")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("vishwa");
			oBrowser.findElement(By.name("middleName")).sendKeys("R");
			oBrowser.findElement(By.name("lastName")).sendKeys("Korimath");
			oBrowser.findElement(By.name("email")).sendKeys("korimathvr@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demoUser");
			oBrowser.findElement(By.name("password")).sendKeys("1234");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("1234");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}                                                             
	private static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='Korimath, R vishwa.']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(5000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	 private static void logout()
	 {
		 try
		 {
			 oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			 Thread.sleep(3000);
			 
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 
	 }
	private static void closeApp()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

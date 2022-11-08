package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5a {
  public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutwindow();
		addCustomer();
		modifyCustomer();
		logout();
		
		
	}
		private static void launchBrowser()
		{
			try
			{
				System.setProperty("webdriver.chrome.driver" ,
						"C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
				oBrowser = new ChromeDriver();
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
				e.printStackTrace();
			}

		}
		private static void login()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("admin");
				oBrowser.findElement(By.name("pwd")).sendKeys("manager");
				oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
				Thread.sleep(5000);
			}catch(Exception e)
			{                                                    
				e.printStackTrace();
			}
		}
		
		private static void minimizeFlyOutwindow()
		{
			try
			{
				oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void addCustomer()
		{                                                  
			try
			{
				oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr/td[3]")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//div[text()='Add New'] ")).click();
				oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Akash");
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//*[@id=\"customerLightBox_commitBtn\"]/div/span")).click();
				Thread.sleep(3000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	      
	  private static void modifyCustomer()
	  {
		  try
		  {
			  oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/table/tbody/tr/td[2]/div/span[5]/div")).click();
			  Thread.sleep(3000);
			  
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

	}



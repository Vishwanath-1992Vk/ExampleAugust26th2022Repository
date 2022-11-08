package com.pageobjectmodel.programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static WebDriver oBrowser=null;
	public static ActiPage oPage=null;
	public static void main(String[] args) {


		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		user();
		modifyuser();





	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiPage(oBrowser);
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
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void user()
	{ 
		try
		{
			oPage.clickuser().click();
			oPage.clickadduser().click();
			oPage.getfirstName().sendKeys("User1");
			oPage.getmiddleName().sendKeys("A");
			oPage.getlastName().sendKeys("Demo");
			oPage.useremail().sendKeys("vk@gmail.com");
			oPage.getUserName().sendKeys("Demouser1");
			oPage.getuserpwd().sendKeys("1234");
			oPage.getpwdcopy().sendKeys("1234");
			oPage.createuser().click();
		
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void modifyuser()
	{
		try
		{   oPage.clickusrA().click();
			oPage.getuserpwd().sendKeys("3456");
			oPage.getpwdcopy().sendKeys("3456");
			oPage.savechanges().click();
			oPage.getLogout().click();
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}


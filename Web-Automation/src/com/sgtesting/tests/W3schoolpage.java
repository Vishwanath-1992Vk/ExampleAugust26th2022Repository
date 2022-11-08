package com.sgtesting.tests;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3schoolpage {
	public static WebDriver oBrowser = null;
	public static void main(String[] args) {

		launchBrowser();
		navigate();
		tutorialLinks();


	}

	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe" );
			oBrowser= new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	private static void navigate()
	{
		try
		{
			oBrowser.get("https://www.w3schools.com");
			Thread.sleep(3000);
			oBrowser.manage().window().maximize();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();	
		}

	}
	private static void tutorialLinks()
	{
		try
		{
			oBrowser.findElement(By.id("navbtn_tutorials")).click();
			Thread.sleep(2000);
			List<WebElement> olinks = oBrowser.findElements(By.xpath("//a[@href]"));
			Thread.sleep(1000);
			int linkcount = olinks.size();
			System.out.println("The number of links is "+linkcount);
		}catch(Exception e)
		{
			e.printStackTrace();	
		}
	}




}




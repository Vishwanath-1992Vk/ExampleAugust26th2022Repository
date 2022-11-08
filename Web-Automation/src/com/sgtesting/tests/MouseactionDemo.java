package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseactionDemo {
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
			oBrowser.get("https://www.flipkart.com/");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void  mousemovement()
	{
		try
		{

			oBrowser.findElement(By.xpath("//button[text()='✕']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'container\']/div/div[2]/div/div/div[1]/a/div[2]")).click();
			Thread.sleep(3000);
			WebElement a = oBrowser.findElement(By.xpath("//*[@id=\'container\']/div/div[2]/div/div/span[3]"));
			Actions oMouse=new Actions(oBrowser);
			oMouse.moveToElement(a).build().perform();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div/div/div[2]/a[4]")).click();
			Thread.sleep(3000);
			String fetchlink =oBrowser.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[1]/div/div/h1")).getText();
			System.out.println("The link is :" +fetchlink);
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

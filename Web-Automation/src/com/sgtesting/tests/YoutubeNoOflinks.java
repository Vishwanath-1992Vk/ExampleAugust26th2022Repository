package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeNoOflinks {
    public static  WebDriver oBrowser =null;
	public static void main(String[] args) {
		 launchBrowser();
		 navigate();
		 login();

	}
 private static void launchBrowser()
 {
	 try
	 {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
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
		 oBrowser.get("https://www.youtube.com/");
	 }catch(Exception e)
	 {
		 e.printStackTrace();
	 }
 }
 private static void login()
 {
	 try
	 {
		 oBrowser.findElement(By.xpath("//*[@id=\"button\"]/paper-ripple")).click();
		 Thread.sleep(3000);
	 }catch(Exception e)
	 {
		 e.printStackTrace();
	 }
 }
}
 


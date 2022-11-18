package com.Javascript.programs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScripts {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();

	}

	private static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
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
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
private static void login()
{
	JavascriptExecutor js=(JavascriptExecutor) oBrowser;
	js.executeScript("document.getElementById('username').value= admin");
	//js.equals("document.evaluate("//input[@name='pwd'],document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.value= manager;")
}

}

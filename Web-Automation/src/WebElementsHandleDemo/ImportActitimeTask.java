package WebElementsHandleDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImportActitimeTask {
	public static WebDriver oBrowser = null;
	public static void main(String[] args) {
		launchBrowser();
		 navigate();
		 login();
		 minimize();
		 importtask();

	}
	private static void launchBrowser()
	{
		try
		{
			String path = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",path+ "\\Library\\drivers\\chromedriver.exe");
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
		     oBrowser.get("http://localhost/login.do");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
		oBrowser.findElement(By.name("username")).sendKeys("admin");
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimize()
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
	private static void importtask()
	{
		try
		{

			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add New Task']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//div[text()='Import tasks from CSV']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("dropzoneClickableArea")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

package com.pageobjectmodel.programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	public static WebDriver oBrowser=null;
	public static ActiPage oPage= null;
	public static void main(String[] args) {

		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		creatuser1();
		creatuser2();
		creatuser3();
		logout();
		loginOutusers1();
		loginOutuser2();
		loginOutuser3();
		secondloginuser1();
		modifyuser1();
		logoutuser1();
		secondloginuser2();
		modifyuser2();
		logoutuser2();
		secondloginuser3();
		modifyuser3();
		logoutuser3();
		loginuser1newpwd();
		logoutuser1newPwd();
		loginuser2newpwd();
		logoutuser2newPwd();
		loginuser3newpwd();
		logoutuser3newPwd();




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
	private static void creatuser1()
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
	private static void creatuser2()
	{
		try
		{
			oPage.clickuser().click();
			oPage.clickadduser().click();
			oPage.getfirstName().sendKeys("User2");
			oPage.getmiddleName().sendKeys("B");
			oPage.getlastName().sendKeys("Demo");
			oPage.useremail().sendKeys("b@gmail.com");
			oPage.getUserName().sendKeys("Demouser2");
			oPage.getuserpwd().sendKeys("4567");
			oPage.getpwdcopy().sendKeys("4567");
			oPage.createuser().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void creatuser3()
	{
		try
		{
			oPage.clickuser().click();
			oPage.clickadduser().click();
			oPage.getfirstName().sendKeys("User3");
			oPage.getmiddleName().sendKeys("C");
			oPage.getlastName().sendKeys("Demo");
			oPage.useremail().sendKeys("c@gmail.com");
			oPage.getUserName().sendKeys("Demouser3");
			oPage.getuserpwd().sendKeys("7890");
			oPage.getpwdcopy().sendKeys("7890");
			oPage.createuser().click();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			oPage.getLogout().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void  loginOutusers1()
	{
		try
		{

			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(5000);
			oPage.actiExplore().click();
			oPage.getLogout().click();
			Thread.sleep(3000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginOutuser2()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(5000);
			oPage.actiExplore().click();
			oPage.getLogout().click();
			Thread.sleep(3000);

			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginOutuser3()
	{
		try
		{

			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(5000);
			oPage.actiExplore().click();
			oPage.getLogout().click();
			Thread.sleep(3000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void secondloginuser1()
	{
		try
		{
			oPage.getUserName().sendKeys("Demouser1");
			oPage.getPassword().sendKeys("1234");
			oPage.getLogin().click();
			oPage.actiExplore().click();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyuser1()
	{
		try
		{    
			oPage.clickuser().click();
			oPage.clickusrA().click();
			oPage.getuserpwd().sendKeys("789");
			oPage.getpwdcopy().sendKeys("789");
			oPage.savechanges().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser1()
	{
		try
		{
			oPage.getLogout().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void secondloginuser2()
	{
		try
		{

			oPage.getUserName().sendKeys("Demouser2");
			oPage.getPassword().sendKeys("4567");
			Thread.sleep(3000);
			oPage.getLogin().click();
			oPage.actiExplore().click();
			oPage.getLogout().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyuser2()
	{
		try
		{    
			oPage.clickuser().click();
			oPage.clickusrB().click();
			oPage.getuserpwd().sendKeys("7895");
			oPage.getpwdcopy().sendKeys("7895");
			oPage.savechanges().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser2()
	{
		try
		{
			oPage.getLogout().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void secondloginuser3()
	{
		try
		{
			oPage.getUserName().sendKeys("Demouser3");
			oPage.getPassword().sendKeys("7890");
			oPage.getLogin().click();
			oPage.actiExplore().click();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyuser3()
	{
		try
		{    
			oPage.clickuser().click();
			oPage.clickusrC().click();
			oPage.getuserpwd().sendKeys("7892");
			oPage.getpwdcopy().sendKeys("7892");
			oPage.savechanges().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser3()
	{
		try
		{
			oPage.getLogout().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginuser1newpwd()
	{
		try
		{
			oPage.getUserName().sendKeys("Demouser1");
			oPage.getPassword().sendKeys("1992");
			oPage.getLogin().click();
			oPage.actiExplore().click();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser1newPwd()
	{
		try
		{
			oPage.getLogout().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginuser2newpwd()
	{
		try
		{
			oPage.getUserName().sendKeys("Demouser2");
			oPage.getPassword().sendKeys("1991");
			oPage.getLogin().click();
			oPage.actiExplore().click();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser2newPwd()
	{
		try
		{
			oPage.getLogout().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginuser3newpwd()
	{
		try
		{
			oPage.getUserName().sendKeys("Demouser3");
			oPage.getPassword().sendKeys("1990");
			oPage.getLogin().click();
			oPage.actiExplore().click();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser3newPwd()
	{
		try
		{
			oPage.getLogout().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}



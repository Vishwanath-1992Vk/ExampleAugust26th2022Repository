package com.pageobjectmodel.programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiPage {
	public ActiPage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}

	//Create WebElement for UserName field
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}

	//Create WebElement for Password Field
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}

	//Create WebElement for Login button
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}

	//Create WebElement for FlyOutWindow
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}

	//Create WebElement for Logout link
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}
	//add user
	@FindBy(linkText="USERS")
	private WebElement user;
	public WebElement clickuser()
	{
		return user;

	}
	@FindBy(xpath="//div[text()='Add User']")
	private WebElement adduser;
	public WebElement clickadduser()
	{
		return adduser;

	}
	private WebElement firstName;
	public WebElement getfirstName()
	{
		return firstName;

	}
	private WebElement middleName;
	public WebElement getmiddleName()
	{
		return middleName;

	}
	private WebElement lastName;
	public WebElement getlastName()
	{
		return lastName;

	}
	@FindBy(xpath="//input[@name='email']")
	private WebElement addemail;
	public WebElement  useremail()
	{
		return addemail;

	}
	@FindBy(xpath="//input[@name='password']")
	private WebElement userpassword;
	public WebElement getuserpwd()
	{
		return userpassword;

	}

	@FindBy(xpath="//input[@name='passwordCopy']")
	private WebElement passwordCopy;
	public WebElement getpwdcopy()
	{
		return passwordCopy;


	}

	private WebElement userDataLightBox_commitBtn;
	public WebElement createuser()
	{
		return userDataLightBox_commitBtn;


	}
	@FindBy(xpath="//span[text()='Demo, User1 A.']")
	private WebElement clickuserA;
	public WebElement clickusrA()
	{
		return clickuserA;
	}
    @FindBy(xpath="//span[text()='Save Changes']")
    private WebElement savechange;
    public WebElement savechanges()
    {
		return savechange;
    	
    }
    @FindBy(xpath="//span[text()='Start exploring actiTIME']")
    private WebElement actiexplore;
    public WebElement actiExplore()
    {
		return actiexplore;
    	
    }
    @FindBy(xpath="//span[text()='Demo, User2 B.']")
	private WebElement clickuserB;
	public WebElement clickusrB()
	{
		return clickuserB;
		
	}
	 @FindBy(xpath="//span[text()='Demo, User3 C.']")
		private WebElement clickuserC;
		public WebElement clickusrC()
		{
			return clickuserC;
			
		}
    
}



package com.qsp.genericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import com.qsp.objectRepository.LoginPageDemoWebShop;
import com.qsp.objectRepository.WelcomePageDemoWebShop;
@Listeners(ImplementationClassForListener.class)
public class BaseClassDemoWebShop {
	public static WebDriver driver;
	public WelcomePageDemoWebShop wlcm;
	public LoginPageDemoWebShop lp;
	public FileUtility prop;
	public ExcelUtility excelLib;
	public ExcelUtilityDemoWebShop excelLibDemo;
	public WebDriverUtility webdriverLib;

	@BeforeClass
	public void launchBrowser() throws IOException {
		driver = new ChromeDriver();
		prop = new FileUtility();
		String URl = prop.getDataFromProperty("url");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(URl);
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop","welcome page not displayed");

	}
	@BeforeMethod
	public void login() throws IOException
	{
		wlcm=new WelcomePageDemoWebShop(driver);
		lp=new LoginPageDemoWebShop(driver);		
		String email = prop.getDataFromProperty("email");
		String password = prop.getDataFromProperty("password");
		wlcm.getLoginLink().click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Login","login page not displayed");
		lp.getEmailTextField().sendKeys(email);
		lp.getPasswordTextField().sendKeys(password);
		lp.getLoginButton().click();
	}
	@AfterMethod
	public void logout()
	{
		wlcm=new WelcomePageDemoWebShop(driver);
		wlcm.getLogoutLink().click();
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}

}

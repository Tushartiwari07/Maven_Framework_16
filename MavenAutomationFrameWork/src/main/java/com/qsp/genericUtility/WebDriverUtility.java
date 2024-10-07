package com.qsp.genericUtility;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility 
{
	Actions act;
	public WebDriverUtility(WebDriver driver) 
	{
		act=new Actions(driver);
	}
	//Methods of actionsclass
	public void doubleClick(WebElement element)
	{
		act.doubleClick(element).perform();
	}
	public void clickAndHold(WebElement elememt)
	{
		act.clickAndHold(elememt).perform();
	}
	public void dragAndDrop(WebElement source,WebElement target)
	{
		act.dragAndDrop(source, target).perform();	
	}
	public void moveToElement(WebElement element)
	{
		act.moveToElement(element).perform();	
	}
	public void moveByOfSet(int x,int y)
	{
		act.moveByOffset(x, y).perform();
	}
	public void rightClick(WebElement element)
	{
		act.contextClick(element).perform();	
	}
	public void scrollToElement(WebElement element)
	{
		act.scrollToElement(element).perform();;
	}
	public void scrollByAmount(int x, int y)
	{
		act.scrollByAmount(x, y).perform();
	}
	
	
	
	//---------------------------switchto Window------------
	public void switchToWindow(WebDriver driver,String expUrl)
	{
		Set<String> childIds = driver.getWindowHandles();
		for(String id:childIds)
		{
			String url = driver.switchTo().window(id).getCurrentUrl();
			if(url.contains(expUrl))
			{
			  break;
			}	
	    }
	}
	
	
	//---------------------SwitchToFrame-------------------
	public void switchtoFrame(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	public void switchtoFrame(WebDriver driver,String name)
	{
		driver.switchTo().frame(name);
	}
	public void switchtoFrame(WebDriver driver,WebElement element)
	{
		driver.switchTo().frame(element);
	}
	//-----------------------------toHnadle PopUps--------------------
	public Alert switchToAlert(WebDriver driver)
	{
		return driver.switchTo().alert();
	}
	//-----------Tohandle DropDowns-------------------
	
	 Select sel;
	public WebDriverUtility(WebElement element) 
	{
		sel=new Select(element);
	
	}
	public void selectByIndex(int index)
	{
		sel.selectByIndex(index);
	}
	public void selectByValue(String value)
	{
		sel.selectByValue(value);
	}
	public void selectByVisibleText(String visibleText)
	{
		sel.selectByVisibleText(visibleText);
	}
	public void deSelectByIndex(int index)
	{
		sel.deselectByIndex(index);
	}
	public void deSelectByValue(String value)
	{
		sel.deselectByValue(value);
	}
	public void deSelectByVisibleText(String visibleText)
	{
		sel.deselectByVisibleText(visibleText);
	}
	public void deSelectAll()
	{
		sel.deselectAll();
	}
	
	
	//-----------------------ScrerenSchot----------------------
	public void getScreenShot(WebDriver driver ,String methodname) throws IOException
	{
		JavaUtility ju=new JavaUtility();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/"+methodname+ju.getSystemTime()+".png" );
		FileHandler.copy(temp, dest);

		 
		
	}



}

package com.qsp.genericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ImplementationClassForListener extends BaseClassDemoWebShop implements ITestListener
{

	@Override
	public void onTestFailure(ITestResult result) 
	{
		JavaUtility ju = new JavaUtility();
		String methodName = result.getName();
		Reporter.log("---------------TestScript is failed------",true);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/"+methodName+ju.getSystemTime()+".png" );
		try {
			FileHandler.copy(file, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	

}

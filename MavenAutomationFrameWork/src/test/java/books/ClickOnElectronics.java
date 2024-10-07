package books;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qsp.genericUtility.BaseClassDemoWebShop;
import com.qsp.genericUtility.WebDriverUtility;
import com.qsp.objectRepository.WelcomePageDemoWebShop;

public class ClickOnElectronics extends BaseClassDemoWebShop
{
	@Test
	public void clickOnComputers() throws InterruptedException
	{
		wlcm=new WelcomePageDemoWebShop(driver);
		wlcm.getComputerLink().click();
		driver.findElement(By.linkText("Accessories")).click();
		WebElement sortby = driver.findElement(By.id("products-orderby"));
		webdriverLib=new WebDriverUtility(sortby);
		webdriverLib.selectByVisibleText("Name: Z to A");
		WebElement viewmood = driver.findElement(By.id("products-viewmode"));
		webdriverLib=new WebDriverUtility(viewmood);
		webdriverLib.selectByVisibleText("List");
		WebElement lastOpt = driver.findElement(By.xpath("//a[text()='TCP Self-Paced Training additional month']/../../..//input[@value='Add to cart']"));
		webdriverLib=new WebDriverUtility(driver);
		webdriverLib.scrollToElement(lastOpt);
		Thread.sleep(3000);
		lastOpt.click();
		wlcm.getCartLink().click();
		Thread.sleep(3000);
		WebElement countrySelect = driver.findElement(By.id("CountryId"));
		webdriverLib= new WebDriverUtility(countrySelect);
		webdriverLib.selectByVisibleText("India");
		driver.findElement(By.xpath("//input[@value='Estimate shipping']")).click();
		driver.findElement(By.id("termsofservice")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("checkout")).click();
		WebElement selectAddress = driver.findElement(By.id("billing-address-select"));
		webdriverLib=new WebDriverUtility(selectAddress);
		webdriverLib.selectByVisibleText("New Address");
		Thread.sleep(3000);
		driver.findElement(By.id("BillingNewAddress_Company")).sendKeys("Tiwari's.PVT");
		WebElement billingcountry = driver.findElement(By.id("BillingNewAddress_CountryId"));
		webdriverLib=new WebDriverUtility(billingcountry);
		webdriverLib.selectByVisibleText("India");
		driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Bengaluru");
		driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("BTM LAYOUT");
		driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("560076");
		driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("8073396567");
		driver.findElement(By.id("BillingNewAddress_FaxNumber")).sendKeys("2927");
		driver.findElement(By.xpath("//div[@id='billing-buttons-container']")).click();
		driver.findElement(By.id("billing-buttons-container")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("PickUpInStore")).click();
		 
		
		
		
		
	}

}

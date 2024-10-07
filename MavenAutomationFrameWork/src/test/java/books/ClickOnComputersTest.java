package books;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qsp.genericUtility.BaseClassDemoWebShop;
import com.qsp.genericUtility.WebDriverUtility;
import com.qsp.objectRepository.WelcomePageDemoWebShop;

public class ClickOnComputersTest extends BaseClassDemoWebShop
{
	@Test
	public void clickOnComputers()
	{
		webdriverLib=new WebDriverUtility(driver);
		wlcm=new WelcomePageDemoWebShop(driver);
		webdriverLib.moveToElement(wlcm.getComputerLink());
		driver.findElement(By.partialLinkText("Desktops")).click();
		WebElement sortSelect = driver.findElement(By.id("products-orderby"));
		webdriverLib=new WebDriverUtility(sortSelect);
		webdriverLib.selectByVisibleText("Price: High to Low");
		WebElement pageSizeSelect = driver.findElement(By.id("products-pagesize"));
		webdriverLib=new WebDriverUtility(pageSizeSelect);
		webdriverLib.selectByVisibleText("12");
		
		WebElement viweMode = driver.findElement(By.id("products-viewmode"));
		webdriverLib=new WebDriverUtility(viweMode);
		webdriverLib.selectByVisibleText("List");
		driver.findElement(By.xpath("(//span[text()='1200.00'])[1]")).click();
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		WebElement cart = driver.findElement(By.id("add-to-cart-button-16"));
		webdriverLib=new WebDriverUtility(driver);
		webdriverLib.scrollToElement(cart);
		cart.click();
		wlcm.getCartLink().click();
//		wlcm.getComputerLink().click();
//		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Computers");
	}

}

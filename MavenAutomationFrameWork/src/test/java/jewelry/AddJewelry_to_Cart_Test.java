package jewelry;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.qsp.genericUtility.BaseClassDemoWebShop;

public class AddJewelry_to_Cart_Test extends BaseClassDemoWebShop
{
	@Test
	public void addJewelryToCart() throws InterruptedException
	{
		wlcm.getJewelryLink().click();
		driver.findElement(By.xpath("//a[text()='Create Your Own Jewelry']/../..//input[@value='Add to cart']")).click();
		driver.findElement(By.id("product_attribute_71_10_16")).sendKeys("10");
		driver.findElement(By.id("add-to-cart-button-71")).click();
		wlcm.getCartLink().click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("product_attribute_71_10_16")).sendKeys("18");
		driver.findElement(By.id("add-to-cart-button-71")).click();
		

		
	}

}

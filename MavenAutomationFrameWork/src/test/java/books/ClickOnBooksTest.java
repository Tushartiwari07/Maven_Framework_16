package books;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.qsp.genericUtility.BaseClassDemoWebShop;
import com.qsp.genericUtility.ExcelUtilityDemoWebShop;
import com.qsp.objectRepository.WelcomePageDemoWebShop;
public class ClickOnBooksTest extends BaseClassDemoWebShop
{
	@Test
	public void clickOnBooks() throws EncryptedDocumentException, IOException
	{
		wlcm=new WelcomePageDemoWebShop(driver);
		wlcm.getBooksLink().click();
		String expectedTitle = driver.getTitle();
		excelLibDemo=new ExcelUtilityDemoWebShop();
		String actualTitle = excelLibDemo.getStringDataFromExcel("Books", 1, 0);
		Assert.assertEquals(actualTitle,expectedTitle," Books page not displayed");
		Reporter.log("Books page displayed Successfullly ",true);
	}

}
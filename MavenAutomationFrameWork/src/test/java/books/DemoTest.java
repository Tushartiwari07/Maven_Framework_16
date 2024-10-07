package books;

import org.testng.annotations.Test;

import com.qsp.genericUtility.BaseClassDemoWebShop;
import com.qsp.genericUtility.WebDriverUtility;

public class DemoTest extends BaseClassDemoWebShop
{
	@Test
	public void rightClick()
	{
		webdriverLib=new WebDriverUtility(driver);
		webdriverLib.rightClick(wlcm.getBooksLink());
	}
	
	

}

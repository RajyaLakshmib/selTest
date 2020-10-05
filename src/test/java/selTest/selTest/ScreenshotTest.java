package selTest.selTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import selTest.selTest.*;

import junit.framework.Assert;
@Listeners(CustomListener.class)
public class ScreenshotTest extends Base {
	
	@BeforeTest
	public void setup() {
		initialization();
	}
	
	@Test
	public void takeScreenshotTest() {
		Assert.assertEquals(false, true);
		
	}
	@AfterTest	
	public void tearDown() {
		driver.quit();
	}

}

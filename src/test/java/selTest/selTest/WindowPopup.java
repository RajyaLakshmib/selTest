package selTest.selTest;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowPopup {
	
	@Test
	public void windowPOPupMethod() {
		
		//System.setProperty("webdriver.chrome.driver",".exe path");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Multi-PopUp Test")));
		driver.findElement(By.linkText("Multi-PopUp Test")).click();
		Set<String> windowhandle =driver.getWindowHandles();
		System.out.println(windowhandle.size());
		Iterator<String> iterat =windowhandle.iterator();
		String parent = iterat.next();
		while(iterat.hasNext()) {
			driver.switchTo().window(iterat.next());
			driver.close();
		}
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		
		
		
		
	}

}

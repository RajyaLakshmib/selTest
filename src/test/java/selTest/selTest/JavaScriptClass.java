package selTest.selTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptClass {
	
	@Test
	public void javaScriptMethods() throws IOException, InterruptedException {
		
		//System.setProperty("Webdriver.chrome.driver",".exe path");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		
	JavascriptExecutor js = ((JavascriptExecutor)driver);
	Thread.sleep(10000);
	js.executeScript("history.go(0)");
	Thread.sleep(5000);
	
	System.out.println(js.executeScript("return document.title;"));
	Thread.sleep(5000);
	//js.executeScript("arguments[0].style.border = '3px solid red'", "//input[@value = 'Google Search']");
	//js.executeScript("alert('aaaa')");
	driver.findElement(By.xpath("//input[@title = 'Search']")).sendKeys("abc");
	js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@value = 'Google Search']")));
File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src, new File("C:\\Users\\Rajya Lakshmi\\eclipse-workspace\\selTest"));

				
		
	}

}

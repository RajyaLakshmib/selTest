package selTest.selTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	public static void initialization() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
	}
	
	public void failed(ITestResult result) throws IOException {
	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(src,new File("C:\\Users\\Rajya Lakshmi\\eclipse-workspace\\selTest\\src\\test\\java\\selTest\\selTest\\testcases.jpg"));
	}

}

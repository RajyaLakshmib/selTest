package selTest.selTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bootstrap {
	
	@Test
	public void selectDropDown() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver",".exe file path");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=6.0_4");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("//button[contains(@class,\"btn-primary\")]"));
		ele.click();
		
		List<WebElement> listele = driver.findElements(By.xpath("//div[contains(@class,\"bootstrap-select\")]//div//ul//li"));
		System.out.println(listele.size());
		
		for(int i=0;i<listele.size();i++) {
			System.out.println(listele.get(i).getText());
			if(listele.get(i).getText().equals("JavaScript"))
			{
				System.out.println("loop: "+listele.get(i).getText());
			listele.get(i).click();
			Thread.sleep(5000);
			System.out.println(listele.get(i).isSelected());
			}
			
			
		}
		
		
	}

}

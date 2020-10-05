package selTest.selTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestivedropdowm {
	
	@Test
	public void autosel() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		WebElement web1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
		web1.clear();
		web1.sendKeys("mum");
		Thread.sleep(3000);
		web1.sendKeys(Keys.ENTER);
		
		
		WebElement web2 = driver.findElement(By.xpath("//*[@id='toCity']"));
		web2.clear();
		web2.sendKeys("del");
		Thread.sleep(3000);
		web2.sendKeys(Keys.ARROW_DOWN);
		web2.sendKeys(Keys.ENTER);
		
		
		
				
		
		
	}

}

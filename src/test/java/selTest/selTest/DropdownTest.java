package selTest.selTest;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownTest {
	
	@Test
	public void test1() {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://spicejet.com");
		driver.findElement(By.className("select_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value = 'MAA']")).click();
		driver.findElement(By.xpath("(//a[@value = 'BLR'])[1]")).click();
		
		
	}

}

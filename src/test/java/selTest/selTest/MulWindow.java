package selTest.selTest;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MulWindow {
	
	@Test
	public void method() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signup");
		//driver.wait(100000);
		//driver.switchTo().frame(1);
		driver.findElement(By.linkText("Privacy")).click();
		
		//count of links
		 
				int count = driver.findElements(By.tagName("a")).size();
				
				WebElement footer = driver.findElement(By.id(""));
				int s = footer.findElements(By.tagName("a")).size();
		
		Set<String> id = driver.getWindowHandles();
		java.util.Iterator<String> inte = id.iterator();
		String parent = inte.next();
		String child = inte.next();
		System.out.println(parent+" "+child);
		driver.switchTo().window(child);
		
		
		
	}

}

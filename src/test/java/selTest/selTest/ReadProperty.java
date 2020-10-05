package selTest.selTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadProperty {
	
	Properties prop;
	FileInputStream fis;
	
	@Test
	public void readpropMethod() throws IOException {
		
		prop = new Properties();
		fis  = new FileInputStream("C:\\Users\\Rajya Lakshmi\\eclipse-workspace\\selTest\\src\\test\\java\\selTest\\selTest\\config.properties");
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("name"));
		
	}

}

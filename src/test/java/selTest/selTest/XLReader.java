package selTest.selTest;

import java.io.IOException;

import org.testng.annotations.Test;

public class XLReader {
	
	@Test
	public void xlsMethod() throws IOException {
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\Rajya Lakshmi\\Desktop\\xlssheettest.xlsx");
		
		reader.addSheet("Rajya");
		reader.setData("Rajya");
	}

}

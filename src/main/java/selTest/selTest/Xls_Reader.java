package selTest.selTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_Reader {
	
	public String path;
	
	public FileInputStream fis = null;
	public FileOutputStream fos = null;
	public XSSFWorkbook workbook = null;
	public XSSFSheet sheet = null;
	public XSSFRow row= null;
	public XSSFCell cell = null;
	
	Xls_Reader(String path) throws IOException{
		
		this.path = path;
		
		fis = new FileInputStream(path);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);
		fis.close();
		
		
		
	}
	public void addSheet(String sheetName) throws IOException {
		FileOutputStream fos =null;
		workbook.createSheet(sheetName);
		fos = new FileOutputStream(path);
		workbook.write(fos);
		fos.close();
		
	}
	
	
	public void removeSheet(String sheet) throws IOException {
		int index = workbook.getSheetIndex(sheet);
		FileOutputStream fos =null;
		workbook.removeSheetAt(index);
		workbook.write(fos);
		fos.close();
		
	}
	
	public void setData(String sheetName) throws IOException {
		int index = workbook.getSheetIndex(sheetName);
		sheet = workbook.getSheetAt(index);
		row = sheet.createRow(0);
		int rownum = row.getRowNum();
		int colnum = row.getFirstCellNum();
		 cell = row.createCell(1);
		 cell.setCellValue("abc");
		 FileOutputStream fos = new FileOutputStream(path);
		 workbook.write(fos);
		 fos.close();
		 
		
		
	}
	

}

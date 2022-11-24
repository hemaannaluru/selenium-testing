package internalfile;//scenario 1

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class dd1_amazonpage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("C:\\Users\\hema\\Downloads\\datadriven.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("sheet1");
		Row r=null;
		Cell c=null;
		String baseurl="http://www.amazon.com";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hema\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver d=new ChromeDriver();
		d.get(baseurl);
		d.manage().window().maximize();
		
		WebElement drop=d.findElement(By.id("searchDropdownBox"));
		List<WebElement>drop1=drop.findElements(By.tagName("option"));
		System.out.println(drop1.size());
		for(int i=0;i<drop1.size();i++) {
			System.out.println(drop1.get(i).getText());//to print all the dropdown elememnts
			r=ws.createRow(i);//creating rows //how many rows=no.of dropdown elements
			r.createCell(0).setCellValue(drop1.get(i).getText());//creating 0Th column and entering elements
		drop1.get(i).click();//clicking on every element
		if(!drop1.get(i).isSelected()) {//if element is not entered in 0th column
			r.createCell(1).setCellValue("fail");//display fail in frst column
			
		}
		else {
			r.createCell(1).setCellValue("pass");
		}
			
			
		}
		FileOutputStream f2=new FileOutputStream("C:\\Users\\hema\\Downloads\\datadriven.xlsx");//writing all the data
		wb.write(f2);
		f2.close();
		
		
		

	}

}

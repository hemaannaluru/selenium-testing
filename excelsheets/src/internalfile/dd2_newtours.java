package internalfile;

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

public class dd2_newtours {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream f=new FileInputStream("C:\\Users\\hema\\Downloads\\dd_2newtours.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Row r=null;
		Cell c=null;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hema\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver d=new ChromeDriver();
	    d.get("https://demo.guru99.com/test/newtours/");
	    d.manage().window().maximize();
	    WebElement b=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
	    List<WebElement>a=b.findElements(By.tagName("a"));
	    System.out.println(a.size());
	    for(int i=0;i<a.size();i++) {
	    	System.out.println(a.get(i).getText());
	    	//a.get(i).click();
	    	//d.navigate().back();
	    	//Thread.sleep(2000);
	    	r=ws.createRow(i);
	    	r.createCell(0).setCellValue(a.get(i).getText());
	    	if(!a.get(i).isSelected()) {
	    		r.createCell(1).setCellValue("fail");
	    	}
	    	else {
	    		r.createCell(1).setCellValue("pass");
	    	}
	    }
	    FileOutputStream f1=new FileOutputStream("C:\\Users\\hema\\Downloads\\dd_2newtours.xlsx");
		wb.write(f1);
		f1.close();

	}

}

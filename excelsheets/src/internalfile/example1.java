package internalfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
		FileInputStream f=new FileInputStream("C:\\Users\\hema\\Documents\\java programs\\excelsheets\\src\\internalfile\\p1.properties");
		Properties p2=new Properties();
		p2.load(f);
		d.findElement(By.name("userName")).sendKeys(p2.getProperty("username"));
		d.findElement(By.name("password")).sendKeys(p2.getProperty("password"));
		//d.findElement(By.name("submit")).click();
		d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();	
		pom2 p1=new pom2(d);	
		p1.uname();
		p1.password();
		p1.confirm();
		File a1=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(a1, new File("C:\\Users\\hema//shot1.png"));
		FileInputStream f1=new FileInputStream("C:\\Users\\hema\\Downloads\\practice1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f1);
		XSSFSheet ws=wb.getSheet("sheet1");
		Row r=null;
		Cell c=null;
	
		WebElement b=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select"));
		List<WebElement>a=d.findElements(By.tagName("option"));
		System.out.println(a.size());
		for(int i=1;i<a.size();i++) {
			System.out.println(a.get(i).getText());
			r=ws.createRow(i);
			r.createCell(0).setCellValue(a.get(i).getText());
			a.get(i).click();
			if(!a.get(i).isSelected()) {
				r.createCell(1).setCellValue("fail");
				
			}
			else {
				r.createCell(1).setCellValue("pass");
			}
			
			
			}
		
		FileOutputStream f2=new FileOutputStream("C:\\Users\\hema\\Downloads\\practice1.xlsx");
		wb.write(f2);
		
		}
	    
		

	}



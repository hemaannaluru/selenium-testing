package internalfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class readdata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("C:\\Users\\hema\\Documents\\java programs\\excelsheets\\src\\internalfile\\p1.properties");
		Properties p1=new Properties();
		p1.load(f);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hema\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		ChromeDriver d=new ChromeDriver();
		d.get(p1.getProperty("url"));
		System.out.println("url");
		d.manage().window().maximize();
		d.findElement(By.name("username")).sendKeys(p1.getProperty("username"));
		System.out.println(p1.getProperty("username"));
		d.findElement(By.name("password")).sendKeys(p1.getProperty("password"));
		System.out.println(p1.getProperty("password"));
		d.findElement(By.name("submit")).click();
		
		
		
		

	}

}

package sample;//amazon //screenshot //switch case

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.*
;public class s12 {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		switch(s) {
		case "ChromeDriver":
			System.setProperty("webdriver.chrome.driver","C:\\Users\\hema\\Downloads\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver d=new ChromeDriver();
			d.get("http://www.amazon.com");
			d.manage().window().maximize();
			d.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")).click();
			WebElement b=d.findElement(By.xpath("//*[@id=\"searchDropdownBox\"])"));
			File a1=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(a1, new File("downloads://new2.png"));
			
		case "FirefoxDriver":
			System.setProperty("webdriver.Firefox.driver", "C:\\Users\\hema\\Downloads\\Firefox Setup 36.0b6\\Firefox Setup 36.0b6.exe");
			FirefoxDriver d1=new FirefoxDriver();
			d1.get("http://www.amazon.com");
			d1.manage().window().maximize();
			d1.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")).click();
			WebElement f=d1.findElement(By.xpath("//*[@id=\"searchDropdownBox\"])"));
			File a2=((TakesScreenshot)d1).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(a2, new File("C://downloads://new2.png"));
			
		}
		
		
		
		

	}

}

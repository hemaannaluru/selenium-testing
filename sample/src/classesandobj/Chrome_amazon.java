package classesandobj;//using classes and objects

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_amazon {
	WebDriver d;
	public void open_chrome() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hema\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		ChromeDriver d=new ChromeDriver();
		d.get("http://www.amazon.com");
		d.manage().window().maximize();
	}
	public void getTitle() {
		System.out.println(d.getTitle());
	}
	public void getCurrentUrl() {
		System.out.println(d.getCurrentUrl());
	}
	public void Dropdowncount() {
		
		WebElement a=d.findElement(By.id("searchDropdownBox"));
		List<WebElement> a1=a.findElements(By.tagName("option"));
		System.out.println(a1.size());
		for(int i=1;i<=a1.size();i++) {
			System.out.println(a1.get(i).getText());
		}
	}
     public void screenshot() throws IOException {
    	 
    	 File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
    	 FileUtils.copyFile(src, new File("C://sc.png"));
     }
     public void close() {
   
    	 d.close();
     }
	public static void main(String[] args) throws IOException {
		Chrome_amazon ob=new Chrome_amazon();
		ob.open_chrome();
		ob.getTitle();
		ob.getCurrentUrl();
		ob.Dropdowncount();
		ob.screenshot();
		ob.close();
	  

	}

}

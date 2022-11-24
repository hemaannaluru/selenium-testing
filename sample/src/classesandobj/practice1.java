package classesandobj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 {
		
	
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hema\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com");
		d.manage().window().maximize();
		d.switchTo().frame(0);
		WebElement ele=d.findElement(By.xpath("//img[@alt='Electronics']"));
		ele.click();
		
		
	}

}

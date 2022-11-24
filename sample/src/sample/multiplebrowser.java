package sample;//multiplebrowser //checkboxes
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class multiplebrowser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		switch(s) {
		case "ChromeDriver":
			System.setProperty("webdriver.chrome.driver","C:\\Users\\hema\\Downloads\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver d=new ChromeDriver();
			d.get("https://echoecho.com/htmlforms09.htm");
			d.manage().window().maximize();
			WebElement check=d.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
			List<WebElement> b=d.findElements(By.tagName("input"));
			System.out.println(b.size());
			for(int i=0;i<b.size();i++) {    //attritube name                       //true or false
				System.out.println(b.get(i).getAttribute("checked")+" "+b.get(i).getAttribute("value"));
				
			}
		case "FirefoxDriver":
			System.setProperty("webdriver.firefox.driver","\"C:\\Users\\hema\\Downloads\\Firefox Setup 35.0.exe\"");
			FirefoxDriver d1=new FirefoxDriver();
			d1.get("https://echoecho.com/htmlforms11.htm");
			d1.manage().window().maximize();
			
			
		}
		

	}

}

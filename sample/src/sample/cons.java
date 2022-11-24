package sample;//using constructors entering username and password

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class A{
	WebDriver d;
	A() throws InterruptedException{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\hema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 d=new ChromeDriver();
		 d.get("https://demo.guru99.com/test/newtours/");
		 d.manage().window().maximize();
		 d.findElement(By.name("userName")).sendKeys("selenium");
		 d.findElement(By.name("password")).sendKeys("welcome123");
		 Thread.sleep(2000);
		 d.findElement(By.name("submit")).click();
		
	}
	A(String url,String uname,String pass) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 d=new ChromeDriver();
		 d.get(url);
		 d.manage().window().maximize();
		 d.findElement(By.name("userName")).sendKeys(uname);
		 d.findElement(By.name("password")).sendKeys(pass);
		 Thread.sleep(2000);
		 d.findElement(By.name("submit")).click();

		 
		
	}
}

public class cons {

	public static void main(String[] args) throws InterruptedException {
		//A ob=new A();
		A ob=new A("https://demo.guru99.com/test/newtours/","selenium","welcome");
		
		

	}

}

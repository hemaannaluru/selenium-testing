package sample;//working with functions

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class functions {
	WebDriver d;
      /*public void open_browser() throws InterruptedException {
    	  System.setProperty("webdriver.chrome.driver","C:\\Users\\hema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 d=new ChromeDriver();
		 d.get("https://demo.guru99.com/test/newtours/");
		 d.manage().window().maximize();
			d.findElement(By.name("userName")).sendKeys("selenium");
			d.findElement(By.name("password")).sendKeys("welcome");
			Thread.sleep(2000);
			d.findElement(By.name("submit")).click();
      }*/
	public void details(String uname,String pword) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\hema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 d=new ChromeDriver();
		 d.get("https://demo.guru99.com/test/newtours/");
		 d.manage().window().maximize();
			d.findElement(By.name("userName")).sendKeys(uname);
			d.findElement(By.name("password")).sendKeys(pword);
			Thread.sleep(2000);
			d.findElement(By.name("submit")).click();
		
	}
	public static void main(String[] args) throws InterruptedException {
		functions ob=new functions();
		//ob.open_browser();   //without args //without returnn type
		//ob.details("selenium", "welcome");   //without return type //with args

	}

}

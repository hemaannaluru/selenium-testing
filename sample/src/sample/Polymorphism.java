package sample;//polymorphism

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Polymorphism {
	static ChromeDriver d;
	public void details(String a) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get(a);
		d.manage().window().maximize();
	}
	public void details() throws InterruptedException {
		Thread.sleep(2000);
		d.findElement(By.name("userName")).sendKeys("selenium");
		d.findElement(By.name("password")).sendKeys("welcome");
		Thread.sleep(2000);
		d.findElement(By.name("submit")).click();
	}
   public void details(String uname,String pass) throws InterruptedException {
	   Thread.sleep(2000);
	   d.findElement(By.xpath("//input[@name='userName']")).sendKeys(uname);
	   d.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
	   Thread.sleep(2000);
	   d.findElement(By.xpath("//input[@name='submit']")).click();
   }
	public static void main(String[] args) throws InterruptedException {
		Polymorphism p=new Polymorphism();
		p.details("https://demo.guru99.com/test/newtours/");
		//p.details();
		p.details("hello","world");
		
		
		
		

	}

}

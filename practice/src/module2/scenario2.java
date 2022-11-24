package module2;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class scenario2 {
	WebDriver d;
	public void Opening_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		d=new ChromeDriver();
		
		
	}
	public void Navigate() {
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
		
	}
	public void usernameenter() {
		d.findElement(By.name("userName")).sendKeys("hema");

	}
	public void passwordenter() {
		d.findElement(By.name("password")).sendKeys("123");
	}
	public void click() {
		d.findElement(By.name("submit")).click();
	}
	public void close() {
		d.close();
	}


}

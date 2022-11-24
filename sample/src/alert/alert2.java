package alert;//confirmation

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert2 {
	WebDriver d;
	public void open_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hema\\Downloads\\chromedriver_win32\\chromedriver.exe" );
        d=new ChromeDriver(); 
		d.get("https://demoqa.com/alerts");
		d.manage().window().maximize();
	}
	public void title() {
		System.out.println(d.getTitle());
		
	}
	public void geturl() {
		System.out.println(d.getCurrentUrl());
	}
	public void Confirmation_window() throws InterruptedException {
		d.findElement(By.id("confirmButton")).click();
		Alert alt=d.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();
		WebElement s=d.findElement(By.id("confirmResult"));
		System.out.println(s.getText());
		
	}
	public void close() {
		d.close();
	}
	public static void main(String[] args) throws InterruptedException {
		alert2 ob=new alert2();
		ob.open_browser();
		ob.title();
		ob.geturl();
		ob.Confirmation_window();
		ob.close();
		
	}

}

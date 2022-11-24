package alert;//alert message

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alt1 {
	WebDriver d;
	public void open_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hema\\Downloads\\chromedriver_win32\\chromedriver.exe" );
        d=new ChromeDriver(); 
		d.get("https://demoqa.com/alerts");
		d.manage().window().maximize();
		
		
	}
	public void title() {
		String a=d.getTitle();
		System.out.println(a);
	}
	public void CurrentUrl() {
		String a1=d.getCurrentUrl();
		System.out.println(a1);
	}
	public void alert_msg() throws InterruptedException {
		d.findElement(By.id("alertButton")).click();
		Alert alt=d.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();//to click ok
		
	}
	public void close() {
		d.close();
	}
	public static void main(String[] args) throws InterruptedException {
		alt1 ob=new alt1();
		ob.open_browser();
		ob.title();
		ob.CurrentUrl();
		ob.alert_msg();
		ob.close();
		
	}

}

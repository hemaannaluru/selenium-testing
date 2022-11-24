package alert;//prompt msgs

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert3 {
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
	public void prompt_window() throws InterruptedException {
		d.findElement(By.xpath("//button[@id='promtButton']")).click();
		Alert alt=d.switchTo().alert();
		System.out.println(alt.getText());
		alt.sendKeys("welcome to selenium");
		Thread.sleep(2000);
		alt.accept();
		
	}
	public static void main(String[] args) throws InterruptedException {
		alert3 ob=new alert3();
		ob.open_browser();
		ob.title();
		ob.geturl();
		ob.prompt_window();
	}

}

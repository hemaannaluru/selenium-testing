package classesandobj;//sendkeys

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hema\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		ChromeDriver d=new ChromeDriver();
		d.get("https://demoqa.com/text-box");
		d.findElement(By.xpath("//input[@id='userName']")).sendKeys("hema");
		d.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("annaluruhema@gmail.com");
		d.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys(" kavali   ,  pbrvits   ");
		d.findElement(By.xpath("//*[@id='permanentAddress']")).sendKeys("kavali   ,visvodaya   ");
		//d.findElement(By.id("permanentAddress")).sendKeys("kavali ,visvodaya  ");
		Thread.sleep(2000);
		WebElement t=d.findElement(By.xpath("//*[@id='submit']"));
		t.click();
		String s=d.findElement(By.xpath("//*[@id=\'output\']/div")).getText();
		System.out.println(s);
	
	}

}

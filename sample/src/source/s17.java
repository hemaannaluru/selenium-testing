package source;//date picker

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class s17 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://jqueryui.com/datepicker/");
		d.manage().window().maximize();
		
		d.switchTo().frame(0);
		d.findElement(By.xpath("//input[@id=\"datepicker\"]")).click();
		d.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[7]/a")).click();
		

	}

}

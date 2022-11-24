package source;//slider

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class s16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://jqueryui.com/slider/");
		d.manage().window().maximize();
		d.switchTo().frame(0);
		WebElement b=d.findElement(By.id("slider"));
		Actions act=new Actions(d);
		int y=b.getLocation().y;//get loaction of y which location b
		act.dragAndDropBy(b, y, 500).build().perform();       //(which one,source,dest)
		
		

	}

}

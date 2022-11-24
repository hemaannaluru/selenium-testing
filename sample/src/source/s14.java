package source;//drag and drop

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class s14 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://jqueryui.com/droppable/");
		d.manage().window().maximize();
		d.switchTo().frame(0);
		WebElement drag=d.findElement(By.id("draggable"));
		WebElement drop=d.findElement(By.id("droppable"));
		Actions Act=new Actions(d);
		Act.dragAndDrop(drag, drop).build().perform();
		

	}

}

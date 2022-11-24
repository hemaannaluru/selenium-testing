package sample;//checkboxe

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://echoecho.com/htmlforms09.htm");
		d.manage().window().maximize();
		WebElement check=d.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement> b=d.findElements(By.tagName("input"));
		System.out.println(b.size());
		for(int i=0;i<b.size();i++) {    //attritube name                       //true or false
			System.out.println(b.get(i).getAttribute("checked")+" "+b.get(i).getAttribute("value"));
			
		}

	}

}

package sample;//dropdown list


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/login.php");
		d.manage().window().maximize();
		d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();//to go to selenium
		WebElement a=d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul"));//to go for dropdown
		List<WebElement> b=d.findElements(By.tagName("a"));
		System.out.println(b.size());//returns size
		for(int i=0;i<b.size();i++)
		{
			System.out.println(b.get(i).getText());  //get(i)=location getText()=name of element
			
		}
		
	}

}

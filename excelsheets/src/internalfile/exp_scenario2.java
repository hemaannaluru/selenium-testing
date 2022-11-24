package internalfile;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exp_scenario2 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver d;
   System.setProperty("webdriver.chrome.driver","C:\\Users\\hema\\Downloads\\chromedriver_win32\\chromedriver.exe");
       d=new ChromeDriver();
       String expurl="https://www.toolsqa.com/";
       //String baseurl="https://www.toolsqa.com/";
       d.get("https://www.toolsqa.com/");
       d.manage().window().maximize();
       WebElement b=d.findElement(By.xpath("/html/body/header/nav/div/div/div[3]/div"));
       List<WebElement>a=b.findElements(By.tagName("a"));
       System.out.println(a.size());
       for(int i=0;i<a.size();i++) {
    	   System.out.println(a.get(i).getText());
    	   a.get(i).click();
    	   String act=d.getCurrentUrl();
    	   System.out.println(act);
    	   if(expurl.equalsIgnoreCase(act)) {
        	   System.out.println("similar url");
        	   
           }
           else {
        	   System.out.println("not similar");
           }
    	   Thread.sleep(2000);
    	   d.navigate().back();
    	   Thread.sleep(2000);
    	   b=d.findElement(By.xpath("/html/body/header/nav/div/div/div[3]/div"));
    	   a=b.findElements(By.tagName("a"));
       
	}
}
}


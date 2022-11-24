package alert;//frames  //nested frames

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hema\\Downloads\\chromedriver_win32\\chromedriver.exe" );
        ChromeDriver d=new ChromeDriver(); 
        //d.get("https://www.dezlearn.com/iframe-example/");
        d.get("https://www.dezlearn.com/nested-iframes-example/");
        d.manage().window().maximize();
        d.switchTo().frame("parent_iframe");
        d.findElement(By.id("u_5_5")).click();
        Thread.sleep(2000);
        WebElement b=d.findElement(By.id("processing"));
        System.out.println(b.getText());
        //child frame
        d.switchTo().frame("iframe1");
        d.findElement(By.id("u_5_6")).click();
        Thread.sleep(2000);
        WebElement c=d.findElement(By.id("processing"));
        System.out.println(c.getText());
        
        
	}

}

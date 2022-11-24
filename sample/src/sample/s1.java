package sample;

import org.openqa.selenium.chrome.ChromeDriver;

public class s1 {

	public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\hema\\Downloads\\chromedriver_win32\\chromedriver.exe");
       ChromeDriver d=new ChromeDriver();
       d.get("http:\\www.google.com");
       System.out.println(d.getTitle());
       System.out.println(d.getCurrentUrl());
       Thread.sleep(2000);
       d.close();
      
	}

}

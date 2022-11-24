package sample;//commands

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class s2 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\hema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 ChromeDriver d=new ChromeDriver();
		 //opening page
		 d.get("http:\\www.amazon.com");
		 //maximizing window
		 d.manage().window().maximize();
		 //to get a title of page
		 System.out.println(d.getTitle());
		 //to get the current url
		 System.out.println(d.getCurrentUrl());
		 d.findElement(By.id("searchDropdownBox")).sendKeys("Deals");//we have inspect the element
		 d.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops");
		 d.findElement(By.id("nav-search-submit-button")).click();
		 boolean selected=d.findElement(By.id("nav-search-submit-button")).isSelected();
		 System.out.println(selected);
		 boolean enabled=d.findElement(By.id("nav-search-submit-button")).isEnabled();
		 System.out.println(enabled);
		 boolean displayed=d.findElement(By.id("nav-search-submit-button")).isDisplayed();
		 System.out.println(displayed);
	}

}

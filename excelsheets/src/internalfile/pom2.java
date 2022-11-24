package internalfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pom2 {
	WebDriver d;
	By uname=By.name("email");
	By pass=By.name("password");
	By cpass=By.name("confirmPassword");
	pom2(WebDriver d){
		this.d=d;
	}
	public void uname() {
		d.findElement(uname).sendKeys("hema");	
	}
	public void password() {
		d.findElement(pass).sendKeys("123");
	}
	public void confirm() {
		d.findElement(cpass).sendKeys("123");
		
	}
	

}

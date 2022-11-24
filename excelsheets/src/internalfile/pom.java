package internalfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pom {
	WebDriver d;//related to application
	By username=By.name("userName");
	By password=By.name("password");
	By button=By.name("submit");
	pom(WebDriver d){
		this.d=d;   
	}
	public void uname() {
		d.findElement(username).sendKeys("hello");
	}
	public void password() {
		d.findElement(password).sendKeys("123");
	}
	public void signon() {
		d.findElement(button).click();
	}

}

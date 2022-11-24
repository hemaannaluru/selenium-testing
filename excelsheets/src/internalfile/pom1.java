package internalfile;//object repostry

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pom1 {
	WebDriver d;
	By lname=By.name("lastName");
	By fname=By.name("firstName");
	By phone=By.name("phone");
	By uname=By.name("userName");
	By cont=By.name("country");
	pom1(WebDriver d){
		this.d=d;
	}
	public void firstname() {
		d.findElement(fname).sendKeys("testing123");
	}
	public void lastname() {
		d.findElement(lname).sendKeys("selenium");
	}
	public void phnumber() {
		d.findElement(phone).sendKeys("9865231234");
	}
	public void Email() {
		d.findElement(uname).sendKeys("testing1243");
	}
	public void country() {
		d.findElement(cont).sendKeys("india");
	}
	

}

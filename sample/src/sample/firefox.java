package sample;

import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

	public static void main(String[] args) {
		//System.setProperty("webdriver.firefox.driver","C:\\Users\\hema\\Downloads\\Firefox Setup 35.0.exe");
		FirefoxDriver d=new FirefoxDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();

	}

}

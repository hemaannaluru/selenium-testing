package internalfile;

import org.openqa.selenium.chrome.ChromeDriver;

public class calling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hema\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver d=new ChromeDriver();
	    String baseurl="https://demo.guru99.com/test/newtours/";
	    d.get(baseurl);
	    d.manage().window().maximize();
	    pom a1=new pom(d);
	    a1.uname();
	    a1.password();
	    a1.signon();

	}

}

package internalfile;

import org.openqa.selenium.chrome.ChromeDriver;

public class calling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hema\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver d=new ChromeDriver();
	    String baseurl="https://demo.guru99.com/test/newtours/register.php";
	    d.get(baseurl);
	    d.manage().window().maximize();
	    pom1 ob=new pom1(d);
	    ob.firstname();
	    ob.lastname();
	    ob.phnumber();
	    ob.Email();
	    ob.country();


	}

}

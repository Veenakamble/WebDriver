package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcommand {

	public static void main(String[] args) throws Throwable {
		//to create instant object
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.monster.com/geo/siteselection");
		Thread.sleep(5000);
		//print title and length of title
		String pagetitle=driver.getTitle();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		//print url and length of url
		String strurl=driver.getCurrentUrl();
		System.out.println(strurl);
		System.out.println(strurl.length());
		driver.close();
	}
}	

	
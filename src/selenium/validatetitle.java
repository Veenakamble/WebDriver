package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class validatetitle {

	public static void main(String[] args) throws Throwable {
		//to create instant object
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		String expected="google";
		String actual=driver.getTitle();
		if(expected.equalsIgnoreCase(actual))
		{
			System.out.println("title is matching::"  +expected+"  "+actual);
			}
		else
		{
			System.out.println("title is not matching::"  +expected+" "+actual);
		}
		driver.close();
	}

}

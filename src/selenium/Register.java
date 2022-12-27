package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("http://flight.qedgetech.com");
	Thread.sleep(5000);
	//click register link
	driver.findElement(By.partialLinkText("Regist")).click();
	
	
	

	}

}

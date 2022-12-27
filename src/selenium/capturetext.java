package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class capturetext {

	public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");	
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 driver.get("http://google.com");
	 Thread.sleep(5000);
	 String variable=driver.findElement(By.partialLinkText("Gm")).getText();
	 System.out.println(variable);
	 String element=driver.findElement(By.partialLinkText("Gm")).getAttribute("href");
	 System.out.println(element);
	 driver.quit();
	 
	 

	}

}

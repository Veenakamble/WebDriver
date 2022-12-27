package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) throws Throwable {
		// TO create instance object
		System.setProperty("WebDriver.chrome.driver","D:/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("http://google.com");
		Thread.sleep(5000);
		driver.quit();

	}

}

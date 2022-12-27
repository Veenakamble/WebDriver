package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws Throwable {
		// TO create instance object
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("#txtuId")).sendKeys("Veena");
		driver.findElement(By.id("#txtPword")).sendKeys("Sree");
		driver.findElement(By.name("Login")).click();
		Thread.sleep(5000);
		driver.quit();
	
		

	}

}

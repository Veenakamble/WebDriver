package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handlingbox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("create new account")).click();
		Thread.sleep(2000);
		Select daylistbox=new Select(driver.findElement(By.name("birthday_month")));
		Select monthlistbox=new Select(driver.findElement(By.name("birthday_day")));
		Select yearlistbox=new Select(driver.findElement(By.name("birthday_year")));
		boolean flag=daylistbox.isMultiple();
		System.out.println(flag);
		daylistbox.selectByIndex(10);
		Thread.sleep(4000);
		monthlistbox.selectByVisibleText("Dec");
		Thread.sleep(4000);
		yearlistbox.selectByVisibleText("1978");
		Thread.sleep(4000);
	}

	

	}



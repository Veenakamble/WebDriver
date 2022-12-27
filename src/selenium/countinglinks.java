package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countinglinks {

	public static void main(String[] args) throws Throwable{
		// TODO Auto-generated me;thod stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://rediff.com/");
		Thread.sleep(5000);
		List<WebElement>allinks = driver.findElements(By.tagName("a"));
		System.out.println("no:of links are   "+allinks.size());
		Thread.sleep(5000);
		for(WebElement each : allinks) {
			System.out.println(each.getText());
		}
		driver.quit();

	}
}



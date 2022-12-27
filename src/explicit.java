import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver .manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebDriverWait mywait=new WebDriverWait(driver,20);
	mywait.until(ExpectedConditions.elementToBeClickable(By.linkText("Create new account")));
	driver.findElement(By.linkText("Create new account")).click();
	mywait.until(ExpectedConditions.elementToBeClickable(By.name("firstname")));
	driver.findElement(By.name("firstname")).sendKeys("testing");
	
	

	}

}

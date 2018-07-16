import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WPBBPressemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demosite.center/bbpress/wp-login.php");
		
		//Login
		driver.findElement(By.xpath(".//*[@id='user_login']")).sendKeys("admin");
		driver.findElement(By.xpath(".//*[@id='user_pass']")).sendKeys("demo123");
		driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();
		Thread.sleep(3000);
		Actions action=new Actions(driver);
		WebElement element=driver.findElement(By.xpath(".//*[@id='wp-admin-bar-site-name']/a"));
		action.moveToElement(element).perform();
		driver.findElement(By.xpath(".//*[@id='wp-admin-bar-site-name']/a")).click();
		
		//Media
		driver.findElement(By.xpath(".//*[@id='menu-media']/a/div[3]")).click();
		driver.findElement(By.xpath(".//*[@id='wp-media-grid']/h2/a")).click();
	}

}

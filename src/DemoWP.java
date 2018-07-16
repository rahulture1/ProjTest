import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoWP {
	

	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		//Login
		driver.findElement(By.xpath(".//*[@id='user_login']")).sendKeys("admin");
		driver.findElement(By.xpath(".//*[@id='user_pass']")).sendKeys("demo123");
		driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();
		Thread.sleep(3000);
		
		//Add New Post
		driver.findElement(By.xpath(".//*[@id='menu-posts']/a/div[3]")).click();
		driver.findElement(By.xpath(".//*[@id='wpbody-content']/div[3]/a")).click();
		driver.findElement(By.xpath(".//*[@id='title']")).sendKeys("Demo!!!!! Welcome To Word Press");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='content-html']")).click();
		driver.findElement(By.xpath(".//*[@id='content']")).sendKeys("Hello Nice Post!!!!!!!");
		driver.findElement(By.xpath(".//*[@id='publish']")).click();
		driver.findElement(By.xpath(".//*[@id='publish']")).click();
		Thread.sleep(10000);
		
		
	//river.findElement(By.xpath(".//*[@id='message']/p/a")).click();
		
		//Mouse Hover
		//Logout
		WebElement element= driver.findElement(By.xpath(".//*[@id='wp-admin-bar-my-account']/a"));
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='wp-admin-bar-logout']/a")).click();
		driver.close();
	
		
	}
}
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automatepr {

	public static void main(String[] args)   {
		System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com");
		
		driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("rahul.a.ture@gmail.com");
		driver.findElement(By.xpath(".//*[@id='passwd']")).sendKeys("1qaz!QAZ");
		driver.findElement(By.xpath(".//*[@id='SubmitLogin']")).click();
		driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[3]/a")).click();
		Actions action=new Actions(driver);
		WebElement element=driver.findElement(By.xpath(".//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img"));
		action.moveToElement(element).perform();
		driver.findElement(By.xpath(".//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[1]/span")).click();
		driver.findElement(By.linkText("Continue shopping")).click();
		driver.findElement(By.xpath(".//*[@id='layer_cart']/div[1]/div[2]/div[4]/span/span")).click();
		driver.findElement(By.xpath(".//*[@id='header']/div[3]/div/div/div[3]/div/a/b")).click();
		
		driver.findElement(By.xpath(".//*[@id='center_column']/p[2]/a[1]/span")).click();
		driver.findElement(By.xpath(".//*[@id='center_column']/form/p/button")).click();
		driver.findElement(By.xpath(".//*[@id='cgv']")).click();
		driver.findElement(By.xpath(".//*[@id='form']/p/button")).click();
		driver.findElement(By.xpath(".//*[@id='HOOK_PAYMENT']/div[1]/div/p/a")).click();
		  
	    driver.findElement(By.xpath(".//*[@id='cart_navigation']/button")).click();
	    driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[2]/a")).click();
	    driver.close();
	}

}

package testCases;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class youtubeconnect {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new FirefoxDriver();
	      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      
	      //Launch website
	      driver.navigate().to("http://socialsofttesthb.com/");
	      
	      //Maximize the browser
	      driver.manage().window().maximize();
	      
	      // Click on Math Calculators
	      driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("anuj@ravabe.com");
	      
	      // Click on Percent Calculators
	      driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("Anuj123456");
	      
	      driver.findElement(By.xpath(".//*[@id='login-form']/button")).click();
	      
	      driver.findElement(By.xpath(".//*[@id='caret']")).click();
	       driver.findElement(By.xpath(".//*[@id='dropdown']/div[2]"));
	     
	       driver.findElement(By.xpath(".//*[@id='dropdown']/div[2]/div[2]/div[2]/a")).click();
	       Thread.sleep(5000);
	       driver.findElement(By.xpath(".//*[@id='heapbox_add-channel-select']/a[2]")).click();
	       driver.findElement(By.xpath(".//*[@id='heapbox_add-channel-select']/div/ul/li[5]/a")).click();
	       driver.findElement(By.xpath(".//*[@id='btn-connect']")).click();
	       Thread.sleep(5000);
	       Set <String> set1=driver.getWindowHandles();
	       Iterator <String> win1=set1.iterator();
	       String parent=win1.next();
	       String child=win1.next();
	       driver.switchTo().window(child);
	       driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("acanujchauhan3@gmail.com");
	       driver.findElement(By.xpath(".//*[@id='next']")).click();
	       driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("anuj1990");
	       driver.findElement(By.xpath(".//*[@id='signIn']")).click();
	       Thread.sleep(5000);
	       driver.findElement(By.xpath(".//*[@id='submit_approve_access']")).click();
	          driver.switchTo().window(parent);
	}

}

package testcases;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.TestConnect;
import utility.TestHelper;

public class Tumblrconnect {

	public static void main(String[] args)   throws InterruptedException {
	    WebDriver driver = new FirefoxDriver();
	      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //Launch website
	      driver.navigate().to("http://socialsofttesthb.com/");
	      
	      //Maximize the browser
	      driver.manage().window().maximize();
	      
	      // Click on Math Calculators
	     // driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("anuj@ravabe.com");
	      TestHelper.emailAddress(driver).sendKeys("anuj@ravabe.com");
	      
	      // Click on Percent Calculators
	     // driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("Anuj123456");
	      TestHelper.password(driver).sendKeys("Anuj123456");
	      
	      //driver.findElement(By.xpath(".//*[@id='login-form']/button")).click();
	      TestHelper.login(driver).click();
	      driver.findElement(By.xpath(".//*[@id='myModal']/div[2]/div/div[1]/div[2]/div[1]/a[2]")).click();
	      TestConnect.channeldropdown(driver).click();
	       //driver.findElement(By.xpath(".//*[@id='dropdown']/div[2]"));
	      TestConnect.SocialNetwork(driver).click();
	      // driver.findElement(By.xpath(".//*[@id='dropdown']/div[2]/div[2]/div[2]/a")).click();
	       Thread.sleep(5000);
	      // driver.findElement(By.xpath(".//*[@id='heapbox_add-channel-select']/a[2]")).click();
	       TestConnect.Heapbox(driver).click();
	      // driver.findElement(By.xpath(".//*[@id='heapbox_add-channel-select']/div/ul/li[7]/a")).click();
	       TestConnect.AddTumblr(driver).click();
	       //driver.findElement(By.xpath(".//*[@id='btn-connect']")).click();
	       TestConnect.Connectbtn(driver).click();
	       Thread.sleep(5000);
	       Set <String> set1=driver.getWindowHandles();
	       Iterator <String> win1=set1.iterator();
	       String parent=win1.next();
	       String child=win1.next();
	       driver.switchTo().window(child);
	       
	      // driver.findElement(By.xpath(".//*[@id='signup_email']")).sendKeys("acanujchauhan3@gmail.com");
	       TestConnect.Tumblruser(driver).sendKeys("acanujchauhan3@gmail.com");
	      // driver.findElement(By.xpath(".//*[@id='signup_password']")).sendKeys("Anuj123456");
	      TestConnect.Tumblrpass(driver).sendKeys("Anuj123456");
	       //driver.findElement(By.xpath(".//*[@id='signup_forms_submit']")).click();
	      TestConnect.Tumblrsignup(driver).click();
	       Thread.sleep(5000);
	      // driver.findElement(By.xpath(".//*[@id='api_v1_oauth_authorize']/div[2]/div/div[1]/div/div/div[2]/form/button[2]")).click();
	       TestConnect.Tumblrallow(driver).click();
	       driver.switchTo().window(parent);
		

	}

}

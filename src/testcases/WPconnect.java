package testcases;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.TestConnect;
import utility.TestHelper;

public class WPconnect {

	public static void main(String[] args)   throws InterruptedException {
	    WebDriver driver = new FirefoxDriver();
	      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      
	      //Launch website
	      driver.navigate().to("http://socialsofttesthb.com/");
	      
	      //Maximize the browser
	      driver.manage().window().maximize();
	      
	      // Click on Math Calculators
	    //  driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("anuj@ravabe.com");
	      TestHelper.emailAddress(driver).sendKeys("anuj@ravabe.com");
	      
	      // Click on Percent Calculators
	    //  driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("Anuj123456");
	      TestHelper.password(driver).sendKeys("Anuj123456");
	      //driver.findElement(By.xpath(".//*[@id='login-form']/button")).click();
	      TestHelper.login(driver).click();
	     // driver.findElement(By.xpath(".//*[@id='caret']")).click();
	      TestConnect.channeldropdown(driver).click();
	       //driver.findElement(By.xpath(".//*[@id='dropdown']/div[2]"));
	      TestConnect.SocialNetwork(driver).click();
	      // driver.findElement(By.xpath(".//*[@id='dropdown']/div[2]/div[2]/div[2]/a")).click();
	       Thread.sleep(5000);
	       TestConnect.Heapbox(driver).click();
	       TestConnect.AddWp(driver).click();
	       TestConnect.Connectbtn(driver).click();
	     //  driver.findElement(By.xpath(".//*[@id='heapbox_add-channel-select']/a[2]")).click();
	    //   driver.findElement(By.xpath(".//*[@id='heapbox_add-channel-select']/div/ul/li[6]/a")).click();
	    //   driver.findElement(By.xpath(".//*[@id='btn-connect']")).click();
	       Thread.sleep(5000);
	       Set <String> set1=driver.getWindowHandles();
	       Iterator <String> win1=set1.iterator();
	       String parent=win1.next();
	       String child=win1.next();
	       driver.switchTo().window(child);
	      // driver.findElement(By.xpath(".//*[@id='site_url']")).sendKeys("http://www.bigaltestsite.com/test1/");
	       TestConnect.Wpurl(driver).sendKeys("http://www.bigaltestsite.com/test1/");
	      // driver.findElement(By.xpath(".//*[@id='display_name']")).sendKeys("Anuj");
	       TestConnect.Wpdisplayname(driver).sendKeys("Anuj");
	       //driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("ravabe5");
	       TestConnect.Wpuser(driver).sendKeys("ravabe5");
	      // driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("QA@WSX3edc");
	       TestConnect.Wppass(driver).sendKeys("QA@WSX3edc");
	      // driver.findElement(By.xpath(".//*[@id='button1']")).click();
	       TestConnect.Wpbtn(driver).click();
	       Thread.sleep(5000);
	       driver.switchTo().window(parent);

	}

}

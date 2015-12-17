import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import Utility.TestHelper;
import Utility.TestConnect;

public class twitterconnect {

	public static void main(String[] args)   throws InterruptedException {
	    WebDriver driver = new FirefoxDriver();
	      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      
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
	     // driver.findElement(By.xpath(".//*[@id='login-form']/button")).click();
	      TestHelper.login(driver).click();
	      Thread.sleep(5000);
	      driver.navigate().refresh();
	      //driver.findElement(By.xpath(".//*[@id='caret']")).click();
	      TestConnect.channeldropdown(driver).click();
	       //driver.findElement(By.xpath(".//*[@id='dropdown']/div[2]"));
	     
	       TestConnect.SocialNetwork(driver).click();
	       Thread.sleep(5000);
	       TestConnect.Heapbox(driver).click();
	       TestConnect.Addchannel(driver).click();
	       TestConnect.Connectbtn(driver).click();
	       Thread.sleep(5000);
	       Set <String> set1=driver.getWindowHandles();
	       Iterator <String> win1=set1.iterator();
	       String parent=win1.next();
	       String child=win1.next();
	       driver.switchTo().window(child);
	       TestConnect.Username(driver).sendKeys("acanujchauhan3@gmail.com");
	       TestConnect.password(driver).sendKeys("anujchauhan");
	       
	       TestConnect.allow(driver).click();
	       Thread.sleep(5000);
          driver.switchTo().window(parent);
	}

}

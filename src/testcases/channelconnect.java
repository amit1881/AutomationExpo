package testcases;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import utility.TestConnect;
import utility.TestHelper;
//facebook channel connect process//
public class channelconnect {
	 public static void main(String[] args) throws Exception {
		   
	      WebDriver driver = new FirefoxDriver();
	     // WebDriver driver = new ChromeDriver();
	      
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
	      //driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("Anuj123456");
	      TestHelper.password(driver).sendKeys("Anuj123456");
	   
	      
	      // Click Calculate Button
	     //driver.findElement(By.xpath(".//*[@id='login-form']/button")).click();
	      TestHelper.login(driver).click();
	     // driver.findElement(By.xpath(".//*[@id='myModal']/div[1]")).click();
	      TestConnect.channeldropdown(driver).click();
	//       driver.findElement(By.xpath(".//*[@id='dropdown']/div[2]"));
	  //     driver.findElement(By.xpath(".//*[@id='dropdown']/div[2]/div[2]/div[2]/a")).click();
	      TestConnect.SocialNetwork(driver).click();
	       Thread.sleep(5000);
	    //   driver.findElement(By.xpath(".//*[@id='heapbox_add-channel-select']/a[2]")).click();
	      // driver.findElement(By.xpath(".//*[@id='heapbox_add-channel-select']/div/ul/li[2]/a")).click();
	       //driver.findElement(By.xpath(".//*[@id='btn-connect']")).click();
	       TestConnect.Heapbox(driver).click();
	       TestConnect.Addfacebook(driver).click();
	       TestConnect.Connectbtn(driver).click();
	       Thread.sleep(5000);
	       Set <String> set1=driver.getWindowHandles();
	       Iterator <String> win1=set1.iterator();
	       String parent=win1.next();
	       String child=win1.next();
	       driver.switchTo().window(child);
	       //System.out.println(driver.findElement(By.xpath(".//*[@id='email']")));
	      // driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("acanujchauhan3@gmail.com");
	       TestConnect.fbusername(driver).sendKeys("acanujchauhan3@gmail.com");
	      // driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("anuj29");
	      TestConnect.fbpass(driver).sendKeys("anuj29");
	      
	      //driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
	     TestConnect.fblogin(driver).click();
	      // driver.findElement(By.xpath(".//*[@id='platformDialogForm']/div[2]/table/tbody/tr/td[2]/button[2]")).click();
	       TestConnect.fbform(driver).click();
	      // driver.findElement(By.xpath(".//*[@id='platformDialogForm']/div[2]/button[2]")).click();
	       TestConnect.fbform1(driver).click();
	       Thread.sleep(5000);
	       //driver.findElement(By.xpath(".//*[@id='platformDialogForm']/div[2]/button[2]")).click();
	       TestConnect.fbform2(driver).click();
	       driver.switchTo().window(parent);
}
}

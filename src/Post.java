import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import Utility.TestHelper;
import Utility.Publishpost;


public class Post {

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
	      
	      
	     //driver.findElement(By.xpath("html/body/div[3]/section/div[1]/div/div[1]/div[1]/div[1]/a")).click();
	      Publishpost.AddNewPost(driver).click();
	     // driver.findElement(By.xpath("html/body/div[3]/div[1]/ul/li[1]/a")).click();
	      Publishpost.Standardpost(driver).click();
	      //driver.findElement(By.xpath(".//*[@id='heapbox_network-list-1']/a[2]")).click();
	      Publishpost.Heapbox(driver).click();
	     // driver.findElement(By.xpath(".//*[@id='heapbox_network-list-1']/div/ul/li[2]/a")).click();
	      Publishpost.Channel(driver).click();
	  	
	      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	     // driver.findElement(By.xpath(".//*[@id='heapbox_channel-list-1']/a[2]")).click();
	     // driver.findElement(By.xpath(".//*[@id='summernote-1']")).sendKeys("What does customizing products for 17 million customers look like? It's best told by the numbers and we've just updated them! Take a look and let us know which of these numbers surprises you the most.");
	      Publishpost.Summernote(driver).sendKeys("What does customizing products for 17 million customers look like? It's best told by the numbers and we've just updated them! Take a look and let us know which of these numbers surprises you the most.");
	     // driver.findElement(By.xpath(".//*[@id='show-image-1']/img")).click();
	      Publishpost.AddImage(driver).click();
	     //driver.findElement(By.xpath(".//*[@id='image-box-body-1']/a")).click();
	      Publishpost.Browse(driver).click();
	      try {
			Runtime.getRuntime().exec("D:/autoit3/Imageuploade.exe");
			Thread.sleep(5000);
	      } 
	      catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	      }
	      
	      driver.findElement(By.xpath(".//*[@id='image-box-body-1']/a")).click();
	      
	      try {
	  		Runtime.getRuntime().exec("D:/autoit3/Imageuploade.exe");
	  		Thread.sleep(5000);
	  		} 
	      catch (Exception e) {
	  		// TODO Auto-generated catch block
	  		e.printStackTrace();
	  	}
	      
	      //driver.findElement(By.xpath(".//*[@id='btn-publish']")).click();
	      Publishpost.Publishnow(driver).click();
	      //driver.findElement(By.xpath("html/body/div[2]/div/div/div/div[3]/div/div[1]/div/div[2]/a")).click();
	      Publishpost.Publish(driver).click();
	}
}

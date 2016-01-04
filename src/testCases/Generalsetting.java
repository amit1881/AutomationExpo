package testCases;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.Generalpage;
import utility.TestHelper;
public class Generalsetting {
	public static void main(String[] args)   throws InterruptedException {
	    WebDriver driver = new FirefoxDriver();
	      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      
	      //Launch website
	      driver.navigate().to("http://socialsofttesthb.com/");
	      
	      //Maximize the browser
	      driver.manage().window().maximize();
	      
	      TestHelper.emailAddress(driver).sendKeys("anuj@ravabe.com");
	      TestHelper.password(driver).sendKeys("Anuj123456");
	      TestHelper.login(driver).click();
	      Thread.sleep(5000);
		     driver.navigate().refresh();
		     Generalpage.DropDwon(driver).click();
		     Generalpage.generalsetting(driver).click();
		     Generalpage.Firstname(driver).clear();
		     Thread.sleep(5000);
		     Generalpage.Firstname(driver).sendKeys("Anuj");
		     Generalpage.Lastname(driver).clear();
		     Thread.sleep(5000);
		     Generalpage.Lastname(driver).sendKeys("Chauhan");
		     Generalpage.Browserbtn(driver).click();
		       try {
					Runtime.getRuntime().exec("D:/autoit3/Imageuploade.exe");
					Thread.sleep(5000);
			     } 
			      catch (Exception e) {
					//TODO Auto-generated catch block
					e.printStackTrace();
			      }
		       Generalpage.Job(driver).sendKeys("Software engineer");
		       Generalpage.Organisation(driver).clear();
			     Thread.sleep(5000);
		       Generalpage.Organisation(driver).sendKeys("ravabe");
		       Generalpage.Updatebtn(driver).click();
}
}

import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import Utility.TestHelper;
import Utility.Multipublishpost;
import Utility.Publishpost;

public class Multipost {

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
		     Publishpost.AddNewPost(driver).click();
		     Multipublishpost.Multipost(driver).click();
		     Multipublishpost.Summernote(driver).sendKeys(" MERRY CHRISTMAS:On this joyous day, and throughout the new year, may your life be filled with an abundance of love. ");
		     Multipublishpost.Addimage(driver).click();
		     Multipublishpost.Browse(driver).click();
		     try {
					Runtime.getRuntime().exec("D:/autoit3/Imageuploade.exe");
					Thread.sleep(5000);
			      } 
			      catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			      }
		     Multipublishpost.Networkfb(driver).click();
		     Thread.sleep(5000);
		     Multipublishpost.Networktwi(driver).click();
		     Multipublishpost.Publishnow(driver).click();
		    // Multipublishpost.Scheduledpost(driver).click();
		    // Multipublishpost.Datepicker(driver).click();
		    	// Multipublishpost.Time(driver).click();
		    	// Multipublishpost.Time(driver).click();
		    
		     //Multipublishpost.Scheduledbtn(driver).click();
		     Multipublishpost.Publish(driver).click();
		     

	}

}

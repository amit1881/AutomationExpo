import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import Utility.TestHelper;
import Utility.Multipublishpost;
import Utility.Publishpost;
public class MultiSchedulepost {

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
		     Multipublishpost.Summernote(driver).sendKeys(" The bridge that Howrah built for to and fro ... magnificent in its simplicity .. and its grandeur !! ");
		     Multipublishpost.Networkfb(driver).click();
		     Thread.sleep(5000);
		   Multipublishpost.Scheduledpost(driver).click();
		   Multipublishpost.Clander(driver).clear();  
		   Thread.sleep(5000);
			     for(int i=0;i<2;i++){
			    	 Multipublishpost.Time(driver).click();
			     }
			     Multipublishpost.Scheduledbtn(driver).click();

}
}

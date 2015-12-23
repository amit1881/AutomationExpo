import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import Utility.TestHelper;
import Utility.Add_Projects;
public class Add_Project {

	public static void main(String[] args)   throws InterruptedException {
	    WebDriver driver = new FirefoxDriver();
	      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      
	      //Launch website
	      driver.navigate().to("http://socialsofttesthb.com/");
	      
	      //Maximize the browser
	      driver.manage().window().maximize();
	      
	     // TestHelper.emailAddress(driver).sendKeys("anuj@ravabe.com");
	   //   TestHelper.password(driver).sendKeys("Anuj123456");
	     // TestHelper.login(driver).click();
	      Login_ravabe.DoLogin(driver);
	      Thread.sleep(5000);
		     driver.navigate().refresh();
		     Add_Projects.ProDropDwon(driver).click();
		     Add_Projects.AddNew(driver).click();
		     Add_Projects.ProjectTitle(driver).sendKeys("new one");
		     Add_Projects.SelectNetwork(driver).click();
		     Thread.sleep(5000);
		     Add_Projects.NetworkFb(driver).click();
		     Thread.sleep(5000);
		     Add_Projects.ADDNetwork(driver).click();
		     Add_Projects.SelectNetwork(driver).click();
		     Thread.sleep(5000);
		     Add_Projects.NetworkTwitter(driver).click();
		     Thread.sleep(5000);
		     Add_Projects.ADDNetwork(driver).click();
		     Add_Projects.SelectNetwork(driver).click();
		     Thread.sleep(5000);
		     Add_Projects.NetworkLinkedin(driver).click();
		     Thread.sleep(5000);
		     Add_Projects.ADDNetwork(driver).click();
		     Add_Projects.SelectNetwork(driver).click();
		     Thread.sleep(5000);
		     Add_Projects.NetworkYouTube(driver).click();
		     Thread.sleep(5000);
		     Add_Projects.ADDNetwork(driver).click();
		     Add_Projects.SelectNetwork(driver).click();
		     Thread.sleep(5000);
		     Add_Projects.NetworkTumblr(driver).click();
		     Thread.sleep(5000);
		     Add_Projects.ADDNetwork(driver).click();
		     Add_Projects.AddProject(driver).click();
		     Add_Projects.AddNewPost(driver).click();
		     Post.StandardPost(driver);
		     
		     
		     

}
}

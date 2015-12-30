//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import Utility.Add_Projects;
import Utility.Welcomepopup;
public class AddProject {



	public static void main(String[] args) throws InterruptedException, IOException  {
		
		WebDriver driver=new FirefoxDriver();
		 Login_ravabe.DoLogin(driver);
		 Welcomepopup.AddNewProject(driver).click();
		 Welcomepopup.ProjectTitle(driver).sendKeys("New test ravabe");
		   Welcomepopup.SelectNetwork(driver).click();
		     Thread.sleep(5000);
		     Welcomepopup.NetworkFb(driver).click();
		     Thread.sleep(5000);
		     Welcomepopup.ADDNetwork(driver).click();
		     Welcomepopup.SelectNetwork(driver).click();
		     Thread.sleep(5000);
		     Welcomepopup.NetworkTwitter(driver).click();
		     Thread.sleep(5000);
		     Welcomepopup.ADDNetwork(driver).click();
		     Welcomepopup.SelectNetwork(driver).click();
		     Thread.sleep(5000);
		     Welcomepopup.NetworkLinkedin(driver).click();
		     Thread.sleep(5000);
		     Welcomepopup.ADDNetwork(driver).click();
		     Welcomepopup.SelectNetwork(driver).click();
		     Thread.sleep(5000);
		     Welcomepopup.NetworkYouTube(driver).click();
		     Thread.sleep(5000);
		     Welcomepopup.ADDNetwork(driver).click();
		     Welcomepopup.SelectNetwork(driver).click();
		     Thread.sleep(5000);
		     Welcomepopup.NetworkTumblr(driver).click();
		     Thread.sleep(5000);
		     Welcomepopup.ADDNetwork(driver).click();
		     Welcomepopup.AddProject(driver).click();
		     Welcomepopup.AddNewPost(driver).click();
		     Post.StandardPost(driver);
	}

}

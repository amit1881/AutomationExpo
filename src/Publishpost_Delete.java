//import java.util.concurrent.TimeUnit;

//import org.apache.xpath.operations.String;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utility.Delete_post;

public class Publishpost_Delete {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver=new FirefoxDriver();
		 Login_ravabe.DoLogin(driver);
		 driver.navigate().refresh();
		 Delete_post.Publish(driver).click();
		 Delete_post.Checkbox(driver).click();
		 Delete_post.Deletepost(driver).click();
		 Thread.sleep(5000);
		 Delete_post.Ok(driver).click(); 
		 
		
		
		 
}
}

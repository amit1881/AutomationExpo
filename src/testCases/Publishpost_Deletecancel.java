package testCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.Delete_post;
public class Publishpost_Deletecancel {
public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver=new FirefoxDriver();
		 Login_ravabe.DoLogin(driver);
		 driver.navigate().refresh();
		 Delete_post.Publish(driver).click();
		 Delete_post.Checkbox(driver).click();
		 Delete_post.Deletepost(driver).click();
		 Thread.sleep(5000);
		 Delete_post.cancel(driver).click();
		 

}
}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utility.Delete_post;
import Utility.Filter_Post;
public class Filter_Posts {

	

		public static void main(String[] args) throws InterruptedException  {
			
			WebDriver driver=new FirefoxDriver();
			 Login_ravabe.DoLogin(driver);
			 driver.navigate().refresh();
			 Delete_post.Publish(driver).click();
			 Filter_Post.twitter(driver).click();
			
			 Filter_Post.Linkedin(driver).click();
			
			 Filter_Post.Youtube(driver).click();
			 Thread.sleep(5000);
			 Filter_Post.Wordpress(driver).click();
			 Thread.sleep(5000);
			 Filter_Post.Tumblr(driver).click();
			 Thread.sleep(5000);
			 Filter_Post.Filter(driver).click();
			 

}
}

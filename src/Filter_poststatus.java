import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utility.Delete_post;
import Utility.Filter_Post;

public class Filter_poststatus {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver=new FirefoxDriver();
		 Login_ravabe.DoLogin(driver);
		 driver.navigate().refresh();
		 Delete_post.Publish(driver).click();
		 for(int i=0;i<5;i++)
		 {
			 Thread.sleep(5000);
			 Filter_Post.Status(driver).click();
		 }
		 Filter_Post.Filter(driver).click();
		 Thread.sleep(5000);
		 Filter_Post.FilterClear(driver).click();
		 
}
}

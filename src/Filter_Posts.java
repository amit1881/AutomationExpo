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
			for(int i=0;i<5;i++)
			{
				Thread.sleep(2000);
				Filter_Post.Types(driver).click();
			}
			 Filter_Post.DateFrom(driver).click();
			 Filter_Post.DatePicker(driver).click();
			 Thread.sleep(5000);
			 Filter_Post.DateTo(driver).click();
			 Filter_Post.DatePickerTo(driver).click();
			 
			 Filter_Post.Filter(driver).click();
			 Thread.sleep(5000);
			 Filter_Post.FilterClear(driver).click();

}
}

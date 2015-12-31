import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import Utility.Delete_post;
import Utility.Filter_Post;


public class Filter_Posts {

	

		public static void main(String[] args) throws InterruptedException, IOException  {
			
			 WebDriver driver=new FirefoxDriver();
			 Login_ravabe.DoLogin(driver);
			 driver.navigate().refresh();
			 Delete_post.Publish(driver).click();
			 
			 InputStreamReader input=new InputStreamReader(System.in);
			 BufferedReader br=new BufferedReader(input);
			 System.out.print("Enter your filter choice::");
			 String choice=br.readLine();
			 switch(choice){
			 case "type":{
			 
				 for(int i=0;i<5;i++)
				 {
					Thread.sleep(2000);
					Filter_Post.Types(driver).click();
				 }
				 break;
			 }
			 case "status":{
				 
				 for(int i=0;i<5;i++)
				 {
					 Thread.sleep(5000);
					 Filter_Post.Status(driver).click();
				 }
				 break;
			 }
			 case "date":{
				 
				 Filter_Post.DateFrom(driver).click();
				 Filter_Post.DatePicker(driver).click();
				 Thread.sleep(5000);
				 Filter_Post.DateTo(driver).click();
				 Filter_Post.DatePickerTo(driver).click();
				 break;
			 }
			 case "type with status":{
				 for(int i=0;i<5;i++)
				 {
					Thread.sleep(2000);
					Filter_Post.Types(driver).click();
				 }
				 for(int i=0;i<5;i++)
				 {
					 Thread.sleep(5000);
					 Filter_Post.Status(driver).click();
				 }
				 break;
				 
			 }
			 case "type with date":{
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
				 break;
			 }
			 case "status with date":{
				 for(int i=0;i<5;i++)
				 {
					 Thread.sleep(5000);
					 Filter_Post.Status(driver).click();
				 }
				 Filter_Post.DateFrom(driver).click();
				 Filter_Post.DatePicker(driver).click();
				 Thread.sleep(5000);
				 Filter_Post.DateTo(driver).click();
				 Filter_Post.DatePickerTo(driver).click();
				 break;
			 }
			 case "type with status and date":{
				 for(int i=0;i<5;i++)
				 {
					Thread.sleep(2000);
					Filter_Post.Types(driver).click();
				 }
				 for(int i=0;i<5;i++)
				 {
					 Thread.sleep(5000);
					 Filter_Post.Status(driver).click();
				 }
				 Filter_Post.DateFrom(driver).click();
				 Filter_Post.DatePicker(driver).click();
				 Thread.sleep(5000);
				 Filter_Post.DateTo(driver).click();
				 Filter_Post.DatePickerTo(driver).click();
				 break;
			 }
			 case "list view":{
				 Filter_Post.ListViewBtn(driver).click();
				 break;
				 
			 }
			 case "grid view":{
				 Filter_Post.GridViewBtn(driver).click();
				 break;
				 
			 }
			 
				 
			 }
			 
			 Filter_Post.Filter(driver).click();
			 Thread.sleep(5000);
			 Filter_Post.FilterClear(driver).click();
			

		}
}

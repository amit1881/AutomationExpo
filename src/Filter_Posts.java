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
			 switch(choice.toLowerCase()){
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
			 case "date added":{
				 Filter_Post.SelectSortdd(driver).click();
				 Filter_Post.DateAdded(driver).click();
				 break;
			 }
			 case "schedule date":{
				 Filter_Post.SelectSortdd(driver).click();
				 Filter_Post.ScheduleDate(driver).click();
				 break;
			 }
			 default:{
				 System.out.println("Invalid choice");
			 }
				 
			 }
			 
			 if(choice.equals("type")||choice.equals("status")||choice.equals("date")||choice.equals("type with status")||choice.equals("type with date")||choice.equals("status with date")||choice.equals("type with status and date")){
			 Filter_Post.Filter(driver).click();
			 Thread.sleep(5000);
			 Filter_Post.FilterClear(driver).click();
			 }

		}
}

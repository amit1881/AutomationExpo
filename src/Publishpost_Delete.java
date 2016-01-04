import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import Utility.Delete_post;

public class Publishpost_Delete {

	public static void main(String[] args) throws InterruptedException, IOException  {
		
		 WebDriver driver=new FirefoxDriver();
		 Login_ravabe.DoLogin(driver);
		 driver.navigate().refresh();
		 Delete_post.Publish(driver).click();
		 Delete_post.Checkbox(driver).click();
		 Delete_post.Deletepost(driver).click();
		 /*
		  * handle alert message for delete
		  */
		 InputStreamReader input=new InputStreamReader(System.in);
		 BufferedReader br=new BufferedReader(input);
		 System.out.print("Enter your delete choice::");
		 String choice=br.readLine();
		 switch(choice){
		 case "ok":{
			 Thread.sleep(5000);
			 Delete_post.Ok(driver).click(); 
			 break;
		 }
		 
		 case "cancel":{
			 Thread.sleep(5000);
			 Delete_post.cancel(driver).click();
			 Delete_post.Checkbox(driver).click();
			 break;
		 }
			 
		 }
		 
	}
}
		 
		 
		
		
		 
	


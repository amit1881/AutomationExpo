package testcases;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.Publishpost;

public class Post {
	public static void main(String args[]) throws InterruptedException, IOException{
		WebDriver driver = new FirefoxDriver();
		StandardPost(driver);
	}

	public static void StandardPost(WebDriver driver)   throws InterruptedException, IOException {
	      Login_ravabe.DoLogin(driver);
	      driver.navigate().refresh();
	      Publishpost.AddNewPost(driver).click();
	      Publishpost.Heapbox(driver).click();
	      Thread.sleep(5000);
	      Publishpost.Channel(driver).click();
	  	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      Publishpost.Summernote(driver).sendKeys("As the year 2016 begins, my greetings & good wishes to everyone. May 2016 bring joy, peace, prosperity & good health in everyone's lives. ");
	      /*
	       * Add image with content
	       */
	      Publishpost.AddImage(driver).click();
	      InputStreamReader input= new InputStreamReader(System.in);
	      BufferedReader br = new BufferedReader(input);
	      System.out.print("Enter Fileupload choice::");
	      String choice=br.readLine();
			 switch(choice.toLowerCase()){
			 case "image":{
				 
			      Publishpost.Browse(driver).click();
			      
			      try {
						Runtime.getRuntime().exec("D:/autoit3/imageupload.exe");
						Thread.sleep(5000);
				      } 
				      catch (Exception e) {
						e.printStackTrace();
				      }
			      break;
			 }
			 case "video":{
				 
			      Publishpost.Browse(driver).click();
			      
			      try {
						Runtime.getRuntime().exec("D:/autoit3/videoupload.exe");
						Thread.sleep(5000);
				      } 
				      catch (Exception e) {
						e.printStackTrace();
				      }
			      break;
			 }
			 }
			 
			 
	    
	   
	      
	    
	      System.out.print("Enter your Post choice::");
			 choice=br.readLine();
			 switch(choice.toLowerCase()){
			 case "publish now":{
				 Publishpost.Publishnow(driver).click();
				 Publishpost.Publish(driver).click();
				 break;
			 }
			 case "schedule":{
				 Publishpost.SchedPubDateBtn(driver).click();
				 Publishpost.DatePicker(driver).clear();
				 Publishpost.DatePicker(driver).sendKeys("2016-12-31 03:44 PM");
				 Publishpost.ScheduleBtn(driver).click();
				 break;
			 }
			 case "draft":{
				 Publishpost.Draft(driver).click();
				 ((JavascriptExecutor) driver)
		         .executeScript("window.scrollTo(0, document.body.scrollHeight)");
				 break;
			 }
			 case "draft with date":{
				 Publishpost.SchedPubDateBtn(driver).click();
				 Publishpost.Draft(driver).click();
				 break;
			 }
			 case "cancel":{
				 Publishpost.CancelBtn(driver).click();
				 break;
			 }
			
			 default:{
				 System.out.println("Invalid choice");
			 }
			 
			 
			 }
	      
	         
	}
}
	              


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utility.Publishpost;



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
	    
	      Publishpost.Summernote(driver).sendKeys("The 18th century sword from Bengal that belonged to the Najafi Dynasty, gifted to me by President Putin. .Narendra Modi. ");
	    
	      Publishpost.AddImage(driver).click();
	    
	      Publishpost.Browse(driver).click();
	      try {
			Runtime.getRuntime().exec("D:/autoit3/Imageuploade.exe");
			Thread.sleep(5000);
	      } 
	      catch (Exception e) {
			
			e.printStackTrace();
	      }
	      
	
	      InputStreamReader input= new InputStreamReader(System.in);
	      BufferedReader br = new BufferedReader(input);
	      System.out.print("Enter your Post choice::");
			 String choice=br.readLine();
			 switch(choice){
			 case "publish now":{
				 
				 Publishpost.Publishnow(driver).click();
				 break;
			 }
			 case "Draft":{
				 Publishpost.Draft(driver).click();
				 break;
			 }
			
			 }
	      
	    
	      Publishpost.Publish(driver).click();
	}
}

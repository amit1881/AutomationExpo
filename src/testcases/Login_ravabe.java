package testcases;
import java.util.concurrent.TimeUnit;


//import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



import utility.TestHelper;
public class Login_ravabe {

public static void main(String args[]){
		
		WebDriver driver=new FirefoxDriver();
		Login_ravabe.DoLogin(driver);
}


	public static void DoLogin(WebDriver driver){
		
		  //driver=new FirefoxDriver();
		//Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      
	      //Launch application
	      driver.navigate().to("http://socialsofttesthb.com/");
	      
	      //Maximize the browser
	      driver.manage().window().maximize();
	      
	     //driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("anuj@ravabe.com");
	      TestHelper.emailAddress(driver).sendKeys("anuj@ravabe.com");
	      
	      //driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("Anuj123456");
	      TestHelper.password(driver).sendKeys("Anuj123456");
	   
	      // Click Calculate Button
	      driver.findElement(By.xpath(".//*[@id='login-form']/button")).click();
	      
	   
		
	}
}

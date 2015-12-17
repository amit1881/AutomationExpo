import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

  
public class images {
	   public static void main(String[] args) {
		   
		      WebDriver driver = new ChromeDriver();
		      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
		      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		      
		      //Launch website
		      driver.navigate().to("http://socialsofttesthb.com/");
		      
		      //Maximize the browser
		      driver.manage().window().maximize();

}
}

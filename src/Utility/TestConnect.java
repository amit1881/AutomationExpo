package Utility;

import org.openqa.selenium.*;



public class TestConnect {

/*
 * twitter connect
 */
		
		private static WebElement element=null;
		
		 public static WebElement channeldropdown (WebDriver driver)
		   {
			   element=driver.findElement(By.xpath(".//*[@id='caret']"));
			   return element;
		   }
        
		 public static WebElement SocialNetwork (WebDriver driver)
        {
        	element=driver.findElement(By.xpath(".//*[@id='dropdown']/div[2]/div[2]/div[2]/a"));
        	return element;
        }
        
		 public static WebElement Heapbox (WebDriver driver)
		 {
			 element=driver.findElement(By.xpath(".//*[@id='heapbox_add-channel-select']/a[2]"));
			 return element;
		 }
		 public static WebElement Addchannel (WebDriver driver)
		 {
			 element=driver.findElement(By.xpath(".//*[@id='heapbox_add-channel-select']/div/ul/li[3]/a"));
			 return element;
		 }
		 public static WebElement Connectbtn (WebDriver driver)
		 {
			 element=driver.findElement(By.xpath(".//*[@id='btn-connect']"));
			 return element;
		 }
		 public static WebElement Username (WebDriver driver)
		 {
			 element=driver.findElement(By.xpath(".//*[@id='username_or_email']"));
			 return element;
		 }
		 public static WebElement password (WebDriver driver)
		 {
			 element=driver.findElement(By.xpath(".//*[@id='password']"));
			 return element;
		 }
		 public static WebElement allow (WebDriver driver)
		 {
			 element=driver.findElement(By.xpath(".//*[@id='allow']"));
			 return element;
		 }
		 
		 /*
		  * facebook channel
		  */
		 
		 public static WebElement Addfacebook (WebDriver driver)
		 {
			 element=driver.findElement(By.xpath(".//*[@id='heapbox_add-channel-select']/div/ul/li[2]/a"));
			 return element;
		 }
		 public static WebElement fbusername (WebDriver driver)
		 {
			 element=driver.findElement(By.xpath(".//*[@id='email']"));
			 return element;
		 }
		 public static WebElement fbpass (WebDriver driver)
		 {
			 element=driver.findElement(By.xpath(".//*[@id='pass']"));
			 return element;
		 }
		 public static WebElement fblogin (WebDriver driver)
		 {
			 element=driver.findElement(By.xpath(".//*[@id='loginbutton']"));
			 return element;
		 }
		 public static WebElement fbform (WebDriver driver)
		 {
			 element=driver.findElement(By.xpath(".//*[@id='platformDialogForm']/div[2]/table/tbody/tr/td[2]/button[2]"));
			 return element;
		 }
		 public static WebElement fbform1 (WebDriver driver)
		 {
			 element=driver.findElement (By.xpath(".//*[@id='platformDialogForm']/div[2]/button[2]"));
			 return element;
		 }
		 public static WebElement fbform2 (WebDriver driver)
		 {
			 element=driver.findElement (By.xpath(".//*[@id='platformDialogForm']/div[2]/button[2]"));
			 return element; 
		 }
		 
		 /*
		  * Linkedin channel
		  */
		 
		 public static WebElement AddLinkedin (WebDriver driver)
		 {
			 element=driver.findElement(By.xpath(".//*[@id='heapbox_add-channel-select']/div/ul/li[4]/a"));
			 return element;
		 }
		 
		 public static WebElement Linkedinuser (WebDriver driver)
		 {
			 element=driver.findElement(By.xpath(".//*[@id='session_key-oauth2SAuthorizeForm']"));
			 return element;
		 }
		 
		 public static WebElement Linkedinpass (WebDriver driver)
		 {
			 element=driver.findElement(By.xpath(".//*[@id='session_password-oauth2SAuthorizeForm']"));
			 return element;
		 }
		 public static WebElement Linkedinallow (WebDriver driver)
		 {
			 element=driver.findElement(By.xpath(".//*[@id='body']/div/form/div[2]/ul/li[1]/input"));
			 return element;
		 }
		
		 /*
		  * tumblr connect
		  */
		 public static WebElement AddTumblr (WebDriver driver)
		 {
			 element=driver.findElement(By.xpath(".//*[@id='heapbox_add-channel-select']/div/ul/li[7]/a"));
			 return element;
		 }
		 public static WebElement Tumblruser (WebDriver driver)
		 {
			 element=driver.findElement(By.xpath(".//*[@id='signup_email']"));
			 return element;
		 }
		 public static WebElement Tumblrpass (WebDriver driver)
		 {
			 element=driver.findElement(By.xpath(".//*[@id='signup_password']"));
			 return element;
		 }
		 public static WebElement Tumblrsignup (WebDriver driver)
		 {
			 element=driver.findElement(By.xpath(".//*[@id='signup_forms_submit']"));
			 return element;
		 }
		 public static WebElement Tumblrallow (WebDriver driver)
		 {
			 element=driver.findElement(By.xpath(".//*[@id='api_v1_oauth_authorize']/div[2]/div/div[1]/div/div/div[2]/form/button[2]"));
			 return element;
		 }
		 
		 /*
		  * wp connect
		  */
		 public static WebElement AddWp (WebDriver driver)
		 {
			 element=driver.findElement(By.xpath(".//*[@id='heapbox_add-channel-select']/div/ul/li[6]/a"));
			 return element;
		 }
		 public static WebElement Wpurl (WebDriver driver)
		 {
			 element=driver.findElement(By.xpath(".//*[@id='site_url']"));
			 return element;
		 }
		 public static WebElement Wpdisplayname (WebDriver driver)
		 {
			 element=driver.findElement(By.xpath(".//*[@id='display_name']"));
			 return element;
		 }
		 public static WebElement Wpuser (WebDriver driver)
		 {
			 element=driver.findElement(By.xpath(".//*[@id='username']"));
			 return element;
		 }
		 public static WebElement Wppass (WebDriver driver)
		 {
			 element=driver.findElement(By.xpath(".//*[@id='password']"));
			 return element;
		 }
		 public static WebElement Wpbtn (WebDriver driver)
		 {
			 element=driver.findElement(By.xpath(".//*[@id='button1']"));
			 return element;
		 }
	}




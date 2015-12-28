package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Filter_Post {

	private static WebElement element=null;
	public static WebElement twitter(WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='active-types']/div[2]/i"));
		   return element;
	}
	public static WebElement Linkedin(WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='active-types']/div[2]/i"));
		   return element;
	}
	public static WebElement Youtube(WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='active-types']/div[2]/i"));
		   return element;
	}
	public static WebElement Wordpress(WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='active-types']/div[2]/i"));
		   return element;
	}
	public static WebElement Tumblr(WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='active-types']/div[2]/i"));
		   return element;
	}
	public static WebElement Filter(WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='btn_filter']"));
		   return element;
	}

}

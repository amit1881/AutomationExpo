package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Filter_Post {

	private static WebElement element=null;
	public static WebElement Types(WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='active-types']/div[2]/i"));
		   return element;
	}
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
	public static WebElement Satus(WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='active-status']/div[2]/img"));
		   return element;
	}
	public static WebElement DateFrom(WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='datefrom']"));
		   return element;
	}
	public static WebElement DatePicker(WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[3]/a"));
		   return element;
	}
	public static WebElement DateTo(WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='dateto']"));
		   return element;
	}
	public static WebElement DatePickerTo(WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[3]/a"));
		   return element;
	}
	public static WebElement Filter(WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='btn_filter']"));
		   return element;
	}
	public static WebElement FilterClear(WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='list-filter-form']/div[1]/div[3]/a"));
		   return element;
	}

}

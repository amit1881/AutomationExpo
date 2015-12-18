
package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Multipublishpost {
	private static WebElement element=null;
	
	public static WebElement AddNewPost(WebDriver driver)
	{
		 element=driver.findElement(By.xpath("html/body/div[3]/section/div[1]/div/div[1]/div[1]/div[1]/a"));
		   return element;
	}
	public static WebElement Multipost(WebDriver driver)
	{
		element=driver.findElement(By.xpath("html/body/div[3]/div[1]/ul/li[2]/a"));
		return element;
	}
	
	public static WebElement Summernote(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='summernote']"));
		return element;
	}
	public static WebElement Addimage(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='show-image']"));
		return element;
	}
	public static WebElement Browse(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='multipost_form']/div/div[1]/div[4]/div[2]/a"));
		return element;
	}
	public static WebElement Networkfb(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='multipost_form']/div/div[2]/div[1]/div/div[1]"));
		return element;
	}
	public static WebElement Networktwi(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='multipost_form']/div/div[2]/div[1]/div/div[2]"));
		return element;
	}
	public static WebElement Publishnow(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='btn-publish']"));
		return element;
	}
	public static WebElement Scheduledpost(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='multipost_form']/div/div[2]/div[2]/div[1]/div"));
		return element;
	}
	public static WebElement Clander(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='multipost_form']/div/div[2]/div[2]/div[2]/div/div/div"));
		return element;
	}
	public static WebElement Time(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='multipost_form']/div/div[2]/div[2]/div[2]/div/div/div/div[2]/div[1]/table/tbody/tr[1]/td[3]/a/span"));
		return element;
	}
	public static WebElement Scheduledbtn(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='btn-schedule']"));
		return element;
	}
	
	public static WebElement Publish(WebDriver driver)
	{
		element=driver.findElement(By.xpath("html/body/div[2]/div/div/div/div[3]/div/div[1]/div/div[2]/a"));
		return element;
	}

}
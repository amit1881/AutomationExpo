package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ADD_Events {
	private static WebElement element=null;
	public static WebElement Checkbox (WebDriver driver)
	{
		 element=driver.findElement(By.xpath("html/body/div[3]/section/div[1]/div/div[1]/div[1]/div[2]/ins"));
		   return element;
	}
	public static WebElement Addeventbtn(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='add-event-link']"));
		return element;
	}
	public static WebElement Title (WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='event-name']"));
		   return element;
	}
	public static WebElement Date (WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='event-start-date']"));
		   return element;
	}
	public static WebElement datepicker (WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]/span"));
		   return element;
	}
	public static WebElement dateselect (WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[6]/a"));
		   return element;
	}
	public static WebElement Addbtn (WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='submit-event']"));
		   return element;
	}

	
}

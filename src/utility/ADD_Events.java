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
		 element=driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[4]/a"));
		   return element;
	}
	public static WebElement Addbtn (WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='submit-event']"));
		   return element;
	}
	/*
	 * edit event
	 */
	public static WebElement edit (WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='event-container-fix']/div/div[2]/div[4]/div[6]/div[1]"));
		   return element;
	}
	public static WebElement cancel (WebDriver driver)
	{
		 element=driver.findElement(By.xpath("html/body/div[3]/div[2]/button"));
		   return element;
	}
	public static WebElement Editeventbtn (WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='edit-event-link']"));
		   return element;
	}
	public static WebElement Editeventcancel (WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='add-events-modal']/div[2]/div/div[1]/button"));
		   return element;
	}
	public static WebElement EditTitle (WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='event-name']"));
		   return element;
	}
	public static WebElement EditADD (WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='submit-event']"));
		   return element;
	}
	public static WebElement Editdate (WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='event-start-date']"));
		   return element;
	}
	public static WebElement Editdateselect (WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[4]/a"));
		   return element;
	}
	public static WebElement delete (WebDriver driver)
	{
		 element=driver.findElement(By.xpath("html/body/div[3]/div[2]/div[2]/div[1]/a"));
		   return element;
	}
}

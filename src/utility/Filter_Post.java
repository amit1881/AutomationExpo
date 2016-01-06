package utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Filter_Post {

	private static WebElement element=null;
	private static List<WebElement> elements=null;
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
	public static WebElement Status(WebDriver driver)
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
	/*
	 * List View and Grid View button elements
	 */
	//List view button element
	public static WebElement ListViewBtn(WebDriver driver){
		element=driver.findElement(By.xpath("html/body/div[3]/div/div[1]/div[2]/a[1]"));
		return element;
	}
	//Grid view button element
	public static WebElement GridViewBtn(WebDriver driver){
		element=driver.findElement(By.xpath("html/body/div[3]/div/div[1]/div[2]/a[2]"));
		return element;
	}
	/*
	 * sort posts by elements
	 */
	//Select dropdown
	public static WebElement SelectSortdd(WebDriver driver){
		element=driver.findElement(By.xpath(".//*[@id='heapbox_select-sort-by']/a[1]"));
		return element;
	}
	//Date added
	public static WebElement DateAdded(WebDriver driver){
		element=driver.findElement(By.xpath(".//*[@id='heapbox_select-sort-by']/div/ul/li[2]/a"));
		return element;
	}
	//Schedule date
	public static WebElement ScheduleDate(WebDriver driver){
		element=driver.findElement(By.xpath(".//*[@id='heapbox_select-sort-by']/div/ul/li[3]/a"));
		return element;
	}
	public static List<WebElement> SelectSortTypes(WebDriver driver){
		elements=driver.findElements(By.cssSelector("li.heapOption>a"));
		return elements;
	}

}

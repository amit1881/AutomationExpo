package utility;


import org.openqa.selenium.*;

public class Publishpost {

	private static WebElement element=null;
		// TODO Auto-generated method stub
	public static WebElement AddNewPost(WebDriver driver)
	{
		 element=driver.findElement(By.xpath("html/body/div[3]/section/div[1]/div/div[1]/div[1]/div[1]/a"));
		   return element;
	}
	public static WebElement Standardpost(WebDriver driver)
	{
		element=driver.findElement(By.xpath("html/body/div[3]/div[1]/ul/li[1]/a"));
		return element;
	}
	public static WebElement Heapbox(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='heapbox_network-list-1']/a[2]"));
		return element;
	}
	public static WebElement Channel(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='heapbox_network-list-1']/div/ul/li[2]/a"));
		return element;
	}
	public static WebElement Summernote(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='summernote-1']"));
		return element;
	}
	public static WebElement AddImage(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='show-image-1']"));
		return element;
	}
	public static WebElement Browse(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='image-box-body-1']/a"));
		return element;
	}
	public static WebElement Publishnow(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='btn-publish']"));
		return element;
	}
	public static WebElement SchedPubDateBtn(WebDriver driver)
	{
		element=driver.findElement(By.xpath("html/body/div[3]/div[2]/div[2]/div/div[1]/div/span[2]"));
		return element;
	}
	public static WebElement DatePicker(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='datepicker']"));
		return element;
	}
	public static WebElement ScheduleBtn(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='btn-schedule']"));
		return element;
	}
	public static WebElement Draft(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='btn-draft']"));
		return element;
	}
	public static WebElement Publish(WebDriver driver)
	{
		element=driver.findElement(By.xpath("html/body/div[2]/div/div/div/div[3]/div/div[1]/div/div[2]/a"));
		return element;
	}
	public static WebElement CancelBtn(WebDriver driver)
	{
		element=driver.findElement(By.xpath("html/body/div[3]/div[2]/div[2]/div/div[3]/div/a"));
		return element;
	}
}



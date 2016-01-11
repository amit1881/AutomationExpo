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
	

	/*
	 * Draft post edit
	 */
	
	public static WebElement Draftpostlink(WebDriver driver)
	{
		element=driver.findElement(By.xpath("html/body/div[3]/div/div[3]/div/table/tbody/tr[15]/td[2]/a"));
		return element;
	}
	public static WebElement Editbtn(WebDriver driver)
	{
		element=driver.findElement(By.xpath("html/body/div[3]/div/div/div/div[1]/div[1]/div[2]/div[2]/div[1]/input"));
		return element;
	}
	public static WebElement note(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='summernote']"));
		return element;
	}
	public static WebElement draft_btn(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='btn-draft']"));
		return element;
	}
	public static WebElement publishlink(WebDriver driver)
	{
		element=driver.findElement(By.xpath("html/body/div[2]/div/div/div/div[3]/div/div[1]/div/div[2]/a"));
		return element;
	}
	
	
	/*
	 * schedule post edit
	 */
	public static WebElement schedulepostlink(WebDriver driver)
	{
		element=driver.findElement(By.xpath("html/body/div[3]/div/div[3]/div/table/tbody/tr[3]/td[2]/a"));
		return element;
	}
	public static WebElement schedule_editbtn(WebDriver driver)
	{
		element=driver.findElement(By.xpath("html/body/div[3]/div/div/div/div[1]/div[1]/div[2]/div[2]/div[1]/input"));
		return element;
	}
	public static WebElement schedule_note(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='summernote']"));
		return element;
	}

	public static WebElement schedule_postbtn(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='edit-multiple-form']/div/div[2]/div[2]/div[1]/div"));
		return element;
	}

}



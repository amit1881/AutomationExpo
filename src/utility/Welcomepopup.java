package utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Welcomepopup {

	private static WebElement element=null;
	public static WebElement AddNewProject(WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='myModal']/div[2]/div/div[1]/div[2]/div[2]/a/button"));
		   return element;
	}
	public static WebElement ProjectTitle(WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='add-project-form']/div[1]/input[1]"));
		   return element;
	}
	public static WebElement SelectNetwork(WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='heapbox_network-select']/a[2]"));
		   return element;
	}
	public static WebElement NetworkFb(WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='heapbox_network-select']/div/ul/li[2]/a"));
		   return element;
	}
	public static WebElement ADDNetwork(WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='add_channel']"));
		   return element;
	}
	public static WebElement NetworkTwitter(WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='heapbox_network-select']/div/ul/li[3]/a"));
		   return element;
	}
	public static WebElement NetworkLinkedin(WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='heapbox_network-select']/div/ul/li[4]/a"));
		   return element;
	}
	public static WebElement NetworkYouTube(WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='heapbox_network-select']/div/ul/li[5]/a"));
		   return element;
	}
	public static WebElement NetworkTumblr(WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='heapbox_network-select']/div/ul/li[6]/a"));
		   return element;
	}
	public static WebElement AddProject(WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='add_project']"));
		   return element;
	}
	public static WebElement AddNewPost(WebDriver driver)
	{
		 element=driver.findElement(By.xpath("html/body/div[3]/div/div[1]/div[1]/a"));
		   return element;
	}
}

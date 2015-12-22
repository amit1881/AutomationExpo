package Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;

public class Generalpage {

	private static WebElement element=null;
	public static WebElement DropDwon(WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='caret']"));
		   return element;
	}
	public static WebElement generalsetting(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='dropdown']/div[2]/div[2]/div[1]/a"));
		return element;
	}
	public static WebElement Firstname(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='firstname']"));
		return element;
	}
	public static WebElement Lastname(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='secondname']"));
		return element;
	}
	public static WebElement Browserbtn(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='general-setting-form']/div[6]/div[1]/a"));
		return element;
	}
	public static WebElement Job(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='jobtitle']"));
		return element;
	}
	public static WebElement Organisation(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='jobtitle']"));
		return element;
	}
	public static WebElement Updatebtn(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='general-setting-form']/div[9]/div/button"));
		return element;
	}
}

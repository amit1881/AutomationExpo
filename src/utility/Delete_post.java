package utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Delete_post {

	private static WebElement element=null;
	public static WebElement Publish(WebDriver driver)
	{
		 element=driver.findElement(By.xpath("html/body/div[2]/div/div/div/div[3]/div/div[1]/div/div[2]/a"));
		   return element;
	}
	public static WebElement Checkbox(WebDriver driver)
	{
		 element=driver.findElement(By.xpath("html/body/div[3]/div/div[3]/div/table/tbody/tr[1]/td[6]/div/label"));
		   return element;
	}
	public static WebElement Deletepost(WebDriver driver)
	{
		 element=driver.findElement(By.xpath(".//*[@id='delete-posts']"));
		   return element;
	}
	public static WebElement Ok(WebDriver driver)
	{
		 element=driver.findElement(By.xpath("html/body/div[5]/div[2]/div/div[2]/button[2]"));
		   return element;
	}
	public static WebElement cancel(WebDriver driver)
	{
		 element=driver.findElement(By.xpath("html/body/div[5]/div[2]/div/div[2]/button[1]"));
		   return element;
	}
}

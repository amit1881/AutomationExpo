package testCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.ADD_Events;
public class Add_Evant {

	public static void main(String[] args) {
	 WebDriver driver=new FirefoxDriver();
	 Login_ravabe.DoLogin(driver);
	 driver.navigate().refresh();
	 ADD_Events.Checkbox(driver).click();
	 ADD_Events.Addeventbtn(driver).click();
	 ADD_Events.Title(driver).sendKeys("Happy new year");
	 ADD_Events.Date(driver).click();
	 ADD_Events.datepicker(driver).click();
	 ADD_Events.dateselect(driver).click();
	 ADD_Events.Addbtn(driver).click();
	 

}
}

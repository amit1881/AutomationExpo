package testcases;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.ADD_Events;
public class Add_Evant {

	public static void main(String[] args) throws InterruptedException, IOException {
	 WebDriver driver=new FirefoxDriver();
	 Login_ravabe.DoLogin(driver);
	 driver.navigate().refresh();
	 ADD_Events.Checkbox(driver).click();
	 ADD_Events.Addeventbtn(driver).click();
	 ADD_Events.Title(driver).sendKeys("hapyy birthday chotu");
	 ADD_Events.Date(driver).click();
	// ADD_Events.datepicker(driver).click();
	 ADD_Events.dateselect(driver).click();
	 ADD_Events.Addbtn(driver).click();
	 System.out.print("Would you like to events(yes/no)::");
	 InputStreamReader isr=new InputStreamReader(System.in);
	 BufferedReader brd=new BufferedReader(isr);
	 String str=brd.readLine();
	 while(str.equals("yes")){
	 InputStreamReader input= new InputStreamReader(System.in);
     BufferedReader br = new BufferedReader(input);
     System.out.print("Enter Title choice::");
     String choice=br.readLine();
		 switch(choice.toLowerCase()){
		 case "edit":{
			 ADD_Events.edit(driver).click();
			 
			 break; 
		 }
		 case "cancel":{
			 ADD_Events.edit(driver).click();
			 ADD_Events.cancel(driver).click();
			 break;
		 }
		 case "editeventbtn":{
			 ADD_Events.Editeventbtn(driver).click();
			 break;
		 }
		 case "cancelbtn":{
			 ADD_Events.edit(driver).click();
			 ADD_Events.Editeventbtn(driver).click();
			 ADD_Events.Editeventcancel(driver).click();
			 break;
		 }
		 case "edittitle":{
			 ADD_Events.edit(driver).click();
			 ADD_Events.Editeventbtn(driver).click();
			 ADD_Events.EditTitle(driver).clear();
			 Thread.sleep(2000);
			 ADD_Events.EditTitle(driver).sendKeys("new");
			 ADD_Events.EditADD(driver).click();
			 break; 
		 }
		 case "editdate":{
			 ADD_Events.edit(driver).click();
			 ADD_Events.Editeventbtn(driver).click();
			 ADD_Events.Editdate(driver).click();
			 ADD_Events.Editdate(driver).clear();
			 Thread.sleep(2000);
			 ADD_Events.Editdateselect(driver).click();
			 ADD_Events.EditADD(driver).click();
			 break; 
			 
		 }
		 case "delete":{
			 ADD_Events.edit(driver).click();
			 ADD_Events.delete(driver).click();
			 break; 
		 }
		 }
		 System.out.print("Would you like to continue with event::");
		 InputStreamReader isrd=new InputStreamReader(System.in);
		 BufferedReader brdr=new BufferedReader(isrd);
		 str=brdr.readLine();
		 if(str.equals("no")){
			 System.out.println("ok, thanks");
		 }

}//End while
}
}
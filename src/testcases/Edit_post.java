package testcases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.Publishpost;

public class Edit_post {

	public static void main(String[] args) throws InterruptedException, IOException {
		 WebDriver driver=new FirefoxDriver();
		 Login_ravabe.DoLogin(driver);
		 driver.navigate().refresh();
		 Publishpost.publishlink(driver).click();
		 InputStreamReader input= new InputStreamReader(System.in);
	      BufferedReader br = new BufferedReader(input);
	      System.out.print("Enter edit choice::");
	      String choice=br.readLine();
			 switch(choice.toLowerCase()){
			 case "editdraft":{
				 Publishpost.Draftpostlink(driver).click();
				 Publishpost.Editbtn(driver).click();
				 Publishpost.note(driver).clear();
				 Publishpost.note(driver).sendKeys("new draft post");
				 Publishpost.draft_btn(driver).click();
				 break;
			 }
			 case "editschedulepost":{
				 Publishpost.schedulepostlink(driver).click();
				 Publishpost.schedule_editbtn(driver).click();
				 Publishpost.schedule_note(driver).clear();
				 Publishpost.schedule_note(driver).sendKeys("new schedule post");
				 Publishpost.schedule_postbtn(driver).click();
				 Publishpost.DatePicker(driver).clear();
				 Publishpost.DatePicker(driver).sendKeys("2016-12-31 03:44 PM");
				 Publishpost.ScheduleBtn(driver).click();
				 break;
				 
			 }
}
	}
}

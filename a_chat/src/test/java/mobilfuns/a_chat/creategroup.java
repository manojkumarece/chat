package mobilfuns.a_chat;



import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import pageObjects.Chathomepage;
import pageObjects.creategroup_page;
import pageObjects.starredmessage_page;
import resources.base;

import org.testng.annotations.BeforeTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;

public class creategroup extends base{
	public  AndroidDriver<MobileElement> driver;
	public static Logger log =LogManager.getLogger(base.class.getName());
	
	@BeforeTest 
	public void BeforeTest() throws IOException, InterruptedException {
		
		driver=intilizeDriver();
		log.info("Intilized Achat Application");
		

	
	}
	
	
	@Test (priority=1)
	public void create_group() throws IOException, InterruptedException {
		
try {
		
       creategroup_page cp=new creategroup_page(driver);
       cp.moreoptions().click();
       cp.newgroupmenu().click();
       cp.user1().click();
       cp.user2().click();
       cp.done().click();
       cp.groupname().click();
       cp.groupname().sendKeys("Chennai superkings");
       cp.created().click();
       log.info("Group created");
		
		   
}
catch(Exception e) {
 e.printStackTrace();
}
			
	}
	
	@Test (priority=2)
	public void exit_group() throws IOException, InterruptedException {
		
try {
		
       creategroup_page cp=new creategroup_page(driver);
       for(MobileElement we :cp.groupnames()) {	
   		System.out.println(we.getText());
   		if(we.getText().equalsIgnoreCase("Chennai superkings")) {
   			
   			 AndroidTouchAction touch = new AndroidTouchAction (driver);
   		      touch.longPress(LongPressOptions.longPressOptions()
   		                      .withElement (ElementOption.element (we)).withDuration(Duration.ofMillis(300)))
   		                    .perform ();
   			log.info("Match the groupname and selected");
   		    cp.exitgroup().click();
   		   
   		    	
   		    	cp.ok().click();
   		    	
   		    
   		  log.info("Successfully group exited");
   		    break;
   		}
   	}
		
		   
}
catch(Exception e) {
 e.printStackTrace();
}
			
	}

	@Test (priority=3)
	public void delete_group() throws IOException, InterruptedException {
		
try {
	
	  creategroup_page cp=new creategroup_page(driver);
      for(MobileElement we :cp.groupnames()) {	
  		System.out.println(we.getText());
  		if(we.getText().equalsIgnoreCase("Chennai superkings")) {
  			
  			 AndroidTouchAction touch = new AndroidTouchAction (driver);
  		      touch.longPress(LongPressOptions.longPressOptions()
  		                      .withElement (ElementOption.element (we)).withDuration(Duration.ofMillis(300)))
  		                    .perform ();
  			log.info("Match the groupname and selected");
  		    cp.deletegroup().click();
  			log.info("Successfully group deleted");
  		    break;
  		}
  	}    
		   
}
catch(Exception e) {
 e.printStackTrace();
}
			
	}
	

	
	@AfterTest
	
	public void AfterTest() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.closeApp();
		
		
	
	
		
	}

}

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
import pageObjects.deletechat_page;
import pageObjects.forwardmsg_page;
import pageObjects.starredmessage_page;
import resources.base;

import org.testng.annotations.BeforeTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;

public class deletechat extends base{
	public  AndroidDriver<MobileElement> driver;
	public static Logger log =LogManager.getLogger(base.class.getName());
	
	@BeforeTest 
	public void BeforeTest() throws IOException, InterruptedException {
		
		driver=intilizeDriver();
		log.info("Intilized Achat Application");
		

	
	}
	
	

	
	
	@Test 
	public void deletchat() throws IOException, InterruptedException {
		
try {
		
        deletechat_page ch=new deletechat_page(driver);
		
		
		for(MobileElement we :ch.chatnames()) {	
		System.out.println(we.getText());
		if(we.getText().equalsIgnoreCase("Abhishek Pandey ")) {
			
			 AndroidTouchAction touch = new AndroidTouchAction (driver);
		      touch.longPress(LongPressOptions.longPressOptions()
		                      .withElement (ElementOption.element (we)).withDuration(Duration.ofMillis(300)))
		                    .perform ();
			log.info("Match the chatname and selected");
			ch.deletechat().click();
			ch.delete().click();
			log.info("Successfully chatname deleted");
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

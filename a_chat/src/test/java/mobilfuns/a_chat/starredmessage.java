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
import pageObjects.starredmessage_page;
import resources.base;

import org.testng.annotations.BeforeTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;

public class starredmessage extends base{
	public  AndroidDriver<MobileElement> driver;
	public static Logger log =LogManager.getLogger(base.class.getName());
	
	@BeforeTest 
	public void BeforeTest() throws IOException, InterruptedException {
		
		driver=intilizeDriver();
		log.info("Intilized Achat Application");
		

	
	}
	
	
	@Test 
	public void verify_starredmsg() throws IOException, InterruptedException {
		
try {
		
        Chathomepage ch=new Chathomepage(driver);
		ch.contacts().click();
		
		for(MobileElement we :ch.contactslist()) {	
		System.out.println(we.getText());
		if(we.getText().equalsIgnoreCase("Abhishek Pandey ")) {
			
			we.click();
			log.info("Match the contacts and selected");
		    break;
		}
	}
		starredmessage_page st=new starredmessage_page(driver);
		 AndroidTouchAction touch = new AndroidTouchAction (driver);
	      touch.longPress(LongPressOptions.longPressOptions()
	                      .withElement (ElementOption.element (st.selectstarredmsg())).withDuration(Duration.ofMillis(500))).release()
	                    .perform ();
	     log.info("Select messages or videos or images or doc");
		st.starredicon().click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		st.moreoptions().click();
		st.starredmsgmenu().click();
		log.info("Successfuly verified starred message");
		
		   
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

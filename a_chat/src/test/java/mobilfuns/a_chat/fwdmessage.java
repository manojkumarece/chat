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
import pageObjects.forwardmsg_page;
import pageObjects.starredmessage_page;
import resources.base;

import org.testng.annotations.BeforeTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;

public class fwdmessage extends base{
	public  AndroidDriver<MobileElement> driver;
	public static Logger log =LogManager.getLogger(base.class.getName());
	
	@BeforeTest 
	public void BeforeTest() throws IOException, InterruptedException {
		
		driver=intilizeDriver();
		log.info("Intilized Achat Application");
		

	
	}
	
	
	@Test (enabled =false)
	public void send_fwdmsg() throws IOException, InterruptedException {
		
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
		forwardmsg_page st=new forwardmsg_page(driver);
		 AndroidTouchAction touch = new AndroidTouchAction (driver);
	      touch.longPress(LongPressOptions.longPressOptions()
	                      .withElement (ElementOption.element (st.selectmsgs())).withDuration(Duration.ofMillis(500)))
	                    .perform ();
	    log.info("Select messages or videos or images or doc");
		st.fwdicon().click();
		st.selctfwdcont().click();
		st.sentbtn().click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		log.info("Successfuly message forwarded");
		
		   
}
catch(Exception e) {
 e.printStackTrace();
}
	  
				       
			
	}
	
	
	@Test (enabled =false)
	public void send_replymsg() throws IOException, InterruptedException {
		
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
		forwardmsg_page st=new forwardmsg_page(driver);
		 AndroidTouchAction touch = new AndroidTouchAction (driver);
	      touch.longPress(LongPressOptions.longPressOptions()
	                      .withElement (ElementOption.element (st.selectmsgs())).withDuration(Duration.ofMillis(500)))
	                    .perform ();
	    log.info("Select messages or videos or images or doc");
		st.replyicon().click();
		st.edittext().click();
		st.edittext().sendKeys("hi");
		st.enterchat().click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		log.info("Successfuly message replied");
		
		   
}
catch(Exception e) {
 e.printStackTrace();
}
	  
				       
			
	}

	@Test (enabled =false)
	public void deletemsg() throws IOException, InterruptedException {
		
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
		forwardmsg_page st=new forwardmsg_page(driver);
		 AndroidTouchAction touch = new AndroidTouchAction (driver);
	      touch.longPress(LongPressOptions.longPressOptions()
	                      .withElement (ElementOption.element (st.selectmsgs())).withDuration(Duration.ofMillis(500)))
	                    .perform ();
	    log.info("Select messages or videos or images or doc");
		st.deleteicon().click();
		st.deleteforme().click();
		
		log.info("Successfuly message deleted");
		
		   
}
catch(Exception e) {
 e.printStackTrace();
}
	  
				       
			
	}
	
	
	@Test (enabled =false)
	public void Mutechat() throws IOException, InterruptedException {
		
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
		forwardmsg_page st=new forwardmsg_page(driver);
		st.moreoptions().click();
		st.mute().click();
		st.mute_time().click();
		st.confirm().click();
		
		log.info("Successfuly chat mute");
		
		   
}
catch(Exception e) {
 e.printStackTrace();
}
	  
				       
			
	}

	
	@Test (enabled =false)
	public void clearchat() throws IOException, InterruptedException {
		
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
		forwardmsg_page st=new forwardmsg_page(driver);
		st.moreoptions().click();
		st.clearchat().click();
		st.ok().click();
		log.info("Successfuly message cleared");
		
		   
}
catch(Exception e) {
 e.printStackTrace();
}
	  
				       
			
	}


	@Test (enabled =false)
	public void blockcontact() throws IOException, InterruptedException {
		
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
		forwardmsg_page st=new forwardmsg_page(driver);
		st.usermenu().click();
		st.block().click();
		
		st.ok().click();
		log.info("Successfuly user blocked");
		
		   
}
catch(Exception e) {
 e.printStackTrace();
}
	  
				       
			
	}
	
	
	@Test 
	public void addfavourite() throws IOException, InterruptedException {
		
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
		forwardmsg_page st=new forwardmsg_page(driver);
		st.usermenu().click();
		st.addfav().click();
		
		st.ok().click();
		log.info("Successfuly added favouritelist");
		
		   
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

package mobilfuns.a_chat;



import java.io.IOException;


import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import pageObjects.Chathomepage;

import resources.base;

import org.testng.annotations.BeforeTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;

public class chatpage extends base{
	public  AndroidDriver<MobileElement> driver;
	public static Logger log =LogManager.getLogger(base.class.getName());
	
	@BeforeTest 
	public void BeforeTest() throws IOException, InterruptedException {
		
		driver=intilizeDriver();
		log.info("Intilized Achat Application");
		

	
	}
	
	@Test (enabled = false)
	public void chatlist() throws IOException, InterruptedException {
		

		
        Chathomepage ch=new Chathomepage(driver);
		int size=ch.chatlist().size();
		System.out.println("Total chat list ="  + size);
		
		for(int j=0;j<size;j++)
		{

				   String chatname=ch.chatlist().get(j).getText();
				   String Lastmsgtime=ch.lastmsgtime().get(j).getText();
				   System.out.println( chatname + "\n" + Lastmsgtime); 
				   Thread.sleep(2000);
			   }
		
		log.info("Successfully Chatname and last message time retrived");
		
			
	}
	
	@Test (enabled = false)
	public void callslist() throws IOException, InterruptedException {
		

		
        Chathomepage ch=new Chathomepage(driver);
		ch.callstab().click();
		int size=ch.calllist().size();
		System.out.println("Total call list ="  + size);
		
		for(int j=0;j<size;j++)
		{

				   String callnames=ch.calllist().get(j).getText();
				   String Lastcalltime=ch.lastcalltime().get(j).getText();
				   System.out.println( callnames + "\n" + Lastcalltime); 
				   Thread.sleep(2000);
			   }
		
		log.info("Successfully callnames and last call time retrived");
		
			
	}

	@Test (enabled = false)
	public void contactslist() throws IOException, InterruptedException {
		

		
        Chathomepage ch=new Chathomepage(driver);
		ch.contacts().click();
		int size=ch.contactslist().size();
		System.out.println("Total contacts list ="  + size);
		
		for(int j=0;j<size;j++)
		{

				   String Contactname=ch.contactslist().get(j).getText();
				   String Statusname=ch.statusname().get(j).getText();
				   System.out.println( Contactname + "\n" + Statusname); 
				   Thread.sleep(2000);
			   }
		
		log.info("Successfully contactlist and statusname retrived");
		
			
	}
	
	@Test 
	public void verify_mediadoc() throws IOException, InterruptedException {
		
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
		   ch.usermenu().click();
		   ch.media().click();
		   ch.mediafst().click();
		   Thread.sleep(1000);
		   driver.pressKey(new KeyEvent(AndroidKey.BACK));
		   log.info("Successfully verified the media files");
		   
		   ch.documentstab().click();
		   ch.selectfstdoc().click();
		   driver.pressKey(new KeyEvent(AndroidKey.BACK));
		   log.info("Successfully verified the document files");
		   
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

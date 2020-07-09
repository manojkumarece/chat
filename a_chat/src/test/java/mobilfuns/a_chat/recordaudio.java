package mobilfuns.a_chat;



import java.io.IOException;
import java.time.Duration;


import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;

import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import pageObjects.Chathomepage;
import pageObjects.pinnumbpage;
import pageObjects.recordaudio_page;


import resources.base;

import org.testng.annotations.BeforeTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.annotations.AfterTest;
public class recordaudio extends base{
	public  AndroidDriver<MobileElement> driver;
	public static Logger log =LogManager.getLogger(base.class.getName());
	
	@BeforeTest 
	public void BeforeTest() throws IOException, InterruptedException {
		
		driver=intilizeDriver();
		
		log.info("Intilized Achat Application");
		pinnumbpage lp=new pinnumbpage(driver);
		lp.enterpin().sendKeys(prop.getProperty("pinnumber"));
		log.info("Enter new pin");
		lp.enterpin().sendKeys(prop.getProperty("pinnumber"));
		log.info("Enter confirm pin");
		Chathomepage ch=new Chathomepage(driver);
		ch.contacts().click();
		log.info("Click contacts tab");
		ch.selecont().click();
		log.info("Click one contacts");
		
	}
	
	@Test
	public void record_audio() throws IOException, InterruptedException {
		

		
       
		recordaudio_page st=new recordaudio_page(driver);
		
		 AndroidTouchAction touch = new AndroidTouchAction (driver);
	      touch.longPress(LongPressOptions.longPressOptions()
	                      .withElement (ElementOption.element (st.recordaudio())).withDuration(Duration.ofMillis(2000))).release()
	                    .perform ();
		
		st.sendaudio().click();
		
		log.info("Successfully send audios");
		
		
	
		
		
			
	}
	
	
	@AfterTest
	
	public void AfterTest() throws InterruptedException {
		
		
		Thread.sleep(5000);
		driver.closeApp();
		
		
		
		
	}

}

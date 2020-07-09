package mobilfuns.a_chat;



import java.io.IOException;


import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import pageObjects.Chathomepage;
import pageObjects.pinnumbpage;

import pageObjects.timerset_msgsend_page;
import resources.base;

import org.testng.annotations.BeforeTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.annotations.AfterTest;
public class timer_msg extends base{
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
	public void timermsg() throws IOException, InterruptedException {
		

		
        
		
		timerset_msgsend_page st=new timerset_msgsend_page(driver);
		st.timer().click();
		log.info("Click timer icon");
		st.settime().click();
		log.info("select timer");
		st.msgbox().click();
		log.info("Click text message box");
		st.msgbox().sendKeys("how are u");
		st.sendbutton().click();
		log.info("Successfully send message");
		
		
		
			
	}
	
	
	@AfterTest
	
	public void AfterTest() throws InterruptedException {
		
		
		Thread.sleep(5000);
		driver.closeApp();
		
		
		
		
	}

}

package mobilfuns.a_chat;



import java.io.IOException;


import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import pageObjects.Chathomepage;
import pageObjects.pinnumbpage;

import pageObjects.voicecall_page;
import resources.base;

import org.testng.annotations.BeforeTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.annotations.AfterTest;
public class voicecall extends base{
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
	public void voice_call() throws IOException, InterruptedException {
		

		
      
	
		voicecall_page st=new voicecall_page(driver);
		st.voicecall().click();
		log.info("Click voicecall");
		st.disconnect().click();
		log.info("Disconnect the call");

		
		
		
			
	}
	
	
	@AfterTest
	
	public void AfterTest() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.closeApp();
		
		
		
		
	}

}

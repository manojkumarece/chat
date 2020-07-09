package mobilfuns.a_chat;



import java.io.IOException;


import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import pageObjects.Chathomepage;
import pageObjects.pinnumbpage;

import pageObjects.sendvideos_page;
import resources.base;

import org.testng.annotations.BeforeTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.annotations.AfterTest;
public class sendvideos extends base{
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
	public void	send_videos()throws IOException, InterruptedException {
		                  
      
		
       
		
		sendvideos_page st=new sendvideos_page(driver);
		st.attachicon().click();
		log.info("Click video image icon");
		st.vidofile_icon().click(); 
		log.info("Click video file icon");
		st.vidcategory().click();
		
		log.info("Click video category");
		st.choosevideos().click();
		log.info("choose videos");
		
		st.select_videos().click();
		st.confirm().click();
		log.info("Confirm the videos");
		st.sendbutton().click();
		log.info("Successfully send videos");
	
		
		
			
	}
	
	
	@AfterTest
	
	public void AfterTest() throws InterruptedException {
		
		
		Thread.sleep(5000);
		driver.closeApp();
		
		
		
		
	}

}

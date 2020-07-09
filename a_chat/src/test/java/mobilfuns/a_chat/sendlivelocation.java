package mobilfuns.a_chat;



import java.io.IOException;


import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import pageObjects.Chathomepage;
import pageObjects.pinnumbpage;

import pageObjects.sharelivlocation_page;
import resources.base;

import org.testng.annotations.BeforeTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.annotations.AfterTest;
public class sendlivelocation extends base{
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
	
	@Test (priority=1)
	public void send_currentlocation() throws IOException, InterruptedException {
		

		
   
		sharelivlocation_page st=new sharelivlocation_page(driver);
		st.attachicon().click();
		log.info("Click loc icon");
		st.location_icon().click();
		log.info("Click location file");
		st.selclocation().click();
		st.sendlocation().click();
		log.info("Successfully send current location");
			
			
	}
	
	@Test (priority=2)
	public void send_differentlocation() throws IOException, InterruptedException {
		

		
   
		sharelivlocation_page st=new sharelivlocation_page(driver);
		st.attachicon().click();
		log.info("Click loc icon");
		st.location_icon().click();
		log.info("Click location file");
		st.searchfield().click();
		st.searchdifferentloc().click();
		st.searchdifferentloc().sendKeys(prop.getProperty("locationName"));
		log.info("Enter the location name");
		st.selectfst().click();
		st.sendlocation().click();
		log.info("Successfully send "+ prop.getProperty("locationName")+" location details");
			
			
	}
	
	
	@AfterTest
	
	public void AfterTest() throws InterruptedException {
		
		
		Thread.sleep(5000);
		driver.closeApp();
		
		
		
		
	}

}

package mobilfuns.a_chat;



import java.io.IOException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import pageObjects.pinnumbpage;
import resources.base;


public class validatetitle extends base{
	public  AndroidDriver<MobileElement> driver;
	public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest 
	public void BeforeTest() throws IOException {
		
		driver=intilizeDriver();
		log.info("Intilized Achat Application");
		
	}

	
	@Test
	public void validate() throws IOException, InterruptedException {
		
		
		
		pinnumbpage lp=new pinnumbpage(driver);
		lp.enterpin().sendKeys(prop.getProperty("pinnumber"));
		log.info("Enter pin number");
		lp.enterpin().sendKeys(prop.getProperty("pinnumber"));
		log.info("Enter confirm pin number");
		Assert.assertEquals(lp.gettitle().getText(), "aChat123");
		log.info("Successfully validated text message");
		
			
		
	}
	
@AfterTest
	
	public void teardown() throws InterruptedException {
		
		
		
		
	Thread.sleep(5000);
	driver.closeApp();
		
		
	}

	
	
	

}

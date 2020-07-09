package mobilfuns.a_chat;



import java.io.IOException;


import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import pageObjects.Chathomepage;
import pageObjects.pinnumbpage;
import pageObjects.sendimages_page;

import resources.base;

import org.testng.annotations.BeforeTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.annotations.AfterTest;
public class sendimages extends base{
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
	public void send_imges() throws IOException, InterruptedException {
		

		
        
		sendimages_page st=new sendimages_page(driver);
		
		st.imgicon().click();
		log.info("Click image icon");
		
		st.imgchoose().click();
		log.info("Click image file");
		
		st.selcategory().click();
		log.info("Click image category");
		
		st.seleimage().click();
		log.info("Click images");
		st.confirm().click();
		
		st.conf().click();
		log.info("Confirm the images");
	
		st.sendbutton().click();
		log.info("Successfully send images");
		
				
	}
	
	
	@AfterTest
	
	public void AfterTest() throws InterruptedException {
		
		
		Thread.sleep(5000);
		driver.closeApp();
		
		
		
	}

}

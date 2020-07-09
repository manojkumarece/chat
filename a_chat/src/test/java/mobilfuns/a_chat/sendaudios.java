package mobilfuns.a_chat;



import java.io.IOException;


import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import pageObjects.Chathomepage;
import pageObjects.pinnumbpage;
import pageObjects.sendaudios_page;


import resources.base;

import org.testng.annotations.BeforeTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.annotations.AfterTest;
public class sendaudios extends base{
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
	public void send_audios() throws IOException, InterruptedException {
		

		
        
		
		sendaudios_page st=new sendaudios_page(driver);
		st.imgicon().click();
		log.info("Click image icon");
		st.audio_choose().click();
		log.info("Click audio file");
		st.selaudios().click();
		log.info("Successfully send audios");
		
	
		
		
			
	}
	
	
	@AfterTest
	
	public void AfterTest() throws InterruptedException {
		
		
		Thread.sleep(5000);
		driver.closeApp();
		
		
		
		
	}

}

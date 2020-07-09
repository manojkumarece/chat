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
import pageObjects.creategroup_page;
import pageObjects.pinnumbpage;
import pageObjects.recordaudio_page;
import pageObjects.sendaudios_page;
import pageObjects.sendcamera_page;
import pageObjects.senddocu_page;
import pageObjects.sendimages_page;
import pageObjects.sendtextpage;
import pageObjects.sendvideos_page;
import pageObjects.sharelivlocation_page;
import pageObjects.timerset_msgsend_page;
import resources.base;

import org.testng.annotations.BeforeTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.annotations.AfterTest;
public class individualchat extends base{
	public  AndroidDriver<MobileElement> driver;
	public static Logger log =LogManager.getLogger(base.class.getName());
	
	@BeforeTest 
	public void BeforeTest() throws IOException, InterruptedException {
		
		driver=intilizeDriver();
		log.info("Intilized Achat Application");
	
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
	}
	
	@Test (priority=1)
	public void sendtxt() throws IOException, InterruptedException {
		

		
     try {
		
		sendtextpage st=new sendtextpage(driver);
		st.msgbox().click();
		log.info("Click text message box");
		st.msgbox().sendKeys("how are u");
		st.sendbutton().click();
		log.info("Successfully send message");

     }
		catch(Exception e) {
			 e.printStackTrace();
			}
			
	}
	
	@Test (priority=2)
	public void timermsg() throws IOException, InterruptedException {
		

		
		  try {
		
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
		st.timer().click();
		log.info("Click timer icon");
		st.timoff().click();
		log.info("Timer is off");
		
		  }
		
		  catch(Exception e) {
				 e.printStackTrace();
				}	
	}
	
	
	@Test (priority=3)
	public void send_imges() throws IOException, InterruptedException {
		

		
      try {  
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
		catch(Exception e) {
			 e.printStackTrace();
			}
			
	}
	
	@Test (priority=4)
	public void send_documents() throws IOException, InterruptedException {
		

		
      try {
		senddocu_page st=new senddocu_page(driver);
		st.imgicon().click();
		log.info("Click attach icon");
		st.docfile().click();	
		log.info("Select document  file");
		st.docat().click();
		log.info("Click document category");
		st.seldoc().click();
		log.info("Sucessfully send documents");
      }
		catch(Exception e) {
			 e.printStackTrace();
			}
		
			
	}		
	
	@Test (priority=5)
	public void	send_videos()throws IOException, InterruptedException {
		                  
      
		try {
       
		
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
		catch(Exception e) {
			 e.printStackTrace();
			}
		
			
	}
	
	@Test (priority=6)
	public void send_audios() throws IOException, InterruptedException {
		

		
       try { 
		
		sendaudios_page st=new sendaudios_page(driver);
		st.imgicon().click();
		log.info("Click image icon");
		st.audio_choose().click();
		log.info("Click audio file");
		st.selaudios().click();
		log.info("Successfully send audios");
       }
		catch(Exception e) {
			 e.printStackTrace();
			}
		
		
			
	}
	
	@Test (priority=7)
	public void send_currentlocation() throws IOException, InterruptedException {
		

		try {
   
		sharelivlocation_page st=new sharelivlocation_page(driver);
		st.attachicon().click();
		log.info("Click loc icon");
		st.location_icon().click();
		log.info("Click location file");
		st.selclocation().click();
		st.sendlocation().click();
		log.info("Successfully send current location");
	}	
		catch(Exception e) {
			 e.printStackTrace();
			}	
	}
	
	@Test (priority=8)
	public void send_differentlocation() throws IOException, InterruptedException {
		

		try {
   
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
		catch(Exception e) {
			 e.printStackTrace();
			}
			
	}
	
	@Test (priority=9)
	public void send_cameraphoto() throws IOException, InterruptedException {
		

		try {
  
		sendcamera_page st=new sendcamera_page(driver);
		st.attachicon().click();
		log.info("Click attach icon");
		st.camera_icon().click();
		log.info("Click image file");
		st.selphoto().click();
		log.info("Click photo");
		st.okbutton().click();;
	    st.sendbutton().click();
	    log.info("Successfully send camera photo");
		}
		catch(Exception e) {
			 e.printStackTrace();
			}
		
		
			
	}
	
	@Test (priority=10)
	public void record_audio() throws IOException, InterruptedException {
		

		try {
       
		recordaudio_page st=new recordaudio_page(driver);
		
		 AndroidTouchAction touch = new AndroidTouchAction (driver);
	      touch.longPress(LongPressOptions.longPressOptions()
	                      .withElement (ElementOption.element (st.recordaudio())).withDuration(Duration.ofMillis(2000))).release()
	                    .perform ();
		
		st.sendaudio().click();
		
		log.info("Successfully send audios");
		
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

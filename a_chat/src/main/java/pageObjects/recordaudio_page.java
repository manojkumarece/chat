package pageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class recordaudio_page {

	
	public  AndroidDriver<MobileElement> driver;
	
	
	  By recordaudio = By.id("com.chatapp.android:id/record");
	  
     
      By sendaudio=By.id("com.chatapp.android:id/tvPositive");
      
    
	
	
	
	public recordaudio_page(AndroidDriver<MobileElement> driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	 //Click contact and select any one
	
	public void WaitForVisibility(By e) {
		  WebDriverWait wait=new WebDriverWait(driver,10);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(e));
	  }
	
	
public MobileElement recordaudio() {
	    WaitForVisibility(recordaudio);
		return driver.findElement(recordaudio);
	}

public MobileElement sendaudio() {
	WaitForVisibility(sendaudio);
	return driver.findElement(sendaudio);
}



}

package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class voicecall_page {

	
	public  AndroidDriver<MobileElement> driver;
	
	
	 By voicecall = By.id("com.chatapp.android:id/ivVoiceCall");
     
     By disconnect = By.xpath("//android.widget.ImageView[@content-desc=\"Disconnect Call\"]");
     
	
    
	
	
	
	public voicecall_page(AndroidDriver<MobileElement> driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	 //Click contact and select any one
	
	public void WaitForVisibility(By e) {
		  WebDriverWait wait=new WebDriverWait(driver,10);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(e));
	  }
	
	
public MobileElement voicecall() {
		WaitForVisibility(voicecall);
		return driver.findElement(voicecall);
	}

public MobileElement disconnect() {
	WaitForVisibility(disconnect);
	return driver.findElement(disconnect);
}



}

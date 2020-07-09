package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class sendcamera_page {

	
	public  AndroidDriver<MobileElement> driver;
	
	
	By attachicon = By.id("com.chatapp.android:id/attachment_icon");
	

	 
 By camera_icon = By.id("com.chatapp.android:id/camera_choose");
 
 By selphoto = By.xpath("(//GLButton[@content-desc=\"NONE\"])[2]");
 
 By okbutton = By.id("com.sec.android.app.camera:id/okay");
 
 By sendbutton = By.id("com.chatapp.android:id/enter_chat1");
	
	
    
	
	
	
	public sendcamera_page(AndroidDriver<MobileElement> driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	 //Click contact and select any one
	
	public void WaitForVisibility(By e) {
		  WebDriverWait wait=new WebDriverWait(driver,10);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(e));
	  }
	
	
public MobileElement attachicon() {
		WaitForVisibility(attachicon);
		return driver.findElement(attachicon);
	}

public MobileElement camera_icon() {
	WaitForVisibility(camera_icon);
	return driver.findElement(camera_icon);
}

public MobileElement selphoto() {
	WaitForVisibility(selphoto);
	return driver.findElement(selphoto);
}
public MobileElement okbutton() {
	WaitForVisibility(okbutton);
	return driver.findElement(okbutton);
}
public MobileElement sendbutton() {
	WaitForVisibility(sendbutton);
	return driver.findElement(sendbutton);
}


}

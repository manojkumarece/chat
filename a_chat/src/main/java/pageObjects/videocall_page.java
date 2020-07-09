package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class videocall_page {

	
	public  AndroidDriver<MobileElement> driver;
	
	
	 By videocall = By.id("com.chatapp.android:id/ivVideoCall");
     
     By disconnect = By.xpath("//android.widget.ImageView[@content-desc=\"Disconnect Call\"]");
     
    
   
    
	
	
	
	public videocall_page(AndroidDriver<MobileElement> driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	 //Click contact and select any one
	
	public void WaitForVisibility(By e) {
		  WebDriverWait wait=new WebDriverWait(driver,10);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(e));
	  }
	
	
public MobileElement videocall() {
		WaitForVisibility(videocall);
		return driver.findElement(videocall);
	}

public MobileElement disconnect() {
	WaitForVisibility(disconnect);
	return driver.findElement(disconnect);
}



}

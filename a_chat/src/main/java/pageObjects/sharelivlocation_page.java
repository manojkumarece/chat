package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class sharelivlocation_page {

	
	public  AndroidDriver<MobileElement> driver;
	
	
	By attachicon = By.id("com.chatapp.android:id/attachment_icon");
	
	  
   By location_icon = By.id("com.chatapp.android:id/location_choose");
   
   By selclocation = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView");
   
  By sendlocation = By.id("com.google.android.gms:id/confirm_button");
  
  //send different location
  
  By searchfield = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.TextView");
  
  By searchdifferentloc = By.id("com.google.android.gms:id/edit_text");
  
  By selectfst = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView[1]");
  
 

   
	
	
	
	public sharelivlocation_page(AndroidDriver<MobileElement> driver) {
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

public MobileElement location_icon() {
	WaitForVisibility(location_icon);
	return driver.findElement(location_icon);
}

public MobileElement selclocation() {
	WaitForVisibility(selclocation);
	return driver.findElement(selclocation);
}

public MobileElement sendlocation() {
	WaitForVisibility(sendlocation);
	return driver.findElement(sendlocation);
}

public MobileElement searchfield() {
	WaitForVisibility(searchfield);
	return driver.findElement(searchfield);
}

public MobileElement searchdifferentloc() {
	WaitForVisibility(searchdifferentloc);
	return driver.findElement(searchdifferentloc);
}

public MobileElement selectfst() {
	WaitForVisibility(selectfst);
	return driver.findElement(selectfst);
}



}

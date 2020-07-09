package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class timerset_msgsend_page {

	
	public  AndroidDriver<MobileElement> driver;
	
	
	
	By timico = By.id("com.chatapp.android:id/capture_timer");
	
	//By setim = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]");
	
	
	By setim= By.xpath("//android.widget.CheckedTextView[@text='30 Seconds']");
    
	By msgfield = By.id("com.chatapp.android:id/chat_edit_text1");

	
	By senbtn = By.id("com.chatapp.android:id/enter_chat1");
	
    By timoff= By.xpath("//android.widget.CheckedTextView[@text='Off']");
	
	
	public timerset_msgsend_page(AndroidDriver<MobileElement> driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	 //Click contact and select any one
	public void WaitForVisibility(By e) {
		  WebDriverWait wait=new WebDriverWait(driver,10);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(e));
	  }

public MobileElement timer() {
	WaitForVisibility(timico);
		return driver.findElement(timico);
	}	
public MobileElement settime() {
	WaitForVisibility(setim);
	return driver.findElement(setim);
}
	
public MobileElement msgbox() {
	    WaitForVisibility(msgfield);
		return driver.findElement(msgfield);
	}

public MobileElement sendbutton() {
	 WaitForVisibility(senbtn);
	return driver.findElement(senbtn);
}

public MobileElement timoff() {
	 WaitForVisibility(timoff);
	return driver.findElement(timoff);
}

}

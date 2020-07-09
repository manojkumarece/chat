package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class sendaudios_page {

	
	public  AndroidDriver<MobileElement> driver;
	
	
	By imgicon = By.id("com.chatapp.android:id/attachment_icon");
	

	
	
    By audio_choose = By.id("com.chatapp.android:id/audio_choose");
   
    By selaudios = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.RelativeLayout");
    
	
    
	
	
	
	public sendaudios_page(AndroidDriver<MobileElement> driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	 //Click contact and select any one
	

	public void WaitForVisibility(By e) {
		  WebDriverWait wait=new WebDriverWait(driver,10);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(e));
	  }
	
	
public MobileElement imgicon() {
	    WaitForVisibility(imgicon);
		return driver.findElement(imgicon);
	}

public MobileElement audio_choose() {
	WaitForVisibility(audio_choose);
	return driver.findElement(audio_choose);
}

public MobileElement selaudios() {
	WaitForVisibility(selaudios);
	return driver.findElement(selaudios);
}



}

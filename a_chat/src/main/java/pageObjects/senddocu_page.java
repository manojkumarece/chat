package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class senddocu_page {

	
	public  AndroidDriver<MobileElement> driver;
	
	
	By imgicon = By.id("com.chatapp.android:id/attachment_icon");
	

	
	 
			
	        By docfile = By.id("com.chatapp.android:id/document_choose");
	        
	        By docat = By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"DOC\"]/android.widget.TextView");
	        
	        By seldoc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]");
	        
	
    
	
	
	
	public senddocu_page(AndroidDriver<MobileElement> driver) {
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

public MobileElement docfile() {
	WaitForVisibility(docfile);
	return driver.findElement(docfile);
}

public MobileElement docat() {
	WaitForVisibility(docat);
	return driver.findElement(docat);
}
public MobileElement seldoc() {
	WaitForVisibility(seldoc);
	return driver.findElement(seldoc);
}


}

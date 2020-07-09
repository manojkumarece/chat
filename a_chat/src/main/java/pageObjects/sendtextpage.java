package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class sendtextpage {

	
	public  AndroidDriver<MobileElement> driver;
	
	
	
	
    
	By msgfield = By.id("com.chatapp.android:id/chat_edit_text1");

	
	By senbtn = By.id("com.chatapp.android:id/enter_chat1");
	
	
	public sendtextpage(AndroidDriver<MobileElement> driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	 //Click contact and select any one
	
	public void WaitForVisibility(By e) {
		  WebDriverWait wait=new WebDriverWait(driver,10);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(e));
	  }
	
	
public MobileElement msgbox() {
	    WaitForVisibility(msgfield);
		return driver.findElement(msgfield);
	}

public MobileElement sendbutton() {
	WaitForVisibility(senbtn);
	return driver.findElement(senbtn);
}

}

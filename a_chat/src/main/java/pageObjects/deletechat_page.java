package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class deletechat_page {

	
	public  AndroidDriver<MobileElement> driver;
	
	
	
	
    
	By chatnames = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView");

	
	By deletechat= By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.LinearLayout/android.widget.TextView");
	
	By delete=By.id("com.chatapp.android:id/tvPositive");
	
	public deletechat_page(AndroidDriver<MobileElement> driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	 //Click contact and select any one
	
	public void WaitForVisibility(By e) {
		  WebDriverWait wait=new WebDriverWait(driver,10);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(e));
	  }
	
	
	public java.util.List<MobileElement> chatnames() {
		WaitForVisibility(chatnames);
		return driver.findElements(chatnames);
	}

	public MobileElement deletechat() {
		WaitForVisibility(deletechat);
			return driver.findElement(deletechat);
		}
	
	public MobileElement delete() {
		WaitForVisibility(delete);
			return driver.findElement(delete);
		}

}

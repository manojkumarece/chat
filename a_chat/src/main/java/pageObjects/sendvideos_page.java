package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class sendvideos_page {

	
	public  AndroidDriver<MobileElement> driver;
	
	
	By attachicon = By.id("com.chatapp.android:id/attachment_icon");
	

	
  

By vidofile_icon = By.id("com.chatapp.android:id/video_choose");

By vidcategory = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.ImageView");

By choosevideos = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView");

By select_videos = By.id("com.chatapp.android:id/fab");


By confirm = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageButton");

By sendbutton = By.id("com.chatapp.android:id/enter_chat1");

    
	
	
	
	public sendvideos_page(AndroidDriver<MobileElement> driver) {
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

public MobileElement vidofile_icon() {
	WaitForVisibility(vidofile_icon);
	return driver.findElement(vidofile_icon);
}

public MobileElement vidcategory() {
	WaitForVisibility(vidcategory);
	return driver.findElement(vidcategory);
}
public MobileElement select_videos() {
	WaitForVisibility(select_videos);
	return driver.findElement(select_videos);
}

public MobileElement choosevideos() {
	WaitForVisibility(choosevideos);
	return driver.findElement(choosevideos);
}
public MobileElement confirm() {
	WaitForVisibility(confirm);
	return driver.findElement(confirm);
}

public MobileElement sendbutton() {
	WaitForVisibility(sendbutton);
	return driver.findElement(sendbutton);
}

}

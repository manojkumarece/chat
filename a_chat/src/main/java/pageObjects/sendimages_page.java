package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class sendimages_page {

	
	public  AndroidDriver<MobileElement> driver;
	
	
	By imgicon = By.id("com.chatapp.android:id/attachment_icon");
	

	
	By imgchoose = By.id("com.chatapp.android:id/image_choose");
	
	By selcategory = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.ImageView");
	
	By seleimage = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView");
	
	By confirm = By.id("com.chatapp.android:id/fab");
	
	By conf = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageButton");
	
	By sendbutton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView");

	
	
	
    
	
	
	
	public sendimages_page(AndroidDriver<MobileElement> driver) {
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

public MobileElement imgchoose() {
	WaitForVisibility(imgchoose);
	return driver.findElement(imgchoose);
}

public MobileElement selcategory() {
	WaitForVisibility(selcategory);
	return driver.findElement(selcategory);
}
public MobileElement seleimage() {
	WaitForVisibility(seleimage);
	return driver.findElement(seleimage);
}
public MobileElement confirm() {
	WaitForVisibility(confirm);
	return driver.findElement(confirm);
}
public MobileElement conf() {
	WaitForVisibility(conf);
	return driver.findElement(conf);
}
public MobileElement sendbutton() {
	WaitForVisibility(sendbutton);
	return driver.findElement(sendbutton);
}

}

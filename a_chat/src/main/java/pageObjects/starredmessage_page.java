package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class starredmessage_page {

	
	public  AndroidDriver<MobileElement> driver;
	
	
	
	By contab = By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"CONTACTS\"]/android.widget.RelativeLayout/android.widget.TextView");
	
	By contactslist=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[1]");
	
	By selectstarredmsg=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup");
	
	By starredicon=By.id("com.chatapp.android:id/starred");
	
	By moreoptions=By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]");
	
	By starredmsgmenu=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
	
	public starredmessage_page(AndroidDriver<MobileElement> driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	 //Click contact and select any one
	
	public void WaitForVisibility(By e) {
		  WebDriverWait wait=new WebDriverWait(driver,10);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(e));
	  }
	
	
public MobileElement contacts() {
	WaitForVisibility(contab);
		return driver.findElement(contab);
	}

public java.util.List<MobileElement> contactslist() {
	WaitForVisibility(contactslist);
	return driver.findElements(contactslist);
}


public MobileElement selectstarredmsg() {
WaitForVisibility(selectstarredmsg);
	return driver.findElement(selectstarredmsg);
}

public MobileElement starredicon() {
WaitForVisibility(starredicon);
	return driver.findElement(starredicon);
}

public MobileElement moreoptions() {
WaitForVisibility(moreoptions);
	return driver.findElement(moreoptions);
}

public MobileElement starredmsgmenu() {
WaitForVisibility(starredmsgmenu);
	return driver.findElement(starredmsgmenu);
}

}

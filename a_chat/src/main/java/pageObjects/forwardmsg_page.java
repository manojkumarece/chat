package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class forwardmsg_page {

	
	public  AndroidDriver<MobileElement> driver;
	
	
	
	By contab = By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"CONTACTS\"]/android.widget.RelativeLayout/android.widget.TextView");
	
	By contactslist=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[1]");
	
	By selectmsgs=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup");
	
	By fwdicon=By.id("com.chatapp.android:id/forward");
	
	By replyicon=By.id("com.chatapp.android:id/replymess");
	
	By edittext=By.id("com.chatapp.android:id/chat_edit_text1");
	
	By enterchat=By.id("com.chatapp.android:id/enter_chat1");
	
	By deleteicon=By.id("com.chatapp.android:id/delete");
	
	By deleteforme=By.id("com.chatapp.android:id/tvforme");
	
	By selctfwdcont=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]");
	
	By sentbtn=By.id("com.chatapp.android:id/overlapImage");
	
	By moreoptions=By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]");
	
	By starredmsgmenu=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");

	By mute=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout");
	
	By mute_time=By.id("com.chatapp.android:id/rb1");
	
	By confirm=By.id("com.chatapp.android:id/ok");
	
	By clearchat=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout");
	
	By ok=By.id("com.chatapp.android:id/tvPositive");
	
	By usermenu=By.id("com.chatapp.android:id/usernamechatsceen");
	
	By block =By.id("com.chatapp.android:id/tv_block");
	
	By addfav=By.id("com.chatapp.android:id/iv_fav");
	
	public forwardmsg_page(AndroidDriver<MobileElement> driver) {
		// TODO Auto-generated

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


public MobileElement selectmsgs() {
WaitForVisibility(selectmsgs);
	return driver.findElement(selectmsgs);
}

public MobileElement fwdicon() {
WaitForVisibility(fwdicon);
	return driver.findElement(fwdicon);
}

public MobileElement replyicon() {
WaitForVisibility(replyicon);
	return driver.findElement(replyicon);
}

public MobileElement edittext() {
WaitForVisibility(edittext);
	return driver.findElement(edittext);
}


public MobileElement enterchat() {
WaitForVisibility(enterchat);
	return driver.findElement(enterchat);
}

public MobileElement deleteicon() {
WaitForVisibility(deleteicon);
	return driver.findElement(deleteicon);
}

public MobileElement deleteforme() {
WaitForVisibility(deleteforme);
	return driver.findElement(deleteforme);
}

public MobileElement selctfwdcont() {
WaitForVisibility(selctfwdcont);
	return driver.findElement(selctfwdcont);
}

public MobileElement sentbtn() {
WaitForVisibility(sentbtn);
	return driver.findElement(sentbtn);
}

public MobileElement moreoptions() {
WaitForVisibility(moreoptions);
	return driver.findElement(moreoptions);
}

public MobileElement starredmsgmenu() {
WaitForVisibility(starredmsgmenu);
	return driver.findElement(starredmsgmenu);
}

public MobileElement mute() {
WaitForVisibility(mute);
	return driver.findElement(mute);
}

public MobileElement mute_time() {
WaitForVisibility(mute_time);
	return driver.findElement(mute_time);
}

public MobileElement confirm() {
WaitForVisibility(confirm);
	return driver.findElement(confirm);
}

public MobileElement clearchat() {
WaitForVisibility(clearchat);
	return driver.findElement(clearchat);
}

public MobileElement ok() {
WaitForVisibility(ok);
	return driver.findElement(ok);
}


public MobileElement usermenu(){
WaitForVisibility(usermenu);
	return driver.findElement(usermenu);
}

public MobileElement block(){
WaitForVisibility(block);
	return driver.findElement(block);
}


public MobileElement addfav(){
WaitForVisibility(addfav);
	return driver.findElement(addfav);
}
}

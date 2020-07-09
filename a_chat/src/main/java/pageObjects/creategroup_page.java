package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class creategroup_page {

	
	public  AndroidDriver<MobileElement> driver;
	

	
	By moreoptions=By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]");
	
	By newgroupmenu=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout");
	
	By user1=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.TextView[1]");
	
	By user2=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.TextView[1]");
	
	By done=By.id("com.chatapp.android:id/doneButton");
	
	By groupname=By.id("com.chatapp.android:id/groupname");
	
	By created=By.id("com.chatapp.android:id/creategroup");
	
	By groupnames=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[1]");
	
	By exitgroup=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.LinearLayout/android.widget.TextView");
	
	By ok=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TextView[3]");
	
	
	
	By deletegroup=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.LinearLayout/android.widget.TextView");
	
	
	public creategroup_page(AndroidDriver<MobileElement> driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	 //Click contact and select any one
	
	public void WaitForVisibility(By e) {
		  WebDriverWait wait=new WebDriverWait(driver,10);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(e));
	  }
	

public MobileElement moreoptions() {
WaitForVisibility(moreoptions);
	return driver.findElement(moreoptions);
}

public MobileElement newgroupmenu() {
WaitForVisibility(newgroupmenu);
	return driver.findElement(newgroupmenu);
}

public MobileElement user1() {
WaitForVisibility(user1);
	return driver.findElement(user1);
}

public MobileElement user2() {
WaitForVisibility(user2);
	return driver.findElement(user2);
}

public MobileElement done() {
WaitForVisibility(done);
	return driver.findElement(done);
}

public MobileElement groupname() {
WaitForVisibility(groupname);
	return driver.findElement(groupname);
}

public MobileElement created() {
WaitForVisibility(created);
	return driver.findElement(created);
}

public java.util.List<MobileElement> groupnames() {
	WaitForVisibility(groupnames);
	return driver.findElements(groupnames);
}

public MobileElement exitgroup() {
WaitForVisibility(exitgroup);
	return driver.findElement(exitgroup);
}

public MobileElement deletegroup() {
WaitForVisibility(deletegroup);
	return driver.findElement(deletegroup);
}

public MobileElement ok() {
WaitForVisibility(ok);
	return driver.findElement(ok);
}

}

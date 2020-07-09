package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class Chathomepage {

	
	public  AndroidDriver<MobileElement> driver;
	
	
	
	By contab = By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"CONTACTS\"]/android.widget.RelativeLayout/android.widget.TextView");
	
	By usesel = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[3]");
	
	By chatlist=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/\r\n" + 
			"android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout/android.widget.RelativeLayout/\r\n" + 
			"android.widget.RelativeLayout/android.widget.TextView[1]");
	
	By lastmsgtime=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[2]");
	
	By callstab=By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc='CALLS']");
	
	By calllist=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[1]");
	
	By lastcalltime=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[2]");
	
	By contactslist=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[1]");
	
	By statusname=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[2]");
	
	By usermenu=By.id("com.chatapp.android:id/nameMAincontainer");
	
	By media=By.id("com.chatapp.android:id/media");
	
	By mediafst =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.GridView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView[1]");

    By documentstab=By.xpath("//android.support.v7.app.ActionBar.Tab[@content-desc=\"Documents\"]");
    
    By selectfstdoc=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout/android.widget.TextView[1]");
	
	public Chathomepage(AndroidDriver<MobileElement> driver) {
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

public java.util.List<MobileElement> statusname() {
	WaitForVisibility(statusname);
	return driver.findElements(statusname);
}

public MobileElement selecont() {
	WaitForVisibility(usesel);
	return driver.findElement(usesel);
}

public java.util.List<MobileElement> chatlist() {
	WaitForVisibility(chatlist);
	return driver.findElements(chatlist);
}

public java.util.List<MobileElement> lastmsgtime() {
	WaitForVisibility(lastmsgtime);
	return driver.findElements(lastmsgtime);
}

public MobileElement callstab() {
	WaitForVisibility(callstab);
		return driver.findElement(callstab);
	}

public java.util.List<MobileElement> calllist() {
	WaitForVisibility(calllist);
	return driver.findElements(calllist);
}

public java.util.List<MobileElement> lastcalltime() {
	WaitForVisibility(lastcalltime);
	return driver.findElements(lastcalltime);
}

public MobileElement usermenu() {
	WaitForVisibility(usermenu);
		return driver.findElement(usermenu);
	}

public MobileElement media() {
	WaitForVisibility(media);
		return driver.findElement(media);
	}

public MobileElement mediafst() {
	WaitForVisibility(mediafst);
		return driver.findElement(mediafst);
	}


public MobileElement documentstab() {
	WaitForVisibility(documentstab);
		return driver.findElement(documentstab);
	}

public MobileElement selectfstdoc() {
	WaitForVisibility(selectfstdoc);
		return driver.findElement(selectfstdoc);
	}

}

package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class pinnumbpage {

	
	public  AndroidDriver<MobileElement> driver;
	
	By pinenter=By.className("android.widget.EditText");
    By title = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView");
	
	
	
	public pinnumbpage(AndroidDriver<MobileElement> driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void WaitForVisibility(By e) {
		  WebDriverWait wait=new WebDriverWait(driver,10);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(e));
	  }
	 	  

	public MobileElement enterpin() {
		WaitForVisibility(pinenter);
		return driver.findElement(pinenter);
	}
	
public MobileElement gettitle() {
	    WaitForVisibility(title);
		return driver.findElement(title);
	}
}

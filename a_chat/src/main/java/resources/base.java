package resources;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import java.net.URL;
import java.util.Properties;


import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import pageObjects.pinnumbpage;

public class base {
	
	public  AndroidDriver<MobileElement> driver;
	public static Logger log =LogManager.getLogger(base.class.getName());
	
	public  Properties prop;
	 
	
	public AndroidDriver<MobileElement> intilizeDriver() throws IOException {
		
		try {
		//Intilize and device details added
		
		 prop=new Properties();
		 FileInputStream fis=new FileInputStream("C:\\Users\\Splpt244\\eclipse-workspace\\a_chat\\src\\main\\java\\resources\\data.properties");	
		 prop.load(fis);
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("deviceName", prop.getProperty("devicename"));
		desiredCapabilities.setCapability("platformName", "android");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		desiredCapabilities.setCapability("newCommandTimeout", "4000");
		desiredCapabilities.setCapability("appPackage",prop.getProperty("packagename") );
		desiredCapabilities.setCapability("appActivity",prop.getProperty("activityname") );
		
		//desiredCapabilities.setCapability("autoGrantPermissions",true);
		desiredCapabilities.setCapability("noReset", true);
		
		desiredCapabilities.setCapability("skipDeviceInitialization", true);
		desiredCapabilities.setCapability("skipServerInstallation", true);
		desiredCapabilities.setCapability("ignoreUnimportantViews", true);
		
		URL remoteUrl = new URL("http://localhost:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(remoteUrl, desiredCapabilities);
		

		pinnumbpage lp=new pinnumbpage(driver);
		lp.enterpin().sendKeys(prop.getProperty("pinnumber"));
		log.info("Enter new pin");
		lp.enterpin().sendKeys(prop.getProperty("pinnumber"));
		log.info("Enter confirm pin");
		
		
		

		}
		  catch(Exception e) {
			  e.printStackTrace();
		  }
		 return driver;
	}
	
	public void WaitForVisibility(MobileElement e) {
		  WebDriverWait wait=new WebDriverWait(driver,10);
		  wait.until(ExpectedConditions.visibilityOf(e));
	  }
	  
	  public void click(MobileElement e) {
		  WaitForVisibility(e);
		  e.click();
	  }
	  
	  public void sendKeys(MobileElement e,String txt) {
		  WaitForVisibility(e);
		  e.sendKeys(txt);
	  }
	  
	  public String getAttribute(MobileElement e,String attribute) {
		  WaitForVisibility(e);
		  return e.getAttribute(attribute);
		  
	  }

	
	public String getScreenShotPath(String testCaseName,AndroidDriver<MobileElement> driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(source,new File(destinationFile));
		return destinationFile;


	}
	
	

}

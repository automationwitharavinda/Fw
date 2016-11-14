package Get;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class GetFreeMinutes {
 	AppiumDriver driver;
	
	@SuppressWarnings("rawtypes")
	@Test
	public void launchApp() throws MalformedURLException{
		 	 
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "GT-I9192");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "5.0.2");
		cap.setCapability("appPackage", "com.sec.android.app.launcher");
		cap.setCapability("appActivity", "com.android.launcher2.Launcher");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserType.CHROME); 
		File file = new File("D:\\Android_Dev\\Get\\Apk\\com.astpl.madcall.apk");
		cap.setCapability("--app", file.getAbsolutePath());
		//192.168.1.100
		 driver = new AndroidDriver(new URL("http://192.168.11.175:4723/wd/hub"), cap);
		 driver.findElementByAccessibilityId("");
		
		 
	}

}

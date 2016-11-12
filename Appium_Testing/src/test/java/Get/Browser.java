package Get;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 

public class Browser {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
	 
	 driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.co.in/");
		String title = driver.getTitle();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Links----->" + links);
		for (Iterator<WebElement> iterator = links.iterator(); iterator.hasNext();) {
			WebElement webElement = (WebElement) iterator.next();
		//	System.out.println(webElement.getSize());
			System.out.println(webElement.getText().trim().replace("", "---"));
		//	System.out.println(iterator.next().getText());;
			
		}
		System.out.println(title);
		driver.close();
		
	}

}

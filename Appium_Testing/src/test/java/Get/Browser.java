package Get;
import org.openqa.selenium.WebDriver;
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
		
		System.out.println(title);
		driver.close();
		
	}

}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =  new FirefoxDriver();
		
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.co.in/");
		
		
		
	}

}

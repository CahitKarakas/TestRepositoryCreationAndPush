import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelPro {

	public static void main(String[] args) {
		System.out.println("Test");
		
		System.setProperty("webdriver.chrome.driver","/Users/cahitkarakas/Documents/SeleniumDependencies/drivers/chromedriver" );
		
		WebDriver driver = new ChromeDriver() ;
		
		driver.get("http://www.google.com");
		
		System.out.println(driver.getPageSource());
		
		driver.close(); 
		
	}
}

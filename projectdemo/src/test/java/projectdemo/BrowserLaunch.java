package projectdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BrowserLaunch {
	
	private static WebDriver driver;
	
	@Test
	public static void browserLaunch() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "Browsers/chromedriver.exe");
		
		
		
		driver = new ChromeDriver();
		driver.get("https://www.orangecrm.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
	}
	
	@Test
	public static void browserQuit() throws Exception {
		
		driver.quit();
		
		System.out.println("Browser closed");
	}
}

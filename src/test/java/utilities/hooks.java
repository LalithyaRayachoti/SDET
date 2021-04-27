package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {
	public static WebDriver driver;
	
	@Before
	public void beforeScenario() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RayachotiLalithya\\Documents\\lalithya\\selenium\\Selenium\\chromedriver_win32\\chromedriver.exe");
		System.out.println("this will run before the scenario");
		WebDriver driver = new ChromeDriver();
	}
	
	@After
	public 	static void afterScenario() {
		System.out.println("this will run after the scenario");
		driver.quit();
	}

}

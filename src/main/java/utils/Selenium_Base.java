package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import applicationProperties.properties;


public class Selenium_Base {
	static WebDriver driver;
	static JavascriptExecutor executor;
	static WebDriverWait wait;


	public static void Selenium_config(String URL) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"/src/main/resources/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
//		options.addArguments("user-data-dir=C:/Users/moham/AppData/Local/Google/Chrome/User Data");
		driver = new ChromeDriver(options);
		
		//URL
		driver.navigate().to(URL);

		executor = (JavascriptExecutor) driver;
		wait = new WebDriverWait(driver, 60);
		driver.manage().window().maximize();
	}

	
	public static WebDriver getChromeDriver() {
		return driver;
	}
	
	
	public static JavascriptExecutor getJavascriptExecutor() {
		return executor;
	}
	
	
	public static WebDriverWait getWebDriverWait() {
		return wait;
	}

	
	public void close() {
		driver.quit();
	}
	
	
	


}
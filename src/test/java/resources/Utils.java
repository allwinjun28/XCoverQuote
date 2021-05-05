package resources;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.Elements;

public class Utils {
	public static WebDriver driver = null;
	protected WebDriverWait wait;
	protected Elements el;
	
	public void openBrowser()
	{
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\xarn7\\Documents\\Software\\rest assu\\chromedriver_win32\\chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options); 
		el=new Elements(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		wait = new WebDriverWait(driver,30);
		
		
	}
		
      

	
}

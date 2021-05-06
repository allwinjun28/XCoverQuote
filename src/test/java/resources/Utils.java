package resources;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.HomePage;
import objectRepository.InsuranceTypePage;

public class Utils {
	public static WebDriver driver = null;
	protected WebDriverWait wait;
	
	
	
	public void openBrowser()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options); 		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver,30);
				
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
	
	public void takeScreenShot(WebDriver driver) throws IOException
	{
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		String Path=System.getProperty("user.dir")+"\\Screenshots\\screen.png";
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File(Path);
		FileUtils.copyFile(SrcFile, DestFile);
	}
		
      

	
}
